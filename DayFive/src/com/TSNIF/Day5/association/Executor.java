package com.TSNIF.Day5.association;

public class Executor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address address=new Address("Aashirvaad Apartment", "Pune", "Maharashtra", "4110001");
	
	
		Person p=new Person("Rishikesh", address);
		p.displayInfo();
		System.out.println(p);
	
	
	
	}
}
