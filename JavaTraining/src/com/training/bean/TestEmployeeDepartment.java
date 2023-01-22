package com.training.bean;

public class TestEmployeeDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Employee and Department has-A relationship and depicts Aggregation
		// Aggregation- two classes can exist without each other
		// they are loosely bound
		
		Department department=new Department();
		department.setDid(1001);
		department.setDept_name("Techincal");
		Employee emp=new Employee(department);
		emp.seteId(1);
		emp.setName("Kshitij");
		emp.setSalary(50);
		
		System.out.println("Department ID : "+ department.getDid());
		System.out.println("Department Name : "+department.getDept_name());
		System.out.println("Employee ID : "+emp.geteId());
		System.out.println("Employee Name : "+emp.getName());
		System.out.println("Employee Salary : "+emp.getSalary());
		
		

	}

}
