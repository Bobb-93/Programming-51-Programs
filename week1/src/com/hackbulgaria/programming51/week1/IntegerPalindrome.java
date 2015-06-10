package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class IntegerPalindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int reverse1 = 0;
		int reverse2 = 0;
		int n1=n;
		
		while( n != 0 )
	      {
	          reverse1 = reverse1 * 10;
	          reverse1 = reverse1 + n%10;
	          n = n/10;
	      }
		//System.out.println("reverse1="+reverse1);
		
		int sumOfNumbers;
		sumOfNumbers=n1+reverse1;
		
		//System.out.println("sumOfNumbers="+sumOfNumbers);
		int sumOfNumbers2=sumOfNumbers;
		
		while (sumOfNumbers > 0) {
			  reverse2 = reverse2 * 10;
	          reverse2 = reverse2 + sumOfNumbers%10;
	          sumOfNumbers = sumOfNumbers/10;
		}
		
		//System.out.println("reversed sumOfNumbers="+reverse2);

		if (sumOfNumbers2 == reverse2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		// ctrl+F11
	}

}
