package com.operator;

import java.util.Random;

//m*n的矩阵，0<=x<m*n,求x在矩阵的几行几列

public class Test20190629 {

	public static void main(String[] args) {
		int length = 5;
		int hight = 4;
		Random rand = new Random(System.currentTimeMillis());
		int count = length * hight;
		int value = rand.nextInt(count);
		System.out.println(value);
		print(length, hight);

		int row = value / hight;
		int column = value % hight;
		System.out.println(value + " 在" + ++row + "行，" + ++column + "列");
	}

	private static void print(int length, int hight) {
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < hight; j++) {
				int value = i * hight + j;
				System.out.print(value + "  ");
			}
			System.out.println();
		}
	}

}
