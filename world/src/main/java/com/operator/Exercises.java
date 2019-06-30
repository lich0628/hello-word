package com.operator;

public class Exercises {

	public static void main(String[] args) {
		String s = "ABC";
		String s1 = "AB" + "C";
		String s2 = "C";
		String s3 = "AB" + s2;
		String s4 = new String("ABC");
		compare(s,s1);
		compare(s,s3);
		compare(s,s4);
		equal(s,s1);
		equal(s,s3);
		equal(s,s4);
	}

	static void compare(String s1, String s2) {
		System.out.println(s1 == s2);
	}

	static void equal(String s1, String s2) {
		System.out.println(s1.equals(s2));
	}
}
