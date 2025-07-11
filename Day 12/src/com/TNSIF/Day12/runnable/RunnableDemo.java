package com.TNSIF.Day12.runnable;

public class RunnableDemo 
{
	public static void main(String[] args) 
	{
		
	Runnable r=new UsingRunnable(10,1,"Hii");
	Thread t1= new Thread (r);
	t1.start();
		
//	Runnable r1=() -> System.out.println("runnable with lambda expression");
//	new Thread (r1).start();
	}

}
