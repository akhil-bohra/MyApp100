package com.ofss;

public class TestProduct {

	// a class with the main method serves as an entry to the application
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Stock st1=new Stock(100, "ORCL", 123.45);
		// Create Stock Object
		Stock add[] = {new Stock(101, "OFSSL", 1234),new Stock(111, "HCL", 4321), new Stock(121, "Acc", 5678)};
		
		
		// Create Customer object and inject the Stock object into it
		Customer cust=new Customer("Akhil", add); // We have injected add object into the customer object
		// This is known as DI (Dependency Injection)

		
		System.out.println(cust);
		//System.out.println("123");

		double maxPrice=0.0;
		String maxPricedStock="";
		
		// Let's use for loop
		for (int i=0;i<add.length;i++)
		{
			if (add[i].getStockPrice()>maxPrice)
			{
				maxPrice=add[i].getStockPrice();
				maxPricedStock=add[i].getStockName();
			}
			
		}
		
		System.out.println("The stock name with the highest price is "+maxPricedStock+" and price is "+maxPrice);


	}

}
