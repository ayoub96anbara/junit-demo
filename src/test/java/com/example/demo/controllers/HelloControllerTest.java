package com.example.demo.controllers;

import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class HelloControllerTest {

     MockMvc mockMvc;
	HelloController controller;
	
	@Test
	public void check_say_hello() throws Exception {
		
		mockMvc.perform(
				MockMvcRequestBuilders.get("/sayHello")
				.accept(MediaType.APPLICATION_JSON)
				.contentType(MediaType.APPLICATION_JSON)
				
				).andExpect(status().is(200))
		.andExpect(jsonPath("$.message").value("hello"))
		;
		
		
	//	assertTrue("verification say hello", controller.sayHello().equals("hello"));
	}
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		controller=new HelloController();
		mockMvc=MockMvcBuilders.standaloneSetup(controller).build();
		
	}
}
