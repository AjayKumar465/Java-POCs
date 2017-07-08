package com.aj.nacre;

public class NumberPattern1 {
	public void print(int range) {
		for (int row = 1; row <= range; row++) {
			if (row % 2 == 0) {
				for (int col = 1; col <= row + row; col++) {
					if (col % 2 == 0)
						System.out.print(col);
				}
			} else {
				for (int col = 1; col <= row + row; col++) {
					if (col % 2 != 0)
						System.out.print(col);
				}

			}

			System.out.println();
		}

	}

	public static void main(String[] args) {
		NumberPattern1 np = new NumberPattern1();
		np.print(4);
	}
}
