package com.training.pracprograms;

import java.util.Scanner;

class Employee {
	
	int eId;
	private String name;
	private int salary;
	private String company;
	
	
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	

	public void getInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Employee ID : ");
		eId=sc.nextInt();
		System.out.println("Enter your Name : ");
		name=sc.next();
		System.out.println("Enter your Salary : ");
		salary=sc.nextInt();
		System.out.println("Enter your Company : ");
		company=sc.next();
		System.out.println("-----------------------------");
	}
	
	public void display() {
		  
		  System.out.println("Employee id = " + eId);
		  System.out.println("Employee name = " + name);
		  System.out.println("Employee salary = " + salary);
		  System.out.println("Employee company = " + company);
		  System.out.println("-----------------------------");
		  
		 }
	
	public static void main(String[] args) {
		
		Employee e[]=new Employee[4];
		
		for(int i=0;i<4;i++)
		{
			e[i]=new Employee();
			e[i].getInput();
		}
		
		
		//DISPLAY EMPLOYEE RECORDS HAVING SALARY GREATER THAN 50'
		
		for(int i=0;i<4;i++)
		{
			if(e[i].getSalary()>50)
				e[i].display();
		}
		
	}
	
	
}
