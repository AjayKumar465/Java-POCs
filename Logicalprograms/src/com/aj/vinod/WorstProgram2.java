package com.aj.vinod;

public class WorstProgram2 {
public static void main(String[] args) {
	// Scanner sc=new Scanner(System.in);
		//System.out.println("Enter Input Value:");
		int input=12;
	      //sc.nextInt();
	   int dispValDecrease=(input*4)-4;
	    
	    int innerDispVal=dispValDecrease+1;
	    boolean flag=true;
	   int dispValIncrease=1;
	    int temp=0;
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
	             if(row%2==0){
	             System.out.print(innerDispVal++);
	              
	             }else {
	               if(flag)
	               {
	               innerDispVal+=(input-3);
	                 temp=innerDispVal;
	             flag=false;
	                 
	               }
	                  System.out.print(innerDispVal--);
	             
	             }
			   }
			   
		   }
		   
	     if(!flag)
	       innerDispVal=temp+1;
	     flag=true;
		   System.out.println();
	   }
}
}
