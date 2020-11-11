package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class SubstractionService {

	public int substraction(int a,int b) {
		return a>=b ? a-b : -1;
	}
}
