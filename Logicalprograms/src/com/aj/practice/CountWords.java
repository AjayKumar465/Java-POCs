package com.aj.practice;

import java.util.Scanner;

public class CountWords {
	public void find(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if ((i > 0) && (str.charAt(i) != ' ') && str.charAt(i - 1) == ' ' || str.charAt(0) != ' ' && i == 0)
				count++;
		}
		System.out.println("Words are " + count);
	}

	public static void main(String[] args) {
		CountWords cw = new CountWords();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence for count");
		;
		cw.find(sc.nextLine());
	}
}
