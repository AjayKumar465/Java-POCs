package com.aj.practice;

public class FindAllArmstronNumbers {
	public static void main(String[] args) {
		findAllArmstronNumbers();
	}

	public static void findAllArmstronNumbers() {

		int input = 1;
		while (input < 999) {
			int getarmnumber = ArmstrongNumber.findArm(input);
			if (getarmnumber != 0) {
				System.out.println(getarmnumber);
			}
			++input;
		}
	}
}
