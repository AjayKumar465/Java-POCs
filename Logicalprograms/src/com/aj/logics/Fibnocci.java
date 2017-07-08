package com.aj.logics;

public class Fibnocci {
	public static void main(String[] args) {
		int firstno = 0;
		int secondno = 1;
		int temp = 0;
		System.out.println(firstno + " " + secondno);
		for (int i = 0; i < 8; i++) {
			temp = firstno + secondno;
			System.out.println(temp);
			firstno = secondno;
			secondno = temp;
		}

	}
}