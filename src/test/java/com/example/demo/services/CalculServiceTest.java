package com.example.demo.services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


// version 1 without using Mockito
 @RunWith(SpringRunner.class)
 @SpringBootTest
public class CalculServiceTest {

	@Autowired
	CalculService calculService; 
	
	@Test
	public void call_calcul() {
		int res= calculService.calcul(15, 2);
		assertEquals(-1, res);
	}
}
  
  
 
