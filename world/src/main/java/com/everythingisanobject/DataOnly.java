package com.everythingisanobject;

public class DataOnly {

	// basic types
	boolean b;
	char c;
	byte bytes;
	short s;
	int i;
	long l;
	float f;
	double d;

	// object types
	String str;
	DataOnly data;

	public static void main(String[] args) {
		DataOnly dataOnly = new DataOnly();
		dataOnly.basicVariable();
		dataOnly.stringVariable();
		dataOnly.ObjectVarible();
	}

	// void methodVariable(){
	// DataOnly dataOnly;
	// //The local variable dataOnly may not have been initialized
	// System.out.println("DataOnly:" + dataOnly);
	// }

	void basicVariable() {
		System.out.println("boolean:" + b);
		System.out.println("char:" + c);
		System.out.println("byte:" + bytes);
		System.out.println("short:" + s);
		System.out.println("int:" + i);
		System.out.println("long:" + l);
		System.out.println("float:" + f);
		System.out.println("double:" + d);
	}

	void stringVariable() {
		System.out.println("String:" + str);
	}

	void ObjectVarible() {
		System.out.println("DataOnly:" + data);
	}
}
