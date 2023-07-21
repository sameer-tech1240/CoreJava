package com.assosiation;

public class Aggri_Gation2 {
	Aggri_Gation aggri_Gation;
	String pass;

	public Aggri_Gation2(Aggri_Gation aggri_Gation, String pass) {
		this.aggri_Gation = aggri_Gation;
		this.pass = pass;
	}

	void print() {
		System.out.println("Employee Name : " + aggri_Gation.name + "\nEmployee City : " + aggri_Gation.city
				+ "\nEmployee Id : " + aggri_Gation.id + "\nEmployee Password : " + pass);
	}

}
