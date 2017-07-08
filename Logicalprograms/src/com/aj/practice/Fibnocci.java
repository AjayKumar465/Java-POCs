package com.aj.practice;

public class Fibnocci {
//main method
public static void main(String[] args) {
	int fnum=0,snum=1,sum=0;
	System.out.println(fnum+"\n"+snum);
	for(int i=2;i<10;i++){
		sum=fnum+snum;
		System.out.println(sum);
		fnum=snum;
		snum=sum;
		
		
	}
}	
}
