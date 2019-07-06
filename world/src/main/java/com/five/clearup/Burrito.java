package com.five.clearup;

public class Burrito {

	Spiciness s;

	Burrito(Spiciness degree) {
		s = degree;
	}

	public static void main(String[] args) {
		Burrito plain = new Burrito(Spiciness.NOT);
		plain.decribe();
	}

	public void decribe() {
		System.out.print("This burrito is ");
		switch (s) {
		case NOT:
			System.out.println("not spicy at all");
			break;
		case MILD:
		case MEDIUM:
			System.out.println("a little hot");
			break;
		case HOT:
		case FLAMING:
		default:
			System.out.println("maybe too hot");
		}
	}

}
