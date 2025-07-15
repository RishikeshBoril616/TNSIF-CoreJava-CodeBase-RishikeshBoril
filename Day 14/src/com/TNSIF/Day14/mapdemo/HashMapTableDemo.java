package com.TNSIF.Day14.mapdemo;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;

public class HashMapTableDemo 
{
	public static void main(String[] args) 
	{
		
		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		ht.put(101, "Mumbai");
		ht.put(102, "New Mumbai");
		ht.put(103, "Pune");
		ht.put(101, "New York");
		ht.put(104, "New Mumbai");
		
		System.out.println(ht);
		
		ht.putIfAbsent(105, "NYPC");
		ht.put(101, "California");
		
		System.out.println(ht);
		
		//ht.put(null, "New Jersey");
		System.out.println(ht);
		
		System.out.println(ht.get(103));
		
		System.out.println(ht.replace(102, "Texas"));
		System.out.println(ht);
		
		ht.clone();
		System.out.println(ht);
		
		Set s=ht.keySet();
		System.out.println(s);
		Collection<String> c=ht.values();
		System.out.println(c);
		
	}

}
