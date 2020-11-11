package com.example.demo.helpers;

public class Employe {

	private String nom;
	private double salaireM;
	public Employe(String nom, double salaireM) {
		super();
		this.nom = nom;
		this.salaireM = salaireM;
	}
	public Employe() {
		super();
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getSalaireM() {
		return salaireM;
	}
	public void setSalaireM(double salaireM) {
		this.salaireM = salaireM;
	}
	
	
}
