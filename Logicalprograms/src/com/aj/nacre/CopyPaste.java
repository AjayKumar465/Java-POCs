package com.aj.nacre;

import java.util.Scanner;

public class CopyPaste {
	public static boolean isPrime(int number) {
		int factorCount = 0;
		if (number < 2)
			return false;
		else if (number == 2)
			return true;
		else if (number % 2 == 0)
			return false;
		else {
			int limit = (int) Math.sqrt(number);
			for (int i = 3; i <= limit; i += 2) {
				if (number % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static int circulate(int n, int divisor) {
		// left most digit is n/divisor;
		// remainder after removing left most is n%divisor;
		if (n < 10)
			return n;
		else
			return (n % divisor) * 10 + n / divisor;
	}

	public static void main(String args[]) {
		int N;
		Scanner sc = new Scanner(System.in);
		System.out.print("INPUT: N= ");
		N = sc.nextInt();
		int numOfDigits = 0, divisor = 1, circular = N;
		boolean allPrime = true;
		for (int temp = N; temp > 0; temp /= 10) {
			numOfDigits++;

			divisor *= 10;

		}
		divisor /= 10;
		System.out.println("OUTPUT: ");
		do {
			System.out.println("        " + circular);
			circular = circulate(circular, divisor);
			if (!isPrime(circular))
				allPrime = false;
		} while (circular != N);
		System.out.print("\n        ");
		if (allPrime)
			System.out.println(N + " IS A CIRCULAR PRIME");
		else
			System.out.println(N + " IS NOT A CIRCULAR PRIME");
	}
}
