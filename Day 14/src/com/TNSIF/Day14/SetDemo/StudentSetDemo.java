package com.TNSIF.Day14.SetDemo;

import java.util.HashSet;
import java.util.Set;

public class StudentSetDemo 
{
	public static void main(String[] args) 
	{
		Set<Student> set=new HashSet<Student>();
		set.add(new Student (101,"Rishikesh", 45.09));
		set.add(new Student (102,"Luffy", 69.69));
		set.add(new Student (103,"Zorro", 78.02));
		set.add(new Student (102,"Luffy", 69.69)); //duplicate
		set.add(new Student (103,"Luffy", 90.69));
		
		System.out.println(set);
	}

}
