package com.aj.nacre;

import java.util.Scanner;

public class PrintStars {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintStars ps = new PrintStars();
		System.out.println("Enter range to print stars");
		ps.print(sc.nextInt());
	}

	public void print(int range) {
		for (int row = 1; row <= range; row++) {
			for (int space = 0; space < range - row; space++)
				System.out.print(" ");
			for (int col = 0; col < 2 * row - 1; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int row = --range; row >0; row--) {
			for (int space = 0; space <=range - row; space++)
				System.out.print(" ");
			for (int col = 0; col < 2 * row - 1; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}
}
