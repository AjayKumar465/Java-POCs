package com.aj.nacre;

import java.util.Scanner;

public class FindRepeativeLetters {
	public void find(String str, String search) {
		int chIndex[] = new int[Character.MAX_VALUE];
		boolean flag = false;
		for (int i = 0; i < str.length(); i++) {
			chIndex[(int) str.charAt(i)]++;
		}

		for (int j = 0; j < search.length(); j++) {
			for (int i = 0; i < chIndex.length; i++) {
				if (chIndex[i] >= 1) {
					if ((char) i == search.charAt(j)) {
						flag = true;
						System.out.println((char) i + " " + chIndex[i]);
						break;
					} else {
						flag = false;
					}

				}
			}
			if (flag != true)
				System.out.println(search.charAt(j) + " not found");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Word");
		FindRepeativeLetters frw = new FindRepeativeLetters();
		String str = sc.nextLine();
		System.out.println("enter character for search");
		frw.find(str, sc.nextLine());
	}
}