package com.four.control;

public class Switch {

	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			containBreak(i);
			noContainBreak(i);
		}
	}

	static void containBreak(int i) {
		switch (i) {
		case 1:
			System.out.println(i + " one");
			break;
		case 2:
			System.out.println(i + " two");
			break;
		case 3:
			System.out.println(i + " three");
			break;
		default:
			System.out.println(i + " default");
		}
	}

	static void noContainBreak(int i) {
		switch (i) {
		case 1:
			System.out.println(i + " one");
		case 2:
			System.out.println(i + " two");
		case 3:
			System.out.println(i + " three");
		default:
			System.out.println(i + " default");
		}
	}
}
