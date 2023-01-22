package com.training.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.training.oops.Employee;

public class MyStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1=new Employee(101,"kshitij",50);
		Employee emp2=new Employee(102,"atharva",30);
		Employee emp3=new Employee(103,"harshit",70);
		Employee emp4=new Employee(104,"tanya",20);
		
		List<Employee> list=new ArrayList<Employee>();
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
		List<Double> salaryList= list.stream()
				.filter(emp->emp.getSalary()>60)
				.map(emp->emp.getSalary())
				.collect(Collectors.toList());
		
		System.out.println(salaryList);
		
		List<Integer> number= Arrays.asList(8,2,3,4,5);
		List<Integer> sq= number.stream()
				.sorted()
				.map(x->x*x)
				.collect(Collectors.toList());
		
		System.out.println(sq);
	}

}
