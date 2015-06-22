package com.hackbulgaria.programming51.week2;

public class Food {
	private String name;
	private String type;
	private int weight;
	//konstruktor:
	public Food(String name, String type, int weight) {
		this.name = name;
		this.type = type;
		this.weight = weight;
	}
	
	public String getName(){
		return name;
	}
	
	public String getType(){
		return type;
	}
	
	public int getWeight(){
		return weight;
	}
	
	public String toString() {
		return name + " - " + type + ": " + weight+"grams";
	}
	
	
	public static void main() {
		
	}

}
