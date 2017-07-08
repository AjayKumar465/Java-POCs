package com.aj.nacre;

public class NumberPattern6 {
	public static void main(String[] args) {
		NumberPattern6 np6 = new NumberPattern6();
		np6.print(6);
	}

	public void print(int range) {
		int temp = range;
		for (int row = 1; row <= range; row++) {
			for (int col = 1; col <= temp; col++) {
				System.out.print(col);
			}
			for (int space = 1; space <= 2 * row - 2; space++)
				System.out.print("*");
			for (int col = temp; col >= 1; col--)
				System.out.print(col);
			System.out.println();
			temp--;
		}
	}
}
