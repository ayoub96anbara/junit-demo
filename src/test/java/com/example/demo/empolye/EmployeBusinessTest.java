package com.example.demo.empolye;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.demo.helpers.Employe;
import com.example.demo.helpers.EmployeBusiness;

public class EmployeBusinessTest {

	EmployeBusiness eBusiness=new EmployeBusiness();;
	Employe em = new Employe("youness", 60000);

	@Test
	public void when_call_monthly_sallary_expect_well() {
		
		double salaryM = eBusiness.calculateSalary(em);
		assertEquals(Double.parseDouble("720000") , salaryM,0.0);
	}
	
	@Test
	public void when_call_calculIIR_with_salary60_000_expect_well() {
		double iir=eBusiness.calculIIR(em);
		assertTrue( "verification du calcul IIR>27", iir>27);
	}
	@Test
	public void when_call_calculIIR_with_salary4_000_expect_well() {
		Employe e = new Employe("amine", 4000);
		double iir=eBusiness.calculIIR(e);
		assertTrue("verification du calcul IIR=27",iir==27);
	}
	
}
