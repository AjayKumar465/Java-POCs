package com.aj.nacre;

public class Np {
	public static void main(String[] args) {
		Np np=new Np();
		np.print(9);
	}
	public void print(int range) {
		int temp = range, spacerange = 1, temp2 = range - 1;
		for (int i = 1; i <= range; i++) {
			for (int col = 1; col <= temp; col++) {
				System.out.print(col);

			}
			if (i != 1)
				for (int sp = 1; sp <= spacerange; sp++) {
					System.out.print(" ");
				}
			for (int col = temp2; col >= 1; col--) {
				System.out.print(col);
			}
			if (i != 1) {
				spacerange += 2;
				temp2--;
			}
			temp--;
			System.out.println();
		}
	}
}
