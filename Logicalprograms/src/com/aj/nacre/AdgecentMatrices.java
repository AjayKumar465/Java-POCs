package com.aj.nacre;

import java.util.Scanner;

public class AdgecentMatrices {
	static int rowLength, colLength;

	public void find(int[][] array, int input) {
		boolean b = false;
		for (int row = 0; row < rowLength; row++) {
			for (int col = 0; col < colLength; col++) {
				if (array[row][col] == input) {
					if (row - 1 >= 0) {
						System.out.println("top val is " + array[row - 1][col]);
						b = true;
					}
					if (col - 1 >= 0) {
						// System.out.println("top val" + array[row - 1][col]);
						System.out.println("right val is " + array[row][col - 1]);
						b = true;
					}
					if (row < rowLength - 1) {
						System.out.println("bottom val is " + array[row + 1][col]);
						b = true;
					}
					if (col < colLength - 1) {
						// System.out.println("bottom" + array[row + 1][col]);
						System.out.println("left val is " + array[row][col + 1]);
						b = true;
					}

				}
			}

		}
		if (b != true)
			System.out.println("not found");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rowlenth for matrices");
		rowLength = sc.nextInt();
		System.out.println("Enter colLength for matrices");
		colLength = sc.nextInt();
		int array[][] = new int[rowLength][colLength];
		System.out.println("Enter values for  matrices");

		for (int row = 0; row < rowLength; row++) {
			// System.out.println("enter col vals for"+row+"row");
			for (int col = 0; col < colLength; col++) {
				System.out.println("Enter value for" + row + " row and " + col + "col");
				array[row][col] = sc.nextInt();
			}
		}
		System.out.println("Enter no for search nearest value");
		AdgecentMatrices am = new AdgecentMatrices();
		am.find(array, sc.nextInt());
	
	}

}
