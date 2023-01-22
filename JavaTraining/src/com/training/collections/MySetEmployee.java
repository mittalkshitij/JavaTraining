package com.training.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.training.oops.Employee;

public class MySetEmployee {
	
	public static void main(String[] args) {
		
		myEmployeeSet();
	}
	
	public static void myEmployeeSet() {
		
		Employee emp1=new Employee(101,"kshitij",50);
		Employee emp2=new Employee(102,"atharva",30);
		Employee emp3=new Employee(103,"harshit",70);
		Employee emp4=new Employee(103,"harshit",70);
		
		//Set<Employee> set=new HashSet<Employee>();
		Set<Employee> set=new TreeSet<Employee>();
		set.add(emp1);
		set.add(emp2);
		set.add(emp4);
		set.add(emp3);
		
		System.out.println(set);
	}

}
