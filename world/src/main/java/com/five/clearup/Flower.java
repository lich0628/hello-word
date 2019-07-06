package com.five.clearup;

public class Flower {

	int petalCount = 0;
	String s = "initial value";

	Flower(int petals) {
		petalCount = petals;
		System.out.println("Constructor w/ int arg only, petalCount="
				+ petalCount);
	}

	Flower(String ss) {
		System.out.println("Constructor w/ string arg only, s=" + ss);
		s = ss;
	}

	Flower(String s, int petals) {
		this(petals);
		this.s = s;
		System.out.println("String & int args");
	}

	Flower() {
		//super(); super and this can't coexist 
		this("hi", 47);
		System.out.println("default constructor (no args)");
	}

	void printPetalCount() {
		System.out.println("petalCount=" + petalCount + ",s=" + s);
	}

	public static void main(String[] args) {
		Flower f = new Flower();
		f.printPetalCount();
	}

}
