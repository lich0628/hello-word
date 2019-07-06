package com.five.clearup.init;

/**
 * Bowl(1)
 * static()
 * Bowl(2)
 * not static()
 * Table()
 * f1(1)
 * Bowl(4)
 * Bowl(3)
 * Cupboard()
 * f1(2)
 * Creating new Cupboard() in main
 * Bowl(3)
 * Cupboard()
 * f1(2)
 * Creating new Cupboard() in main
 * Bowl(3)
 * Cupboard()
 * f1(2)
 * f2(1）
 * f3(1)
 * 
 * 静态变量和静态代码块
 * 成员变量和代码块
 * 构造方法
 * 初始化子类时，先父类后子类
 *
 */
public class StaticInitialization {

	public static void main(String[] args) {
		System.out.println("Creating new Cupboard() in main");
		new Cupboard();
		System.out.println("Creating new Cupboard() in main");
		new Cupboard();
		table.f2(1);
		cupboard.f3(1);
	}

	static Table table = new Table();

	static Cupboard cupboard = new Cupboard();

}
