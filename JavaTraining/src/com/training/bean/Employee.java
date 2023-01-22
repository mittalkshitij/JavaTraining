package com.training.bean;


public class Employee {

private int eId;
private String name;
private double salary;
private Department department;

public Employee(Department department) // Non-Parameterized Constructor
{
	this.department=department;
	System.out.println("Non-Prameterized Constructor");
}

public Employee(int eId, String name, double salary)  // Parameterized Constructor
{
	this.eId=eId;
	this.name=name;
	this.salary=salary;
}

public void setData(int eId, String name, double salary) {
	
	this.eId=eId;
	this.name=name;
	this.salary=salary;
	}

public void display() {
	
	System.out.println(eId+" "+name+" "+ salary);
}

public int geteId() {
	return eId;
}

public void seteId(int eId) {
	this.eId = eId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public String toString()
{
	return eId+ " "+ name +" "+salary;  // String representation of class
}
		

}

