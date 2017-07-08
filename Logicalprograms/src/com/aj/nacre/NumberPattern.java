package com.aj.nacre;

public class NumberPattern {
	public static void main(String[] args) {
int range=5;
NumberPattern np=new NumberPattern();
np.printNP2(range);
}

	
	public void printNP2(int range){
		for(int row=range;row>=1;row--){
			for(int col=1;col<=range;col++)
				if(col<=row)
			System.out.print(col);
				else
					System.out.print(" ");
			
			for(int col=range-1;col>=1;col--)
				if(col<=row)
			System.out.print(col);
				else
					System.out.print(" ");
	System.out.println();
		}
		
		
		
		
	}
	public void printNumberP1(int range){
		for(int row=1;row<=range;row++){
			int temp=0;
			for(int space=1;space<=range-row;space++)
				System.out.print(" ");
			for(int col=1;col<=2*row-1;col++){
			//System.out.print(temp);
				if(col>row){
					System.out.print(--temp);;
				}else
				{
					System.out.print(++temp);
				}
			}
			System.out.println();
			
	}
	}}










