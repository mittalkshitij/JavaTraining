package com.training.collections;

import java.util.Comparator;

import com.training.oops.Employee;

public class MySalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		
		if(emp1.getSalary()> emp2.getSalary())
			return 1;
		else if(emp1.getSalary() < emp2.getSalary())
			return -1;
		else
			return 0;

	
	}

}
