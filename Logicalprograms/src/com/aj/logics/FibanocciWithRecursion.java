package com.aj.logics;

import java.util.Scanner;

public class FibanocciWithRecursion {
	static int firstno=0,secondno=1,sum=0,count,inputno;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ener no.of fibnos:");
		inputno=sc.nextInt();
		System.out.println(firstno);
		
		fibnacciWithRecursion();
	}
	private static void fibnacciWithRecursion() {
		// TODO Auto-generated method stub
		firstno=secondno;
		secondno=sum;
		sum=firstno+secondno;
		System.out.println(sum);
		count++;
		if(count==inputno){
			return;
		}
		fibnacciWithRecursion();
		}
		
	
}
