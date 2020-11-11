package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("sayHello")
	public Response sayHello() {
		Response resp=new Response();
		resp.setMessage("hello");
		return resp;
	}
}

class Response{
private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

}
