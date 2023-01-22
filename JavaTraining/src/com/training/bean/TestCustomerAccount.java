package com.training.bean;

public class TestCustomerAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Customer and Account share  HAS A relationship and depicts Composition
		// Composition- two classes cannot exist without each other
		// they are tightly bound
		
		Customer c=new Customer();
		c.setCid(1);
		c.setName("Kshitij");
		
		Account a=c.getAccount();
		a.setBalance(35000);
		a.setNumber(20);
		
		System.out.println("Customer ID : "+ c.getCid());
		System.out.println("Customer Name : "+c.getName());
		System.out.println("Account Balance : "+a.getBalance());
		System.out.println("Account Number : "+a.getNumber());
		

	}

}
