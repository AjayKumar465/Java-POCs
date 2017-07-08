package com.aj.logics;

public class BinarySearch {
	
public static void main(String[] args) {
int a[]={5,6,7,9,10},i=0;
int n=5,last=n-1,first=0,middle=(last+first)/2,search=5;

/*while(a[i]!='\0'){

System.out.println(i);
	i++;
	if(i==5)
		break;
	
}
System.out.println(i);*/
while (first <= last) {
    if (a[middle] < search)
       first = middle + 1;    
    else if (a[middle] == search) {
       System.out.println( "found");
       break;
    }
    else
       last = middle - 1;

    middle = (first + last)/2;
 }
 if (first > last)
	 System.out.println("not found");
	
}

}
