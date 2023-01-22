package com.training.collections;

import java.util.Comparator;

import com.training.oops.Employee;

public class MyNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		
		return o1.getName().compareTo(o2.getName());
	}

}
