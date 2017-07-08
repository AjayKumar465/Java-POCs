package com.aj.nacre;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class CountWords {

	static int i, c = 0, res;
static LinkedHashSet hs=new LinkedHashSet();

	public int wordcount(String s) {
		char ch[] = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			ch[i] = s.charAt(i);
		}
		for (i = 0; i < s.length(); i++) {
			// str.charAt(i)= s.charAt(i);
			if (((i > 0) && (s.charAt(i) != ' ') && (s.charAt(i - 1) == ' ')) || ((s.charAt(0) != ' ') && (i == 0)))
			if(ch[i]>=97)
				ch[i] = (char) ( ch[i] - 32);
		}
		for (int i = 0; i < s.length(); i++) {
			System.out.print(ch[i]);
		}

		return c;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		CountWords cfCountWords = new CountWords();
		res = cfCountWords.wordcount(" Hello World");
		//System.out.println("The number of words in the String are :  " + res);
	}

}
