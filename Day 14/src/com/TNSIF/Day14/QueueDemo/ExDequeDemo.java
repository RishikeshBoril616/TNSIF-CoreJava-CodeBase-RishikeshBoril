package com.TNSIF.Day14.QueueDemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExDequeDemo 
{
	public static void main(String[] args) 
	{
		Deque<String> deque1=new ArrayDeque<String>();
		deque1.add("Rishikesh");
		deque1.add("Gojo Satoru");
		deque1.add("Yuji Itadori");
		deque1.add("Nobara Kugisaki");
		deque1.add("Megumi Fushiguro");
		
		System.out.println(deque1);
		
		deque1.pollLast();
		System.out.println(deque1);
		
		deque1.pollFirst();
		System.out.println(deque1);
		
		for(String str: deque1)
		{
			System.out.println("Queue is: "+ str);
		}
		
		System.out.println(deque1);
	}
}
