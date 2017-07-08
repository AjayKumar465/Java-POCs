package com.aj.nacre;

public class Decimal2Binaray {
	public void convert(int input) {
		int sum = 0, temp = 0, input1 = input;
		int[] ar = new int[40];
		int index = 0;
		while (input > 0) {

			ar[index++] = input % 2;
			// System.out.println(temp);

			sum = sum * 10 + temp;
			// System.out.println(sum);
			input = input / 2;
			// .out.println(input);

		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(ar[i]);
		}
	//	System.out.println(sum);
	}

	public static void main(String[] args) {
		Decimal2Binaray d2b = new Decimal2Binaray();
		d2b.convert(11);
	}
}
