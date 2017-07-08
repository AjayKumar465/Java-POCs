package com.aj.practice;

public class ReverseString {
	// main method
	public static void main(String[] args) {
		String input = "ajay";
		int inputsize = input.length() - 1;
		char[] revString = new char[input.length()];
		for (int i = 0; i < input.length(); i++) {
			revString[i] = input.charAt(inputsize);
			--inputsize;

		}
		System.out.println(revString);
	}

}
