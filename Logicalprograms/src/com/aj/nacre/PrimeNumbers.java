package com.aj.nacre;

import java.util.Scanner;

public class PrimeNumbers {
	public void print(int range1, int range2) {

		for (int i = range1; i <= range2; i++) {
			boolean b = false;
			for (int j = 2; j < i / 2; j++) {
				if (i % j == 0) {
					b = true;
				}
			}
			if (i == range1) {
				System.out.println("Prime nos are");
			}
			if (b == false)
				System.out.println(i);
		}

	}

	public static void main(String[] args) {
		PrimeNumbers pn = new PrimeNumbers();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range to check prime nos");
		int range1 = sc.nextInt();
		System.out.println("Enter range2 to check prime nos");
		int range2 = sc.nextInt();
		pn.print(range1, range2);
	}
}
