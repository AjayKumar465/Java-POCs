package com.aj.nacre;

public class MultiplyMatrices {
	static int rowLength1, colLength1, rowLength2, colLength2;

 	public void matricesMultiply(int[][] array1, int[][] array2) {
      int[][] sum=new int[rowLength1][colLength2];
 		for(int row=0;row<rowLength1;row++){
 			int temp=0;
    	   for(int col=0;col<colLength1;col++){
    		   for(int row2=0;row2<colLength2;row2++){
    			  temp=temp+array1[col][row2]*array2[row2][col]; 
    		   }
    		  sum[row][col]=temp;
    	   }
    	   
       }
 		for(int row=0;row<2;row++){
 	    	 for(int col=0;col<2;col++){
 	    		 System.out.print(sum[row][col]+" ");
 	    	 }
 	    	 System.out.println();
 	     }
	}
 	public static void main(String[] args) {
		MultiplyMatrices m=new MultiplyMatrices();
		rowLength1=2;
		rowLength2=2;
		colLength1=2;
		colLength2=2;
		int[][] a1={{2,3},{2,3}};
		int[][] a2={{2,3},{2,3}};
		m.matricesMultiply(a1, a2);;
	}
}
