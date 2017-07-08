package com.aj.logics;

public class Octal2Binary {
public static void main(String[] args) {
int	inti=123,temp=0,rev=0;
while(inti>0){
	rev=inti%10+rev*10;
	inti=inti/10;
}
System.out.println(rev);
while(rev>0){
	temp=rev%10;
	switch(temp){
	case  0: System.out.print("000"); break;
    case 1: System.out.print("001"); break;
    case 2: System.out.print("010"); break;
    case 3: System.out.print("011"); break;
    case 4: System.out.print("100"); break;
    case 5: System.out.print("101"); break;
    case 6: System.out.print("110"); break;
    case 7: System.out.print("111"); break;
    default:  System.out.print("invalid number:");return;
	}
	rev=rev/10;
}	
}
}
