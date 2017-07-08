package com.aj.practice;

public class StringPattern {
	public static void main(String[] args) {
		String input = "ABCDCBA";
		int length = input.length() - 1;
		for (int i = 1; i < 8; i += 2) {
			for (int j = 0; j < 9 - i / 2; j++)
				System.out.print(" ");
			for (int k = 0; k < i; k++) {
				if (k < i - 1) {
					System.out.print(input.charAt(k));
				} else {
					System.out.print(input.charAt(length));
				}
			}
			System.out.println();
		}
		
		for (int i = 5; i>0 ; i -= 2) {
			for (int j = 0; j < 9 - i / 2; j++)
				System.out.print(" ");
			for (int k = 0; k < i; k++) {
				if (k < i - 1) {
					System.out.print(input.charAt(k));
				} else {
					System.out.print(input.charAt(length));
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}