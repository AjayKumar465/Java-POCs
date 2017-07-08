package com.aj.logics;

import java.util.Scanner;

public class LinearSearch {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter how many number you like to store:");
	int in=scanner.nextInt();
	int array[]=new int[in];
	System.out.println("enter "+in+" numbers");
	int i=0;int flag=1;
	while(in>0){
		System.out.print("enter number");
		array[i]=scanner.nextInt();
		i++;
		in--;
	}
	System.out.println("search location of you have entered number");
	int se=scanner.nextInt();
	for(int j=0;j<array.length;j++){
	flag=1;
	if(array[j]==se){
	System.out.println("your number is at "+j+" locaiton");
	}else{
		flag=-1;
	}
	
	}
	if(flag==-1){
		System.out.println("not found");
	}
}
}
