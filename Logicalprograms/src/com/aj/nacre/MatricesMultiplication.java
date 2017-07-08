package com.aj.nacre;

public class MatricesMultiplication {
	public static void main(String[] args) {

		int[][] array1 = { { 1, 2, 3 }, { 3, 2, 4 }, { 1, 2, 3 } };
		int[][] array2 = { { 1, 2, 3 }, { 3, 2, 4 }, { 1, 2, 4 } };
		int[][] sum = new int[3][3];
		// double d=3;
		// int f=(int)d;
		// System.out.println((int)'a');
int temp=0;
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {

				for (int col1 = 0; col1 < 3; col1++) {
					for (int row1 = 0; row1 < 3; row++)
				temp=	array1[row][col1] * array2[row1][col1];

				}

			}
		}
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(sum[row][col] + " ");
			}
			System.out.println();
		}
	}
}
