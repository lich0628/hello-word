package com.five.clearup.init;

public class Table {
	static Bowl bowl1 = new Bowl(1);

	static {
		System.out.println("static()");
	}

	{
		System.out.println("not static()");
	}

	Table() {
		System.out.println("Table()");
		bowl1.f1(1);
	}

	void f2(int marker) {
		System.out.println("f2(" + marker + ")");
	}

	static Bowl bowl2 = new Bowl(2);
}
