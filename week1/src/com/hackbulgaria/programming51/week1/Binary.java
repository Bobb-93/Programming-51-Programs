package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class Binary {
	public static String toBinary(int n) {
		String s = "";
		int dividEnd=n;
		int digits=0;
		while(dividEnd != 0)
	    {
	        dividEnd = dividEnd / 2;
	        digits++;
	    }
		for (int j = 0; j <digits; j++) {
			if (n % 2 == 1) {
				s = '1' + s;
			}
			if (n % 2 == 0) {
				s = '0' + s;
			}
			n = n / 2;
		}
		return s;
		// return Integer.toBinaryString(n);
	}

	public static int toNumber(String binary) {
		char[] numbers = binary.toCharArray();
		int result = 0;
		for (int i = numbers.length - 1; i >= 0; i--) {
			if (numbers[i] == '1') {
				result += (int) Math.pow(2, numbers.length - i - 1);
			}
		}
		return result;
	}

	public static int countBits(int n) {
		// first we transform it into binary
		String s = "";
		int dividEnd=n;
		int digits=0;
		while(dividEnd != 0)
	    {
	        dividEnd = dividEnd / 2;
	        digits++;
	    }
		for (int j = 0; j <digits; j++) {
			if (n % 2 == 1) {
				s = '1' + s;
			}
			if (n % 2 == 0) {
				s = '0' + s;
			}
			n = n / 2;
		}

		char[] numbers = s.toCharArray();
		//System.out.println(numbers);
		int numberOfBits = 0;
		for (int i = numbers.length - 1; i >= 0; i--) {
				numberOfBits++;
		}
		return numberOfBits;
	}

	public static boolean isPowerOfTwo(String binary) {
		//we transform it into int
		char[] numbers = binary.toCharArray();
		int result = 0;
		for (int i = numbers.length - 1; i >= 0; i--) {
			if (numbers[i] == '1') {
				result += (int) Math.pow(2, numbers.length - i - 1);
			}
		}
		return (result != 0) && ((result & (result - 1)) == 0);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(toBinary(n));
		
		String binary = scanner.next();
		System.out.println(toNumber(binary));
		
		int a = scanner.nextInt();
		System.out.println(countBits(a));
		
		String secondBinary = scanner.next();
		System.out.println(isPowerOfTwo(secondBinary));
	
	}

}
/*
 * while(str[i]!=1) i++;
 * while(i<str.length)
 * if(str[i]=='1')
 * return false;
 * */
