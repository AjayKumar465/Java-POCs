package com.aj.practice;

public class StrongNumber {
	public static void main(String[] args) {
		int sno = 145;
		int f = 0, sum = 0, con = 0;
		int temp = sno;
		while (sno > 0) {
			f = sno % 10;
			con = f;
			// System.out.println(f);
			for (int i = 1; i < con; i++) {
				System.out.println(i);
				f = f * i;
			}
			sum = sum + f;
			System.out.println(f);
			sno = sno / 10;
		}
		if (temp == sum)
			System.out.println(sum);
	}

}
