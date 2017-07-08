package com.aj.logics;

import java.io.FileNotFoundException;

public class Test {
	public static void m1() {
		m2();
	}

	private static void m2() throws NullPointerException {
		System.out.println(10 / 0);
	}

	public static void main(String[] args) {
		m1();
	}
}
