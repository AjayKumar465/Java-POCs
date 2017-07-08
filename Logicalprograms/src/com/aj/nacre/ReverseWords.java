package com.aj.nacre;

import java.util.Scanner;

public class ReverseWords {
	public static void main(String[] args) {
		ReverseWords rw = new ReverseWords();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();

		rw.reverseWords(s);
	}

	public void reverseWords(String str) {
		int start = 0, end = 0;
		String revstring = "";
		// System.out.println(str.length());
		for (int i = str.length() - 1; i > 0; i--) {
			if (i > 0 && (str.charAt(i) == ' ' && str.charAt(i - 1) != ' ')
					|| (i == str.length() - 1) && str.charAt(i) != ' ') {
				end = i;
				// System.out.println(i);
				for (int j = i; j >= 0; j--) {

					if (j == 0 && str.charAt(j) != ' ' || j > 0 && str.charAt(j) != ' ' && str.charAt(j - 1) == ' ') {
						start = j;
						revstring = revstring + reverse(start, end, str);
						break;
					}
				}
			}
		}
		System.out.println(revstring);
	}

	public static String reverse(int start, int end, String str) {
		String s = "";
		// System.out.println(start+ " "+end);
		for (int i = start; i <= end; i++) {
			s = s + str.charAt(i);
		}
		s = s + " ";
		return s;
	}
}
