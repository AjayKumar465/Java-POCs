package com.aj.nacre;

import java.util.Scanner;

public class FindEvenNumbers { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FindEvenNumbers fen = new FindEvenNumbers();
		System.out.println("Enter Start no:");
		int startNo = sc.nextInt();
		System.out.println("Enter last no:");

		int endNo = sc.nextInt();
		fen.find(++startNo, --endNo);
	}

	public void find(int startNo, int lastNo) {
		int count = 0;
		for (; startNo <= lastNo; startNo++) {
			if (startNo % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
  