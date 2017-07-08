package com.aj.nacre;

public class StringFlyPattern {
	public static void main(String[] args) {
		StringFlyPattern sfp = new StringFlyPattern();
		sfp.print(7);
	}

	public void print(int range) {
		int spacerange = (range * 2 - 1) - 2, temp = 1;

		int temp1 = range;

		int sr = 1, temp2 = range - 1;
		for (int row = 1; row <= range * 2 - 1; row++) {

			if (row <= range) {

				for (int col = 1; col <= row; col++) {

					System.out.print(col);
				}
				for (int space = 1; space <= spacerange; space++)
					System.out.print(" ");
				spacerange -= 2;
				// System.out.println("spacer"+spacerange);
				if (temp == range) {
					temp--;
				}
				for (int col = temp; col > 0; col--) {

					System.out.print(col);

				}
				temp++;
			} else {

				for (int col = 1; col < temp1; col++) {

					System.out.print(col);
				}

				for (int space = 1; space <= sr; space++)
					System.out.print(" ");
				for (int col = temp2; col > 0; col--) {

					System.out.print(col);

				}
				sr += 2;
				temp1--;
				temp2--;
			}

			System.out.println();

		}
	}
}
