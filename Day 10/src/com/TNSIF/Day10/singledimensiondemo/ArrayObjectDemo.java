package com.TNSIF.Day10.singledimensiondemo;

public class ArrayObjectDemo {

	public static void main(String[] args) {
		
		//Student s=new Student(0, null)
		Student [] arr;
		
		//declared memory for 5 object or type students
		
		arr=new Student[5];
		
		arr[0] = new Student(101, "Rishikesh");
		arr[1] = new Student(102, "Peter");
		arr[2] = new Student(103, "Tony");
		arr[3] = new Student(104, "Jonathan");
		arr[4] = new Student(105, "Natasha");
		//arr[5] = new Student(106, "Yelena");
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Elemnts at"+ i+": "
		+arr[i].getRollNo()+"\t"+arr[i].getName());
		}

	}

}