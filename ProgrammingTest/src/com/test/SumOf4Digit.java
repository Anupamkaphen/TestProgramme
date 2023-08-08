package com.test;

public class SumOf4Digit {
	
	public static void main(String args[])  
	{  
	int number = 5897; 
	System.out.println("The sum of digits: "+findSum(number));  


}
	
	
	static int findSum(int number)  
	{     
	
	int sum = 0;  

	while (number != 0)  
	{        
	sum = sum + number % 10;  
	 
	number = number/10;  
	}  
	 
	return sum;  
	}  
	
}