package com.hackbulgaria.programming51.week2;

public class Fridge {
	private Food[] typesOfFood;
	private int Capacity = 10;
	private int Weight = 200000;

	private int currentFoodsIndex = 0;
	private int currentWeight = 0;

	// The Three Constructorigos
	public Fridge() {
		typesOfFood = new Food[Capacity];
	}

	public Fridge(int Capacity) {
		this.Capacity = Capacity;
		typesOfFood = new Food[Capacity];
	}

	public Fridge(int Capacity, int Weight) {
		this.Capacity = Capacity;
		this.Weight = Weight;
		typesOfFood = new Food[Capacity];
	}
	
	// dobavqne na qdene
	public boolean addFood(Food food) {
		if (currentFoodsIndex + 1 >= Capacity) {
			return false;
		}

		if (currentWeight + food.getWeight() > Weight) {
			return false;
		}

		typesOfFood[currentFoodsIndex] = food;
		++currentFoodsIndex;

		return true;
	}

	// kakyv e broqt na hranitelnite producti
	public int getFoodsCount() {
		int foodCount = 0;
		for (int i = 0; i < Capacity; i++) {
			foodCount++;
		}

		return foodCount;
	}

	// The hard functions:
	// I. Output
	public String toString() {
		String result = new String();

		for (int i = 0; i < currentFoodsIndex; i++) {
			result += typesOfFood[i].toString() + "\n";
		}
		return result;
	}

	// II. Output
	public String[] getProductsOfType(String type) {
		String[] result = new String[Capacity];
		int j = 0;
		for (int i = 0; i < currentFoodsIndex; i++) {
			if (typesOfFood[i].getType() == type) {
				result[j] = typesOfFood[i].toString();
			}
			j++;
		}

		return result;
	}

	public int getWeight() {
		return currentWeight;
	}

	public int getMaxWeight() {
		return Weight;
	}

	// III
	public Food getHeaviestFood() {
		Food heaviestFood = typesOfFood[0];
		for (int i = 1; i < Capacity; i++) {
			if (heaviestFood.getWeight() <= typesOfFood[i].getWeight()) {
				heaviestFood = typesOfFood[i];
			}
		}

		return heaviestFood;
	}

	public int getCapacity() {
		return Capacity;
	}

	public static void main(String[] args) {
		Fridge fridge = new Fridge(10);
		fridge.addFood(new Food("Cheese", "Milk", 300));
		fridge.addFood(new Food("Milk", "Milk", 1000));
		fridge.addFood(new Food("Beer", "Bevarage", 500));

		System.out.println(fridge);

		Fridge fridge1 = new Fridge(10);
		fridge1.addFood(new Food("Cheese", "Milk", 300));
		fridge1.addFood(new Food("Milk", "Milk", 1000));
		fridge1.addFood(new Food("Beer", "Bevarage", 500));

		String[] temp = fridge1.getProductsOfType("Milk");
		for (int i = 0; i < fridge1.getFoodsCount(); i++) {
			System.out.println(temp[i]);//nqma koordinirane na broq producti
		}

	}

}
