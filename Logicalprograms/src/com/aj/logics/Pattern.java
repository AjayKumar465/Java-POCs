package com.aj.logics;

public class Pattern {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i += 2) {
			// System.out.println("sd");
//			for (int j = 0; j < 9 - i / 2; j++) {
//				System.out.print(" ");
//			}
			for (int k = 1; k < i; k += 2){
				System.out.print(k);
			//System.out.print("  "); 
			}
			System.out.println();
		}
		System.out.println("\"3256\" == "+convert_String_To_Number("325dgdf6"));
        System.out.println("\"76289\" == "+convert_String_To_Number("76289"));
        System.out.println("\"90087\" == "+convert_String_To_Number("90087"));
   
	}
	 public static int convert_String_To_Number(String numStr){
         
	        char ch[] = numStr.toCharArray();
	        int sum = 0;
	        //get ascii value for zero
	        int zeroAscii = (int)'0';
	        for(char c:ch){
	            int tmpAscii = (int)c;
	            sum = (sum*10)+(tmpAscii-zeroAscii);
	        }
	        return sum;
	    }
	     
	   
	         
}
