package com.TNSIF.Day7.overriding;

public class OverRidingDemo {
	public static void main(String[] args) {
		
		RBI rbi;
		//Dynamic Binding assigning child object to parent class reference variable
		
		rbi=new SBI();
		System.out.println(rbi.getRateofInterest());
		
		rbi=new ICICI();
		System.out.println(rbi.getRateofInterest());
		
		rbi=new HDFC();
		System.out.println(rbi.getRateofInterest());
		
				
	}

}
