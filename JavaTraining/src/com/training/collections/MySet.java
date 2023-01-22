package com.training.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySet {
	
	public static void main(String[] args) {
		
		myHashSet();
		
	}
	
	public static void myHashSet() {
		
		Set<String> set=new HashSet<String>();
		set.add("Ram");
		set.add("Sham");
		set.add("Jham");
	
		
		System.out.println(set);
		
		Set<String> lset=new LinkedHashSet<String>();  // Linked (having same order)
		lset.add("Ram");
		lset.add("Sham");
		lset.add("Jham");
	
		
		System.out.println(lset);
		
		Set<String> tset=new TreeSet<String>();  // Sorted order
		tset.add("Ram");
		tset.add("Sham");
		tset.add("Jham");
	
		
		System.out.println(tset);
	}

}
