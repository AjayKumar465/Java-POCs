package com.aj.logics;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
long factorial=1;
	Scanner sc=new Scanner(System.in);
	System.out.print("enter input number:");
	long input=sc.nextLong();
	for(int i=1;i<=input;++i){
		System.out.println(factorial=factorial*i);
	}
	System.out.println(factorial);
}
}
