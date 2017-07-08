package com.aj.vinod;

import java.util.Scanner;

public class WorstPatterNumericn {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Input Value:");
	int input=sc.nextInt();
   int dispValDecrease=(input*4)-4;
   int dispValIncrease=1;
   for(int row = 1;row<=input;row++){
	  // System.out.print("row"+row);
	   for(int col=1;col<=input;col++){
		//   System.out.print("col"+col);
		   if(row==1){
			   System.out.print(dispValIncrease++);
			   
		   }else if(row==input){
			   System.err.print(dispValDecrease--);
		   }else if(col==1){
			   System.out.print(dispValDecrease--);
		   }else if(col==input){
			   System.out.print(dispValIncrease++);
		   }else {
			   System.out.print(" ");
		   }
		   
	   }
	   
	   System.out.println();
   }
}
}
