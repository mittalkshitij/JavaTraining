package com.training.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.training.oops.Employee;

public class MyListEmployeeSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myListSorting();

	}
	
	public static void myListSorting() {
		
		Employee emp1=new Employee(101,"kshitij",50);
		Employee emp2=new Employee(102,"atharva",30);
		Employee emp3=new Employee(103,"harshit",70);
		Employee emp4=new Employee(104,"tanya",20);
		
		List<Employee> list=new ArrayList<Employee>();
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
		Collections.sort(list, new MySalaryComparator());
		
		for(Employee emp: list) {
			
			System.out.println(emp);
		}
		
		Collections.sort(list, new MyNameComparator());
		
		for(Employee emp: list) {
			
			System.out.println(emp);
		}
	}

}
