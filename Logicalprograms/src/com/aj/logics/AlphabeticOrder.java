package com.aj.logics;

import java.util.Scanner;

import javax.net.ssl.SSLContext;

public class AlphabeticOrder {
	public static void main(String[] args) {
		AlphabeticOrder ao = new AlphabeticOrder();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
		String input=sc.nextLine();
		ao.sort(input);
	}

	public void sort(String input) {
		int[] arr = new int[input.length()];
		for (int i = 0; i < input.length(); i++) {
			arr[i] = (int) input.charAt(i);
			// System.out.println((char) arr[i]);
		}
		for (int i = 1; i < arr.length; i++) {
			int next = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > next) {
				arr[j] = arr[j - 1];
				arr[j - 1] = next;
				j--;
			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print((char) arr[i]);
			if (i != arr.length - 1)
				System.out.print(",");
		}
	}
}
