package com.hackbulgaria.programming51.week2;

public class Coffee {
	private String brand;// zashto tuk sa public
	private double price;

	public Coffee() {
	}

	public Coffee(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}// ???

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		return brand + ": " + price;
	}

	public static void main(String[] args) {

		Coffee java = new Coffee("Java", 1.00);
		System.out.println(java);

		Coffee lava = new Coffee("Lava", 2.00);
		System.out.println(lava);

		Coffee mocca = new Coffee();
		mocca.brand = "Mocca";
		mocca.price = 3.00;
		System.out.println(mocca);
	}
}
