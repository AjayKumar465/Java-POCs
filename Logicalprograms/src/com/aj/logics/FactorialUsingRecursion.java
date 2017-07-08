package com.aj.logics;

import java.util.Scanner;

public class FactorialUsingRecursion {
	static int factorialNumber = 1, count = 1, inputNumber;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter input nummber");
		inputNumber = scanner.nextInt();
		findFactorial(inputNumber);
	}

	private static void findFactorial(int inputNumber2) {
		factorialNumber = factorialNumber * count;
		count++;
		if (count > inputNumber) {
			System.out.println(factorialNumber);
			return;
		}
		findFactorial(count);
	}
}
