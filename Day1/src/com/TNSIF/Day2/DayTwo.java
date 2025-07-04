package com.TNSIF.Day2;

public class DayTwo 
{
public static void main(String[] args) 
{
	int value1 = 9/2; //integer division
	System.out.println(value1);
	
	float value2 = 101f/61f;
	System.out.println(value2);
	
	double value3 = 10d/6d;
	System.out.println(value3);
	
	int radius = 10;
	double percentage = 3.14 * radius * radius;
	System.out.println("Area of Circle = "+ percentage);
	
	int name = 'A';
	System.out.println(name);
	
	int name1 = 'a';
	System.out.println(name1);
	
	char name3 = '\u20AC';
	System.out.println(name3);
	
	char name4 = '\u00AC';
	System.out.println(name4);
	
	//Primitive data types for the numbers: byte, bit=8
	
	// byte---1 byte
	byte bytemax = 127;
	byte bytemin= -128;
	
	/*
	To get the range of a primitive data type, we use a formula which is: 
				(2^(byte of the chosen data type * 8))/2,
	this gives us the negative range while that value minus one gives us the positive range. 
	we have two examples here byte and integer.
	*/ 
	
	//int ===4 bytes
	int maxint= 214783647;
	int minint= -214783648;
	
	/*
		| Type      | Size             | Range (Minimum to Maximum)                              |
		| --------- | ---------------- | ------------------------------------------------------- |
		| `byte`    | 1 byte (8-bit)   | -128 to 127                                             |
		| `short`   | 2 bytes (16-bit) | -32,768 to 32,767                                       |
		| `int`     | 4 bytes (32-bit) | -2,147,483,648 to 2,147,483,647                         |
		| `long`    | 8 bytes (64-bit) | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
		| `float`   | 4 bytes          | \~ ±3.4e38 (7 decimal digits precision)                 |
		| `double`  | 8 bytes          | \~ ±1.8e308 (15 decimal digits precision)               |
		| `char`    | 2 bytes (16-bit) | 0 to 65,535 (or `\u0000` to `\uffff`)                   |
		| `boolean` | 1 bit            | Only `true` or `false`                                  |

	 */
	
	/*
	Type Casting is the next topic.
	That is converting one data type to another. We have two in particular: Narrowing and Widening.
	Widening is also known as implicit type casting. While the other is explicit type casting which is forceful and data loss is possible
	in the narrowing.
	*/
	//Widening example
	
	byte b=10;
	int i=b;
	System.out.println(i);
	
	//Narrowing Example
	
	double fl=10.52f;
	long ll=(long) fl;
	
	System.out.println(ll);
	
	long l2= 9688065121L;
	int il2=(int)l2;
	System.out.println(il2);
	
	//Control Statements are the next topic.
	
	int x=4;
	if(x==4)
		System.out.println("Value is x is 4");
	
}
}
