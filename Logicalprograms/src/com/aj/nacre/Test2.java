package com.aj.nacre;

public class Test2 {
public static void main(String[] args) {
	Integer ii=new Integer(10);
	int j=10;
	if(ii.equals(j)){
		System.out.println(true);
	}
	char a[]={'4'};
	System.out.println((int)'z');
	String aa="hello";
	for (int i = 0; i < aa.length(); ++i) {
		  if (aa.charAt(i) >= 'a' && aa.charAt(i) <= 'z') {
		    System.out.println((int)aa.charAt(i) - (int)'a');
		  } 
		}
}
}
