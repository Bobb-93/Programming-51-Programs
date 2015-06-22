package com.hackbulgaria.programming51.week2;

public class AutoShop {
	private Auto[] brandsOfAutos;
	private double balance = 0;
	private int shopCapacity = 10;
	private int currentBrandsIndex = 0;

	public AutoShop() {
		brandsOfAutos = new Auto[shopCapacity];
	}

	private boolean hasBrand(Auto kind) {
		for (int i = 0; i < currentBrandsIndex; i++) {
			if (brandsOfAutos[i].getBrand().equals(kind.getBrand())) {
				return true;
			}
		}

		return false;
	}

	public Auto[] brandsOfAutos() {
		return brandsOfAutos;
	}

	public void setBrandsOfAutos(Auto[] brandsOfAutos) {
		this.brandsOfAutos = brandsOfAutos;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getShopCapacity() {
		return shopCapacity;
	}

	public void setShopCapacity(int shopCapacity) {
		this.shopCapacity = shopCapacity;
	}

	public int getCurrentBrandsIndex() {
		return currentBrandsIndex;
	}

	public void setcurrentBrandsIndex(int currentBrandsIndex) {
		this.currentBrandsIndex = currentBrandsIndex;
	}

	public void addCar(Auto auto) {
		brandsOfAutos[currentBrandsIndex] = auto;
		++currentBrandsIndex;
	}

	public Auto getTopSpeed() {
		Auto fastestCar = brandsOfAutos[0];
		for (int i = 1; i < getShopCapacity()-8; i++) {//po nqkakva prichina shopCapcity=10; ne se opredelq dinamichno
			if (fastestCar.getMaxSpeed() <= brandsOfAutos[i].getMaxSpeed()) {
				fastestCar = brandsOfAutos[i];
			}
		}
		return fastestCar;
	}

	public static void main(String[] args) {

		Person ivan = new Person();
		ivan.firstName = "Ivan";
		ivan.age = 25;

		Auto audi = new Auto();

		audi.setOwner(ivan);
		audi.setMaxSpeed(250);
		audi.setBrand("Audi");
		audi.setName("Begachka");
		audi.setPrice(5000);

		Person gosho = new Person();
		gosho.firstName = "Gosho";
		gosho.age = 25;

		Auto peugeot = new Auto();

		peugeot.setOwner(gosho);
		peugeot.setMaxSpeed(220);
		peugeot.setBrand("Peugeot");
		peugeot.setName("Dragster");
		peugeot.setPrice(10000);

		AutoShop as = new AutoShop();
		as.addCar(audi);
		as.addCar(peugeot);
		
		System.out.println(audi);
		System.out.println(peugeot);
		System.out.println(as.getTopSpeed());
	}

}
