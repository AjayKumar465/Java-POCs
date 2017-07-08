package com.aj.nacre;

public class DuplicateNoInArray {
	public static void main(String[] args) {
		int[] ar = { 1, 2, 5, 5 };
		System.out.println(find(ar));
	}

	public static int find(int[] ar) {
		int dpno = 0;
		for (int i = 1; i < ar.length; i++) {
			int next = ar[i];
			int j = i;
			while (j > 0 && next == ar[j -= 1]) {
				dpno = ar[j];
			}
		}
		return dpno;

	}
}
