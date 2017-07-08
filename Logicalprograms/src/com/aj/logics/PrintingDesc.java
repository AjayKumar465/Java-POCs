package com.aj.logics;

public class PrintingDesc {
public static void main(String[] args) {
	 for(int i=1;i<8;i+=2){
    	 for(int j=0;j<4-i/2;j++)
    		 System.out.print(" ");
    	 for(int k=i;k>0;k-=2)
    	 {
    		 System.out.print(k);}
    	System.out.println(); 
     }
}
}
