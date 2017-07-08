package com.aj.nacre;

import java.util.Scanner;

public class CircularPrime {
	public static boolean isPrime(int input) {
		for (int i = 2; i < input / 2; i++) {
			if (input % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int circulate(int input, int divisibility) {
		return (input % divisibility) * 10 + (input / divisibility);

	}

	public static void main(String[] args) {
		CircularPrime c = new CircularPrime();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No");
		int inp = sc.nextInt();
		int div = 1;
		int temp = inp;
		while (temp > 0) {
			temp = temp / 10;
			div *= 10;
			System.out.println(div);
		}
	
		div /= 10;
		if (c.check(inp, div)) {
			System.out.println("input is circular pno");
		} else {
			System.out.println("not cpno");
		}

	}

	public boolean check(int input, int divisibilty) {
		int circular = input;
		;
		boolean flag = true;
		do {
			circular = circulate(circular, divisibilty);
			System.out.println(circular);
			if (!isPrime(circular)) {
				return false;
			}
		} while (circular != input);
		return true;
	}
}
