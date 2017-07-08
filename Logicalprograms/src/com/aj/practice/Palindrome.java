package com.aj.practice;

public class Palindrome {
	public static void main(String[] args) {
		String palindrome = "MADAM";
		String temp = "";
		int length = palindrome.length() - 1;
		for (int i = 0; i < palindrome.length(); i++) {
			temp = temp + palindrome.charAt(i);
		}
		if (temp.equals(palindrome)) {
			System.out.println("palindrome");
		}
		System.out.println(temp);
	}
}
