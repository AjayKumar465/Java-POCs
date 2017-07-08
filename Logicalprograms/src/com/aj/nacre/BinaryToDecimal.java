package com.aj.nacre;

public class BinaryToDecimal {
	public static void main(String[] args) {
		int i = 1010, rem = 0, power = 0;
		int sum = 0;
		while (i > 0) {
			rem = i % 10;
			i = i / 10;
			sum =(int) ((int) sum + rem * Math.pow(2, power));
			power++;
		}
		System.out.println(sum);
	}
}
