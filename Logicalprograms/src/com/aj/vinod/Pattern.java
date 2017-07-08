package com.aj.vinod;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input value");
		int inp = sc.nextInt();
		System.out.println("Your Pattern");
		int dispVal = inp + (inp - 1);
		int colCondition = 1;
		int temp = 0;
		for (int row = 1; row <= inp; row++) {
			for (int space = inp; space >row; space--) {
				System.out.print(" ");

			}
			temp = dispVal;
			for (int col = 1; col <= colCondition; col++) {
				if (col <= row) {
					System.out.print(temp);
					if(col<row)
					temp -= 2;
				}else{
					temp+=2;
					System.out.print(temp);
				}

			}
			colCondition += 2;
			System.out.println();
		}
	}
}
