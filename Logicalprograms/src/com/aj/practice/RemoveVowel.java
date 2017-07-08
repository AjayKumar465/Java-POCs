package com.aj.practice;

public class RemoveVowel {
public static void main(String[] args) {
	char[] input={'a','e','k'};
	char[] array=new char[input.length];
	for(int i=0;i<input.length;i++){
		//System.out.println(i);
		if(input[i]!='a'&&input[i]!='e'&&input[i]!='i'&&input[i]!='o'&&input[i]!='u')
		{//System.out.println("asd");
			//array[i]=input[i];
		}else{
		input[i]=' ';}
	}
	//array[1]='g';
System.out.println(input);
}
}
