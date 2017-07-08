package com.aj.nacre;

import java.util.Scanner;

public class MagicMatrice {
	static int rlength = 3, clength = 3;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row length");
		rlength = sc.nextInt();
		System.out.println("enter col length");
		clength = sc.nextInt();
		if (rlength == clength) {
			int[][] ar = new int[rlength][clength];
			for (int row = 0; row < rlength; row++) {
				for (int col = 0; col < clength; col++) {
					System.out.println("enter val");
					ar[row][col] = sc.nextInt();
				}
			}

			MagicMatrice m = new MagicMatrice();
			m.check(ar);
		} else {
			System.out.println("with entered row and col length magic matrices is not possible");
		}
	}

	public void check(int[][] ar) {
		boolean flag = true;
		int sum = 0, temp = 0, output = 0;
		int col1 = 0;
		for (int row = 0; row < rlength; row++)
			output = output + ar[row][col1++];
		col1 = 0;
		for (int row = rlength - 1; row >= 0; row--)
			temp = temp + ar[row][col1++];
		System.out.println(output);
		System.out.println(temp);

		if (output != temp) {
			flag = false;
		}
		if (flag) {

			for (int row = 0; row < rlength; row++) {
				for (int col = 0; col < clength; col++) {
					sum = sum + ar[row][col];
				}
				System.out.println(sum + "s");
				if (sum != output) {
					flag = false;
					break;
				}
				sum = 0;
			}

			sum = 0;
			for (int col = 0; col < rlength; col++) {
				for (int row = 0; row < clength; row++) {
					sum = sum + ar[row][col];
				}
				System.out.println(sum + "ss");
				if (sum != output) {
					flag = false;
					break;
				}
				sum = 0;
			}

		}
		if (flag) {
			System.out.println("magic matrices");
		} else {
			System.out.println("not magic matrices");
		}
	}
}
