package com.aj.logics;

public class PrintingStars {
public static void main(String[] args) {
	for(int i=1;i<10;i+=2){
		//System.out.println("i"+i);
		for (int j = 0; j < 9 - i / 2; j++)
			//System.out.println("j"+j);
	        System.out.print(" ");
 		          		
		for (int j = 0; j < i; j++)
	        System.out.print("*");
		System.out.print("\n");
	}
	for (int i = 7; i > 0; i -= 2) {
	      for (int j = 0; j < 9 - i / 2; j++)
	        System.out.print(" ");

	      for (int j = 0; j < i; j++)
	        System.out.print("*");

	      System.out.print("\n");
	    }
	  
}
}
