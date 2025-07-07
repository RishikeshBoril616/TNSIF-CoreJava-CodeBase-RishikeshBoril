package com.TNSIF.Day7.overriding;

public class SBI extends RBI{
	
	public float getRateofInterest()
	{
		System.out.println("Base rate of interest of home loans.");
		
		return 7.0f;
	}
}
