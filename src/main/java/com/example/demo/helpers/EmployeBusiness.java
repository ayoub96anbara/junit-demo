package com.example.demo.helpers;

public class EmployeBusiness {

	// calcul le salaire annuel
	public double calculateSalary(Employe e) {
		double salaire = 0;
		salaire = e.getSalaireM() * 12;
		return salaire;
	}
	// calcul impot
	public double calculIIR(Employe e) {
		double iir = 0;
		if (e.getSalaireM() < 5000) {
			iir = 27;
		} else {
			iir = 38;
		}
		return iir;
	}

} 
