package com.hackbulgaria.programming51.week2;

public class Auto {
	private Person owner;
	private int maxSpeed;
	private String brand;
	private String name;
	private int price;

	public Auto() {
	}

	public Auto(Person owner, int maxSpeed, String brand, String name, int price) {
		this.setOwner(owner);
		this.setMaxSpeed(maxSpeed);
		this.setBrand(brand);
		this.setName(name);
		this.setPrice(price);
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Person getPerson() {
		return getOwner();
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public String getBrand() {
		return brand;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String toString() {
		return (getBrand() + " " + getName() + ", Max Speed: " + getMaxSpeed()
				+ ", Price:" + getPrice() + ", " + getOwner());
	}

	public static void main(String[] args) {
		Person ivan = new Person("Ivan", "Ivanov", 25);
		Auto audi = new Auto(ivan, 200, "Audi", "Begachka", 5000);

		System.out.println(audi);
	}

}
