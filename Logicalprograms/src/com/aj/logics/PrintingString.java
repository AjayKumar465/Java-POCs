package com.aj.logics;

public class PrintingString {

	public static void main(String[] args) {
		String s="ABCDCBA";
		int length=s.length()-1;
		for(int i=1;i<8;i+=2){
			for (int j = 0; j < 9 - i / 2; j++)
		        System.out.print(" ");
	 		          		
			for (int j = 0; j < i; j++){
				if(j<i-1){
				System.out.print(s.charAt(j));
				}else{
				System.out.print(s.charAt(length));
				}
			}
		       // System.out.print("*");
				
			System.out.print("\n");
		}
		for (int i = 5; i > 0; i -= 2) {
			//System.out.println(i);
		      for (int j = 0; j < 9 - i / 2; j++)
		        System.out.print(" ");

		      for (int j = 0; j < i; j++){
		      if(j<i-1){
		    	  System.out.print(s.charAt(j));
		      }else{
		    	  System.out.print(s.charAt(length));
		      } 
		      }
		      System.out.print("\n");
		    }
		  
	}
	}
