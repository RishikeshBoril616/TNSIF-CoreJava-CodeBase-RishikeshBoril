package com.TNSIF.Day5.hierarchicalInheritance;

public class person {
	private String name;
	private String city;
	
	//Default Constructor 
	public person() {
		System.out.println("person class default value constructor ");
		name="Peter";
		city="New York";
	}

	public person(String name, String city) {
	
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}
}
