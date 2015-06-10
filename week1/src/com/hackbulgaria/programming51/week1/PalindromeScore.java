package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class PalindromeScore {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int n1;
		int palindromeScore = 0;
		
		while (true) {

			int reverse1 = 0;
			int reverse2 = 0;
			n1=n;
			
			while (n != 0) {
				reverse1 = reverse1 * 10;
				reverse1 = reverse1 + n % 10;
				n = n / 10;
			}
			//System.out.println("n1=" + n1);//n1=48;n1=231
			
			//System.out.println("reverse1="+reverse1);//reverse1=84;reverse1=132
			if(reverse1==n1)
			{
				palindromeScore++;
				break;
			}
			else 
			{
				
				int sumOfNumbers=n1+reverse1;
				if(palindromeScore<1)
				{
					palindromeScore++;
				}
				int sumOfNumbers2=sumOfNumbers;
				
				//System.out.println("sumOfNumbers="+sumOfNumbers);//132;363
				//int sumOfNumbers2=sumOfNumbers;
				
				while (sumOfNumbers > 0) {
					  reverse2 = reverse2 * 10;
			          reverse2 = reverse2 + sumOfNumbers%10;
			          sumOfNumbers = sumOfNumbers/10;
				}
				
				//System.out.println("reversed sum of numbers="+reverse2);//231
				if(sumOfNumbers2!=reverse2)
				{
					palindromeScore++;
					n=reverse2;
					//System.out.println("n="+n);
				}

				//System.out.println(10);
			}
			
		}
		System.out.println(palindromeScore);
	}

}
