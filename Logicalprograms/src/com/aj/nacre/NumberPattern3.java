package com.aj.nacre;

public class NumberPattern3 {
	public void print(int range) {
		int k = 0, temp = 0;
		boolean flag = true;
		for (int row = 1; row <= range; row++) {
			for (int space = 1; space <= range - row; space++)
				System.out.print(" ");
			for (int col = 1; col <= 2 * row - 1; col++) {
				if (k == 9) {
					temp = 9;
				}
				if (temp != 9) {
					k++;
					System.out.print(k);

				} else {
					k--;
					System.out.print(k);
					if (k == 1)
						temp = 0;
				}

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		NumberPattern3 np3 = new NumberPattern3();
		np3.print(5);
	}
}
