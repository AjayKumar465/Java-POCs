package com.aj.practice;

public class FibnocciWithRecursion {
	// main method
	static int count=1,length=10,fnum,snum=1,sum;
	public static void main(String[] args) {
printFibnocci();
	}

	// for print fibnocciSeries
	public static void printFibnocci() {
    System.out.println(sum);
    fnum=snum;
    snum=sum;
    sum=fnum+snum;
    ++count;
    if(count>length)
    	return;
    printFibnocci();
    
	}
}
