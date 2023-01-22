package com.training.oops;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		
		emp1.setData(1,"Kshitij",50);
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.seteId(2);
		emp2.setName("Harshit");
		emp2.setSalary(30);
		emp2.display();
		
		Employee emp3=new Employee(3,"Atharva",40);
		emp3.display();
		

	}

}
