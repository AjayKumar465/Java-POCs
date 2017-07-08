package com.aj.logics;

public class Adding2noWithoutAdditionOperator {
public static void main(String[] args) {
	int j=110;
	/*So, a - ~b -1
	= a-(-b + 1) + 1
	= a + b – 1 + 1
	= a + b*/
	j=j - ~j -1;
	System.out.println(j);
		System.out.println(~4);
}
}
