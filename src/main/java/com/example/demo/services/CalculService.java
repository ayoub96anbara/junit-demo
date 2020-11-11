package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculService {

	@Autowired
	private SumService sumService;
	@Autowired
	private SubstractionService subService;
	
	public int calcul(int a,int b) {
		 //   17 = 15 2
		int sumAB = sumService.sum(a, b);
		//     19   = 17 2
		int sumB_AB =sumService.sum(sumAB, b);
		//  -1    = 17 , 19
		int sub= subService.substraction(sumAB, sumB_AB);
		return sub;
	}
}
