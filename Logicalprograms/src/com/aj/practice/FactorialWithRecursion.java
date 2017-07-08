package com.aj.practice;

public class FactorialWithRecursion {
	static long count = 1, num = 5, fnum = 1;

	// main method
	public static void main(String[] args) {
		System.out.println(findFactorial());;
		//System.out.println(fnum);
	}

	// for find factorial of given number with recursion
	public static long findFactorial() {
			
		fnum = fnum * count;
		count++;
		System.out.println(count);
		if (count > num){
			return fnum;}
		else{
			findFactorial();
		
		}return fnum;

	}
}
