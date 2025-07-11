package com.TNSIF.Day12.multithreading;

public class Demo 
{
	public static void main(String[] args) 
	{
		
		Thread myThread=new ThreadLifeCycleDemo();
		
		System.out.println("Before Runnable State Thread is alive or not? " + myThread.isAlive());
		
		myThread.start();
		
		try
		{
			Thread.sleep(450);
		}
		catch(InterruptedException e)
		{
			System.err.println(e.getMessage());
		}
		System.out.println("After completetion exectution, is it alive or not?" + myThread.isAlive());
	}

}
