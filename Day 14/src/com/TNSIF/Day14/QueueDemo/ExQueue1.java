package com.TNSIF.Day14.QueueDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExQueue1 
{
	public static void main(String[] args) 
	{
	Queue<Integer> r=new LinkedList<Integer>();
	
	r.add(6);
	r.add(10);
	r.add(12);
	r.add(13);
	r.add(2);
	
	System.out.println(r);
	
	int positionPeer=r.peek();
	System.out.println("Using Peek Method First Value From the Queue: "+ r);
	
	int positionelements=r.element();
	System.out.println("Using Peek Method First Value From the Queue: "+ r);
	
	System.out.println();
	System.out.println(r.remove(r));
	System.out.println(r);
	
	Iterator itr=r.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next()+"\t");
	}
	System.out.println();
	
	System.out.println(r.poll());
	System.out.println(r);
	
	System.out.println(r.retainAll(r));
	}
}
