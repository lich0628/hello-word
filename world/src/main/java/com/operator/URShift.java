package com.operator;

import static com.operator.PrintStatic.*;

//无符号移位>>>，short、byte可能得到的不是正确值
public class URShift {

	public static void main(String[] args) {
		int i = -1;
		println(Integer.toBinaryString(i));
		i >>>= 10;
		println(Integer.toBinaryString(i));
		long l = -1L;
		println(Long.toBinaryString(l));
		l >>>= 10;
		println(Long.toBinaryString(l));
		short s = -1;
		println(Integer.toBinaryString(s));
		s >>>= 10;
		println(Integer.toBinaryString(s));
		byte b = -1;
		println(Integer.toBinaryString(b));
		b >>>= 10;
		println(Integer.toBinaryString(b));
		b = -1;
		println(Integer.toBinaryString(b));
		println(Integer.toBinaryString(b >>> 10));
	}

}
