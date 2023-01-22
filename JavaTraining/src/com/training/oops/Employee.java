package com.training.oops;

import java.util.Objects;

public class Employee implements Comparable<Employee>{

private int eId;
private String name;
private double salary;

public Employee() // Non-Parameterized Constructor
{
	
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

@Override
public int hashCode() {
	
	System.out.println("In Hash Code");
	return Objects.hash(eId, name, salary);
}

@Override
public boolean equals(Object obj) {
	
	System.out.println("In Equal");
	
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return eId == other.eId && Objects.equals(name, other.name)
			&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
}

@Override
public int compareTo(Employee o) {
	
	if(salary> o.salary)
		return 1;
	else if(salary< o.salary)
		return -1;
	else
		return 0;
	

}
		

}
