package com.aj.logics;

public class Armstrong {
public static void main(String[] args) {
	int inputNumber=222;
	int remainder=0;
	int temp=inputNumber;
	int armstrongNumber=0;
	while(temp>0){
	remainder=temp%10;
	armstrongNumber=armstrongNumber+remainder*remainder*remainder;
	temp=temp/10;
	}
	if(inputNumber==armstrongNumber){
	System.out.println("input number is armstrong");
	}else{
		System.out.println("not armstrong number");
	}
}
}
