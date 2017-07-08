package com.aj.nacre;

public class NumberPattern2 {
	public void print(int input) {
		int k = 1;
		for (int row = 1; row <= input; row++) {
			for (int space = 1; space <= input - row; space++) {
				System.out.print(" ");

			}
			for (int col = 1; col <= 2 * row - 1; col++) {
				System.out.print(k);

				if (k == 9)
					k = 0;
				k++;
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		NumberPattern2 np2 = new NumberPattern2();
		np2.print(4);
	}

}
