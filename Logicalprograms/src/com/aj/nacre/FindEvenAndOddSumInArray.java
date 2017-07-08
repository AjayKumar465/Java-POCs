package com.aj.nacre;

public class FindEvenAndOddSumInArray {
	public void sum(int[] array) {
		int evenSum = 0, oddSum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {

				evenSum += array[i];

			} else {

				oddSum += array[i];
			}

		}
		System.out.println(evenSum + "even");
		System.out.println(oddSum + "odd");
		;
	}

	public static void main(String[] args) {
		FindEvenAndOddSumInArray f = new FindEvenAndOddSumInArray();
		int[] array = { 5, 3, 2, 4, 9 };
		f.sum(array);
	}
}
