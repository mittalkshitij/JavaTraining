package com.training.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.training.oops.Employee;

public class MyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//myHashMap();
		//myHashMap1();
		myHashMapEmployee();

	}
	
	public static void myHashMap() {
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(101,"Pune");
		map.put(102,"Mumbai");
		map.put(103,"Chennai");
	
		Set set = map.entrySet(); // Converting to set so that we can traverse
	
		Iterator itr=set.iterator();
		
		while(itr.hasNext()) {
			
			Map.Entry entry =(Map.Entry)itr.next();		
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
	}
	
	public static void myHashMap1(){
		
		Map<Integer,String> map=new TreeMap<Integer,String>();
		
		map.put(101,"Pune");
		map.put(102,"Mumbai");
		map.put(103,"Chennai");
		
		Set<Integer> set=map.keySet();
		
		for(Integer key: set) {
			
			String value=map.get(key);
			
			System.out.println(key+" "+value);
		}
		
	}
	
	
	public static void myHashMapEmployee() {
		
		Employee emp1=new Employee(101,"kshitij",50);
		Employee emp2=new Employee(102,"atharva",30);
		Employee emp3=new Employee(103,"harshit",70);
		Employee emp4=new Employee(104,"tanya",20);
		
		Map<Employee,String> map=new TreeMap<Employee,String>();
		map.put(emp1,"Pune");
		map.put(emp2,"Pune");
		map.put(emp3,"Chandigarh");
		map.put(emp4,"Ghaziabad");
		

		
		Set<Employee> set=map.keySet();
		
		for(Employee key: set) {
			
			String value=map.get(key);
			
			System.out.println(key+" "+value);
		}
		
	
		
	}

}
