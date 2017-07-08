package com.aj.nacre;

public class AllLogicalPrgms {
	public static void main(String[] args) {
		AllLogicalPrgms alp = new AllLogicalPrgms();
		// System.out.println(1%2);
		// alp.printBinaryPattern3(5);
		// alp.findFactorial(10);
		/*
		 * if (checkPalindrome(135)) { System.out.println("it is a palindrome");
		 * } else { findNearestPalindrome(135); }
		 */

		// alp.printTribanacci(18);
		//alp.printNumberPattern2(7);
		//alp.printVowels(4);
		//alp.converStringCharArray("hello");
	alp.StringToInt("zxcvbnma");
	}

	private static void findNearestPalindrome(int i) {
		int nearestNo1 = 0, nearestNo2 = 0;
		for (int j = i; j > 0; j++) {
			if (checkPalindrome(j)) {
				nearestNo1 = j;
				break;
			}
		}
		for (int j = i; j > 0; j--) {
			if (checkPalindrome(j)) {
				nearestNo2 = j;
				break;
			}
		}
		if (i - nearestNo2 < nearestNo1 - i)
			System.out.println(i + " is not a palindrome " + nearestNo2 + " is a nearest palindrome");
		else
			System.out.println(i + " is not a palindrome " + nearestNo1 + "is a nearest palindrome");
	}

	public void printBinaryPattern1(int input) {
		for (int row = 1; row <= input; row++) {
			for (int space = 1; space <= input - row; space++)
				System.out.print(" ");
			for (int col = 1; col <= 2 * row - 1; col++)
				System.out.print((row + col) % 2);
			System.out.println();
		}

	}

	public void printBinaryPattern2(int input) {

		for (int row = 1; row <= input; row++) {
			for (int space = 1; space <= input - row; space++)
				System.out.print(" ");
			for (int col = 1; col <= 2 * row - 1; col++)
				if ((col + row) % 2 == 0) {
					System.out.print(1);
				} else {
					System.out.print(0);
				}
			System.out.println();
		}

	}

	public void printTribanacci(int input) {
		int firstNo = 1, secondNo = 1, thirdNo = 1, temp = 0;
		System.out.print(firstNo + "\t" + secondNo + "\t" + thirdNo);
		while (input > 0) {
			temp = firstNo + secondNo + thirdNo;
			if (temp > input) {
				break;
			}
			System.out.print("\t" + temp);
			firstNo = secondNo;
			secondNo = thirdNo;
			thirdNo = temp;

			}
	}

	public void printBinaryPattern3(int input) {
		for (int row = 1; row <= input; row++) {
			for (int space = 1; space <= input - row; space++)
				System.out.print(" ");
			for (int col = 1; col <= 2 * row - 1; col++)
				if (row % 2 == 0) {
					System.out.print(col % 2 == 0 ? 1 : 0);
				} else {
					System.out.print(col % 2 == 0 ? 0 : 1);
				}
			System.out.println();
		}

	}

	public void findFactorial(int input) {
		int factorial = 1;
		for (int i = input; i > 0; i--)
			factorial = factorial * i;
		// 1=1*5
		// 5=5*4
		// 20=20*3
		// 60=60*2
		System.out.println(factorial);

	}

	public static boolean checkPalindrome(int input) {
		int revNo = 0, temp = 0, temp1 = input;
		// System.out.println(temp1);
		while (temp1 > 0) {
			temp = temp1 % 10;
			// System.out.println(temp);
			temp1 = temp1 / 10;
			// System.out.println(temp1);
			revNo = revNo * 10 + temp;
			// System.out.println(revNo);

		}
		// System.out.println(revNo);
		if (revNo == input)
			return true;
		else
			return false;

	}

	public void printNumberPattern(int range) {
		for (int row = 1; row <= range; row++) {
			int diff = range - 1;
			int temp = row;
			for (int col = 1; col <= row; col++) {

				System.out.print(temp + " ");
				temp += diff;
				--diff;
			}
			System.out.println();
		}
	}

	public void printVowels(int range) {
		char vowels[] = { 'a', 'e', 'i', 'o', 'u' };
		int startPostion = 0;
		for (int row = 1; row <= range; row++) {
			for (int space = 1; space <= range - row; space++)
				System.out.print(" ");
			for (int col = 1; col <= 2 * row - 1; col++) {
				if (startPostion == 5)
					startPostion = 0;

				System.out.print(vowels[startPostion]);
				startPostion++;
			}
			System.out.println();
		}

	}

	public void printNumberPattern2(int range) {
		int startPostion = 1;
		
		for (int row = 1; row <= range; row++) {
					for (int space = 1; space <= range - row; space++)
				System.out.print(" ");
					int temp = startPostion;
			for (int col = 1; col <= row; col++) {
				
				System.out.print(temp);
				temp -= 2;

			}
			startPostion += 2;
			System.out.println();
		}
	}
	public void converStringCharArray(String str){
		char[] strArray=new char[ str.length()];
		for(int i=0;i<str.length();i++)
			strArray[i]=str.charAt(i);
		System.out.println(strArray);
	}
	public void StringToInt(String str)
	{ //str=str.toLowerCase();
		for(int i=0;i<str.length();i++){
			if((int)str.charAt(i)>=(int)'a'&(int)str.charAt(i)<=(int)'z')
				System.out.print((int)str.charAt(i)-((int)'a'-1)+" ,");
		}
		for(int i=0;i<str.length();i++){
			if((int)str.charAt(i)>=(int)'A'&(int)str.charAt(i)<=(int)'Z')
				System.out.print((int)str.charAt(i)-(int)'A'+" ,");
		}
	}
}
