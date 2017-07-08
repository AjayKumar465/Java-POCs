package com.aj.nacre;

public class NumberFlypattern {
public static void main(String[] args) {
	int coltemp = 1;
	
	int n = 3;
	int srange = n + 1;
	boolean flag = true;
	for (int row = 1; row <= (n + 2); row++) {
		if (flag) {
			for (int col = 1; col <= row; col++)
				System.out.print(coltemp);
			for (int space = 1; space <= srange; space++)
				System.out.print(" ");
			for (int col = row; col >= 1; col--)
				System.out.print(coltemp);
			System.out.println();
			if (coltemp < (n + 2)) {

				coltemp += 2;
				srange -= 2;
			} else {

				flag = false;
			}

		} else {

			coltemp -= 2;
			// System.out.println(coltemp);
			srange = (srange + 2);

			for (int col = row; col < (n + 2) + 1; col++)
				System.out.print(coltemp);

			for (int space = 1; space <= srange; space++)
				System.out.print(" ");

			for (int col = row; col < (n + 2) + 1; col++)
				System.out.print(coltemp);
			System.out.println();
		}
	}

}
}
