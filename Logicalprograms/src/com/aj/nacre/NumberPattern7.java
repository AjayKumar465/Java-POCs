package com.aj.nacre;

public class NumberPattern7 {
	public static void main(String[] args) {
		NumberPattern7 np7 = new NumberPattern7();
		np7.print2(5);
	}

	public void print(int range) {
		int temp = range;
		for (int row = 1; row <= range; row++) {

			for (int col = range; col >= 1; col--) {
				if (row == col) {
					System.out.print("*");
				} else if (temp == col) {
					System.out.print("*");
				} else {
					System.out.print(col);
				}
			}
			temp--;
			System.out.println();
		}
	}

	public void print1(int range) {
		int temp = range;
		for (int row = 1; row <= range; row++) {

			for (int col = range; col >= 1; col--) {
				if (row == col) {
					System.out.print("1");
				} else if (temp == col) {
					System.out.print("1");
				}else{
					System.out.print(" ");
				} 
			}
			temp--;
			System.out.println();
		}
	}
	public void print2(int range){
		for(int row=range;row>=1;row--){
			int temp=row;
			for(int col=1;col<=range;col++){
				if(temp<range){
					System.out.print(temp);
					temp++;
				}else{
					System.out.print(range);
				}
			}
		System.out.println();	
		}
		
	}
}
