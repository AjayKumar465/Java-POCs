package com.aj.logics;

public class FindISumOfEvenIndex {
	public static void main(String[] args) {
		  int a1[]={1,2,3,5,10,5,6};
		  int sum=0;
		   for(int i=1;i<a1.length;i++){
	
	if(i%2==0){
		System.out.println(i);
		sum=sum+a1[i];
		}}
		   System.out.println(sum);
	} 
}
