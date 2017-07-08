package com.aj.nacre;

public class SortArrayAndGetPrimeSum {
	public static void main(String[] args) {
		SortArrayAndGetPrimeSum sag=new SortArrayAndGetPrimeSum();
		int[] ar={9,1,4,1,7,7,4,11,5};
	sag.sortAndPrint(ar);
	}
	public void sortAndPrint(int[] ar) {
		int psum = 0;
		for (int i = 1; i < ar.length; i++) {
			int next = ar[i];
			int j = i;
			while (j > 0 && ar[j - 1] > next) {
				ar[j] = ar[j - 1];
				ar[j - 1] = next;
				j--;
			}
		}
		for (int i = 0; i < ar.length; i++)
			System.out.print(ar[i] + ",");
		for (int i = 0; i < ar.length; i++) {
			if (isPrime(ar[i])) {
				psum = psum + ar[i];
			}
		}
		System.out.println();
System.out.println(psum);
	}

	private static boolean isPrime(int j) {
		// TODO Auto-generated method stub
		boolean flag = false;
		for (int i = 2; i <=j/2; i++)
			if (j % i == 0) {
				flag = false;
				break;
			} else {
				flag = true;
			}
	//	System.out.println(flag);
		return flag;
		
	}
	
}
