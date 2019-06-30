package com.operator;

import static com.operator.PrintStatic.println;

import java.util.List;
import java.util.Vector;

public class BitOperator {

	private static int addOne = 0;
	private static List<Integer> sumVector = new Vector<Integer>();

	public static void main(String[] args) {
		int zero = 4;
		int one = 9;
		printlnInt(zero);
		printlnInt(one);

		printlnInt(zero & one);
		printlnInt(zero | one);
		printlnInt(zero ^ one);
		printlnInt(~zero);

		add(zero, one);
//		StringBuffer sb = new StringBuffer();
//		for (Integer value : sumVector) {
//			sb.append(value);
//		}
//		println(sb.reverse().toString());
	}

	private static void printlnInt(int i) {
		println(Integer.toBinaryString(i));
	}

	private static void add(int zero, int one) {
		int sum = zero + one;
		printlnInt(sum);
		int[] zeros = intToBit(zero);
		int[] ones = intToBit(one);
		if (zeros.length > ones.length) {
			addBit(zeros, ones);
		} else {
			addBit(ones, zeros);
		}
	}

	private static void addBit(int[] big, int[] small) {
		int smallLen = small.length - 1;
		for (int len = big.length - 1; len >= 0; len--, smallLen--) {
			if (smallLen >= 0) {
				bitAdd(big[len], small[smallLen]);
			} else {
				bitAdd(big[len], 0);
			}
		}
		if (addOne == 1) {
			sumVector.add(addOne);
		}
	}

	private static void bitAdd(int i, int j) {
		if (1 == (i & j)) {
			sumVector.add(addOne);
			addOne = 1;
		} else if (1 == (i | j)) {
			if (addOne == 0) {
				sumVector.add(1);
			} else {
				sumVector.add(0);
			}
		} else {
			sumVector.add(addOne);
			addOne = 0;
		}
	}

	private static int[] intToBit(int i) {
		String str = Integer.toBinaryString(i);
		String[] strs = str.split("");
		int[] values = new int[strs.length];
		for (int j = 0; j < strs.length; j++) {
			values[j] = Integer.valueOf(strs[j]);
		}
		return values;
	}
}
