package com.hackbulgaria.programming51.week1;

public class MaxTypeValue {
			 
	public static void main(String[] args) {
		
		System.out.println("What will happen if you increase an int variable a lot of times?");
		System.out.println("An int is 32 bit integer number, i.e. it has 32 zeroes and ones. ");
		System.out.println("so there are 2^32 combinations of them, from which 1 bit defines the sign.");
		System.out.println("and 2^31-1=2147483647. When it gets larger than that it becomes negative.");
		System.out.println("The long type has 64 bits or 2^64 possibilities, so here the max value is:");
		System.out.println( "9223372036854775807");
		System.out.println("The double variables(64 bits) have way better precision than the float(32 bits).");
		System.out.println("1 sign bit, 8 bits of exponent, and 23 bits of the mantissa - float");
		System.out.println("1 sign bit, 11 bits of exponent, and 53 bits of mantissa.");
		for(int i=0;;i+=1000000)
		{
			System.out.println(i);
		}
		
		/*
		long i=0
		while(true){
			System.out.println(i);
			i+=1000000000
		}
		
		for(float i=0;;i+=1000000)
		{
			System.out.println(i);
		}
		
		for(double i=0;;i+=1000000)
		{
			System.out.println(i);
		}
		*/
		
	}

}
