package com.example.demo.services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SubstractionServiceTest {
	
	@Autowired
	SubstractionService subService ;
	@Test
	public void when_call_substraction_with_unnormal_case() {
		int res= subService.substraction(2, 4);
		assertEquals(-1, res);
	}
	
	@Test
	public void when_call_substraction_with_normal_case() {
		int res= subService.substraction(7, 5);
		assertEquals(2,res);
	}

}
