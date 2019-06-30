package com.operator;

import java.util.Random;
import static com.operator.PrintStatic.*;

public class BitMainpulation {

	public static void main(String[] args) {
		Random rand = new Random(47);
		int i = rand.nextInt();
		int j = rand.nextInt();
		printBinaryInt("-1", -1);
		printBinaryInt("+1", +1);
		int maxpos = Integer.MAX_VALUE;
		printBinaryInt("maxpos", maxpos);
		int minpos = Integer.MIN_VALUE;
		printBinaryInt("minpos", minpos);
		printBinaryInt("i", i);
		printBinaryInt("~i", ~i);
		printBinaryInt("-i", -i);
		printBinaryInt("j", j);

		printBinaryInt("i & j", i & j);
		printBinaryInt("i | j", i | j);
		printBinaryInt("i ^ j", i ^ j);
		printBinaryInt("i", i);
		printBinaryInt("i << 5", i << 5);
		printBinaryInt("i >> 5", i >> 5);
		printBinaryInt("i >>> 5", i >>> 5);
	}

	static void printBinaryInt(String s, int i) {
		print(s + ",int:" + i + ",binary:\n" + Integer.toBinaryString(i) + "\n");
	}
}
