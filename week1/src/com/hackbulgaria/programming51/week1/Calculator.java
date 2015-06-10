package com.hackbulgaria.programming51.week1;

import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		char oper = scanner.next().charAt(0);
		int b = scanner.nextInt();
		int factA=1;
		int factB=1;
		
		for (int i = 1 ; i <= a ; i++ ){
            factA*=i;
		}
		
		for (int i = 1 ; i <= b ; i++ ){
            factB*=i;
		}
		
		switch (oper) {
		case '+':
			System.out.println(a + b);
			break;
		case '-':
			System.out.println(a - b);
			break;
		case '*':
			System.out.println(a * b);
			break;	
		case '/':
			System.out.println(a / b);
			break;
		case '^':
			System.out.println(Math.pow(a,b));
			break;
		case '?':
			System.out.println(factA+factB);
		}
	}

}
