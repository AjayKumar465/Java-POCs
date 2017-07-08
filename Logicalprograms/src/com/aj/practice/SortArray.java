package com.aj.practice;

public class SortArray {
public static void main(String[] args) {
	int[] a={2,1,7,9,5};
	int next=0;
	for(int i=1;i<a.length;i++){
		next=a[i];
		int j=i;
		while(j>0&&a[j-1]>next){
			//System.out.println("sd");
			a[j]=a[j-1];
			a[j-1]=next;
			j--;
			}
		
		//a[i-1]=next;
		
	}
	for(int i=0;i<a.length;i++)
	System.out.println(a[i]);
}
}
