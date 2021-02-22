package com.ofss;

import java.util.Arrays;

public class Customer {

	String customerName;
	Stock stock[];
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String customerName, Stock stock[]) {
		super();
		this.customerName = customerName;
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", stock=" + Arrays.toString(stock) + "]";
	}

	
	
	

}
