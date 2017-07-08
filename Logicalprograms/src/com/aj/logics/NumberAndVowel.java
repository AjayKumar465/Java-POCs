package com.aj.logics;

public class NumberAndVowel {
	public void print(int range) {
		char[] charray = { 'a', 'e', 'i', 'o', 'u' };
		int temp = 0, k = 0, chindex = 0;
		for (int row = 1; row <= range; row++) {
			for (int space = 1; space <= range - row; space++)
				System.out.print(" ");
			for (int col = 1; col <= 2 * row - 1; col++) {
				if (row % 2 == 0) {
					System.out.print(charray[chindex]);
					chindex++;
					if (chindex >=charray.length)
						chindex = 0;
				} else {
					if (temp != 9) {
						k++;
						System.out.print(k);
						if (k == 9)
							temp = 9;
					} else {
						k--;
						System.out.print(k);
						if (k == 1)
							temp = 0;
					}
				}
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		NumberAndVowel nandv = new NumberAndVowel();
		nandv.print(5);
	}
}
