package com.hackbulgaria.programming51.week2;

public class Person {
	public String firstName;
	public String lastName;
	public int age;
	
	public Person(){
	}
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age=age;
	}
	
	
	public String toString() {
		return (firstName+" "+lastName+" age: "+age);
	}
	
	public static void main(String[] args) {
		Person petar = new Person("Petar","Petrov",18);
		System.out.println(petar);

	}

}
