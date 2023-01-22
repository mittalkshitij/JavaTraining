package com.training.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyList {
	
	public static void main(String[] args) {
		
		MyList.myArrayList();
	}
	
	public static void myArrayList() {
		
//		List list=new ArrayList();
		
		List<String> list= new ArrayList<String>();
		list.add("Ram");
		list.add("Sham");
		list.add("Raj");
		list.add("Asha");
//		list.add(10);
//		list.add('A');
		
		System.out.println(list);
		
		System.out.println("Using For loop");
		
		for(int i=0;i<list.size();i++) {
			
			String name=list.get(i);
			
			System.out.println(name);
		}
		
		System.out.println("Using Advance For loop");
		
		for(String name:list) {
			System.out.println(name);
		}
		
		System.out.println("Using Iterator");
		
		Iterator<String> itr=list.iterator();
		
		while(itr.hasNext()) {
			
			String name=itr.next();
			System.out.println(name);
		}
		
		System.out.println("Using List Iterator");
		
		ListIterator litr= list.listIterator();
		
		while(litr.hasNext()) {
			
			String name=(String) litr.next();
			System.out.println(name);
		}
		
		System.out.println("Using List Iterator Reverse order");
		
		while(litr.hasPrevious()) {
			
			String name=(String) litr.previous();
			System.out.println(name);
		}
		
		Collections.sort(list);
		
		
		System.out.println(list);
		
		
		
	}
	
}
