package com.aj.nacre;

import java.util.Scanner;

public class ReverselettersInString {
	public static void main(String[] args) {
ReverselettersInString rs=new ReverselettersInString();
Scanner  sc=new Scanner(System.in);
System.out.println("Etner String");
rs.reverse(sc.nextLine());
	}

	public void reverse(String str) {
		int start = 0, end = 0;
		String op = "";
		for (int i = 0; i < str.length(); i++) {
			if (i > 0 && str.charAt(i) != ' ' && str.charAt(i - 1) == ' ' || i == 0 && str.charAt(i) != ' ') {
				start = i;
			//	System.out.println(i);
				for (int j = i; j < str.length(); j++) {
					if (j < str.length() - 1 && str.charAt(j) != ' ' && str.charAt(j + 1) == ' '
							|| j == str.length() - 1 && str.charAt(j) != ' ') {
						end = j;
					//	System.out.println(end);
						op = op + sortWord(start, end, str);
						break;
					}
				}
			}

		}
System.out.println(op);
	}

	private static String sortWord(int start, int end, String str) {
		// TODO Auto-generated method stub
		//System.out.println("h");
		String op = "";
		for (int i = end; i >= start; i--) {
			op = op + str.charAt(i);
		}
	//	System.out.println(op);
		return op+" ";
	}
}
