package com.TNSIF.Day5.HierarchicalInheritance;

public class employee extends person{
	
	//data members
	private int empId;
	private float salary;
	private String dept;
	
	
	public employee() {
	System.out.println("employee class default constructor ");
	empId=101;
	salary=300000f;
	dept="IT";
	}


	public employee(String name, String city,int empId, float salary, String dept) {
		super( name,  city);
		this.empId = empId;
		this.salary = salary;
		this.dept = dept;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", dept=" + dept + ", getName()=" + getName()
				+ ", getCity()=" + getCity() + "]";
	}
	
}
