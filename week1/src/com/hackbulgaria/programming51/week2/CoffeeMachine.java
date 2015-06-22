package com.hackbulgaria.programming51.week2;

public class CoffeeMachine {
	private Coffee[] brandsOfCoffee;
	private double balance = 0;// pri kupuvane
	private int machineCapacity = 10;// kapatsitet
	private int currentKindsIndex = 0;// broi marki

	public CoffeeMachine() {
		this.brandsOfCoffee = new Coffee[machineCapacity];
	}

	// oshte konstruktori
	public CoffeeMachine(int capacity) {
		this.machineCapacity = capacity;
		this.brandsOfCoffee = new Coffee[machineCapacity];
	}

	private boolean hasKind(Coffee kind) {
		for (int i = 0; i < currentKindsIndex; i++) {// kak znaem kyde e
														// currentKindsIndex?
			if (brandsOfCoffee[i].getBrand().equals(kind.getBrand())) {
				return true;
			}
		}
		return false;
	}

	public boolean addCoffee(Coffee coffee) {
		// mozhe tuk da se pravi proverka za povtarqshti se marki
		if (currentKindsIndex + 1 >= machineCapacity) {
			return false;
		}

		if (hasKind(coffee)) {
			return false;
		}

		brandsOfCoffee[currentKindsIndex] = coffee;
		++currentKindsIndex;

		return true;
	}

	public double buyCoffee(Coffee brand, double price) {
		if (!hasKind(brand)) {
			return price;
		}

		double change = price - brand.getPrice();

		if (change < 0) {
			return price;
		}

		balance += brand.getPrice();

		return change;
	}

	public double getBalance() {
		return balance;
	}

	public int getMachineCapacity() {
		return machineCapacity;
	}

	public int getCurrentKindsIndex() {
		return currentKindsIndex;
	}

	public static void main(String[] args) {
		CoffeeMachine cm = new CoffeeMachine();
		Coffee java = new Coffee("Java", 1.00);
		Coffee latte = new Coffee("Latte", 1.70);
		cm.addCoffee(java);
		cm.addCoffee(latte);
		cm.brandsOfCoffee[2] = new Coffee("Lava", 3.0);

		double number = Math.round(cm.buyCoffee(latte, 2.3) * 100);
		System.out.println(number / 100);
		System.out.println("Current balance: " + cm.balance);

	}

}
