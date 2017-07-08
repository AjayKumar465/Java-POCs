package com.aj.nacre;

public class NubmerPattern {
	public static void main(String[] args) {
		NubmerPattern np = new NubmerPattern();
		np.print(7);
	}

	public void print(int range) {
		int temp=4*range-4;
		int temp2=1;
		//int cright = , cleft = temp, cbottom = range + 7;
		for (int row = 1; row <= range; row++) {
			for (int col = 1; col <= range; col++) {
				if (row == 1) {
					System.out.print(temp2++);
				} else if (col == 1) {
					System.out.print(temp--);
				} else if (row == range) {
					System.out.print(temp--);
				} else if (col == 5) {
					System.out.print( temp2++);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
