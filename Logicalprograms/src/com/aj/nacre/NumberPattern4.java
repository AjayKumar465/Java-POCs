package com.aj.nacre;

public class NumberPattern4 {
	public static void main(String[] args) {
		NumberPattern4 np4 = new NumberPattern4();
		np4.reversePrint2(5);
	}

	public void print(int range) {
		for (int i = 1; i <= range; i++) {
			for (int j = i; j <= range; j++)
				System.out.print(j);
			System.out.println();
		}
	}

	public void reversePrint(int range) {
		for (int i = range; i >= 1; i--) {
			for (int j = i; j >= 1; j--)
				System.out.print(j);
			System.out.println();
		}
	}

	public void reversePrint1(int range) {
		for (int i = 1; i <= range; i++) {
			for (int j = range; j >= i; j--)
				System.out.print(j);
			System.out.println();
		}
	}

	public void reversePrint2(int range) {
		for (int i = range; i >= 1; i--) {
			for (int j = range; j >= i; j--)
				System.out.print(i);
			System.out.println();
		}

	}
}
