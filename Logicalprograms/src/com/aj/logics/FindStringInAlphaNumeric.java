package com.aj.logics;
public class FindStringInAlphaNumeric {
	public static void main(String[] args) {
     String str="ajay00123110023";
     String str1="00";
 for(int i=0;i<str.length();i++){
	 if((int)str.charAt(i)>=48&&(int)str.charAt(i)<=57){
		 str1=str1+str.charAt(i);
 System.out.println(str1);
	 }}
 System.out.println();
 float op=Integer.parseInt(str1);
 System.out.println((op));
	}
}
