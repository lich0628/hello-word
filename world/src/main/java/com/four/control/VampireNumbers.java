package com.four.control;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class VampireNumbers {

	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		Comparator<Integer> c = new IntegerComparator();
		for (int i = 10; i < 100; i++) {
			for (int j = i; j < 100; j++) {
				find(i, j, c);
			}
		}
		System.out.println("time:" + (System.currentTimeMillis() - begin));
	}

	static void find(int i, int j, Comparator<Integer> c) {
		int product = i * j;
		if (product < 1000) {
			return;
		} else if (product % 100 == 0) {
			return;
		} else {
			List<Integer> listP = product(product);
			List<Integer> listM = multiplier(i);
			listM.addAll(multiplier(j));
			if (isEqual(listP, listM, c)) {
				System.out
						.println("product:" + product + ",i:" + i + ",j:" + j);
			}
		}
	}

	static boolean isEqual(List<Integer> listP, List<Integer> listM,
			Comparator<Integer> c) {
		boolean isEqual = true;
		listP.sort(c);
		listM.sort(c);
		for (int i = 0; i < 4; i++) {
			if (listP.get(i) != listM.get(i)) {
				isEqual = false;
				break;
			}
		}
		return isEqual;
	}

	static List<Integer> multiplier(int multiplier) {
		List<Integer> list = new ArrayList<Integer>();
		int ten = multiplier / 10;
		int bit = multiplier % 10;
		list.add(ten);
		list.add(bit);
		return list;
	}

	static List<Integer> product(int product) {
		List<Integer> list = new ArrayList<Integer>();
		int thousand = product / 1000;
		int hundred = product % 1000 / 100;
		int ten = product % 100 / 10;
		int bit = product % 10;
		list.add(thousand);
		list.add(hundred);
		list.add(ten);
		list.add(bit);
		return list;
	}

}
