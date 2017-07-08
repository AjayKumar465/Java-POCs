package com.nacre.online_assesment.filter;

import java.util.Scanner;

public class T {
	public static void main(String[] args) {
		int a[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("enter value");
				int n = sc.nextInt();
				boolean f=true;
				boolean b = check(n,a);
				while (b) {
					System.out.println("duplicate found please enter again");
					n = sc.nextInt();
					b = check(n, a);
				}
				a[i][j] = n;
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
	}
	private static boolean checkrange(int n) {

		if(n>=1&&n<=9)
			return true;
		return false;
	}

	private static boolean check(int n, int[][] a) {
		for (int i = 0; i <3; i++) {
			for (int j = 0; j<3; j++) {
				if (a[i][j] == n) {
					return true;
				}
			}
		}
		return false;
	}
}
