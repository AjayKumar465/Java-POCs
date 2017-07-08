package com.aj.practice;

public class ArmstrongNumber {
	public static void main(String[] args) {

	}

	public static int findArm(int input) {
		int remainder = 0, temp = input, sum = 0;
		while (input > 0) {
			remainder = input % 10;
			sum = sum + remainder * remainder * remainder;
			input = input / 10;
		}
		// System.out.println("n aram");
		if (sum == temp)
			return sum;
		// System.out.println("arm");
		else
			return 0;

	}
}
