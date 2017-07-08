package com.aj.logics;

public class StrongNumber {
public static void main(String[] args) {
	int in=145,remainder=0,sum=0,f=0;
	f=in;
//	Example: 145 is a strong number
//	Since 1! + 4! + 5! = 145 
	while(in>0){
		remainder=in%10;
int con=remainder;
//System.out.println(con);
		for(int i=1;i<con;i++){
		remainder=remainder*i;
		System.out.println(remainder);
		}
		//System.out.println(remainder);
		sum=remainder+sum;
		in=in/10;
	}
	System.out.println(sum);
	if(f==sum){
		System.out.println("strong");
	}
	
}
}
