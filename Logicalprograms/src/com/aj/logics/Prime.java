
package com.aj.logics;

public class Prime {
	public static void main(String[] args) {
		for (int i = 2; i < 200; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}

		}

	}

	private static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
