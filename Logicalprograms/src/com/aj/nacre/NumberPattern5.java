package com.aj.nacre;

public class NumberPattern5 {
	public static void main(String[] args) {
NumberPattern5 np5=new NumberPattern5();
np5.print(5);
	}

	public void print(int range) {
		for (int row = range; row >= 1; row--) {
			int temp = range, col = row;
			while (temp > 0) {
				temp--;
				if (col < range) {
					System.out.print(col);
				} else {
					System.out.print(range);
				}
				col++;
			}
			System.out.println();
		}
	}
}
