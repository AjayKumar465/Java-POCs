package com.aj.logics;

import java.util.ArrayList;
import java.util.List;

public class DecimalToBinary {
	
public static void main(String[] args) {
	int in=50,count=0;
	int temp=in;
	List l=new ArrayList();
	while(temp!=0){
		l.add(temp%2);
		temp=temp/2;
	count++;	
	}
	int size=l.size()-1;
	
	for(;size>=0;size--){
		System.out.print(l.get(size));
	}
	
}
	
}
