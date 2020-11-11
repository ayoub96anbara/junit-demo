package com.example.demo.services;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.ArgumentMatchers.anyInt;
@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class MockitoCalculServiceTest {

	@InjectMocks
	CalculService calculService;
	
	@Mock
	SumService sumService;
	@Mock
	SubstractionService subService;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	
	@Test
	public void call_calcul() {
		
		Mockito.when(sumService.sum(15, 2)).thenReturn(17);
		Mockito.when(sumService.sum(17,2)).thenReturn(19);
	    Mockito.when(subService.substraction(17, 19)).thenReturn(-1);
		//Mockito.when(subService.substraction(anyInt(),anyInt())).thenReturn(-1);
		
		int res= calculService.calcul(15, 2);
		assertEquals(-1, res);
	}
}



