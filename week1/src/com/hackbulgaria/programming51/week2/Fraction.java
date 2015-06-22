package com.hackbulgaria.programming51.week2;

public class Fraction {
private int num;
private int den;

public Fraction(){	
}

public Fraction(int num, int den) {
	this.num = num;
	this.den = den;
}

public String toString() {
	return num+"/"+den;
}

public int getNum(){
	return num;
}

public int getDen(){
	return den;
}

public double getReal(){
	return (double)num/(double)den;
}

public int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a % b); 
}

public void sum(Fraction F){
	num=(num*F.getDen()+F.getNum()*den);
	den=den*F.getDen();
	int gcd=gcd(num,den);
	num/=gcd;
	den/=gcd;
}

public void simplify(){
	int gcd=gcd(num,den);
	num/=gcd;
	den/=gcd;
}

	public static void main(String[] args) {
		Fraction a = new Fraction();
		a.num = 4;
		a.den = 12;

		System.out.println(a);
		System.out.println(a.getReal());
		a.simplify();
		System.out.println(a);
		
		Fraction b = new Fraction();
		
		b.num = 5;
		b.den = 24;
		a.sum(b);
		System.out.println(a);
	}

}
