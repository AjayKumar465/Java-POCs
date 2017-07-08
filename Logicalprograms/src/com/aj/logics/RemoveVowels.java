package com.aj.logics;

public class RemoveVowels {
public static void main(String[] args) {
	String s="ajay kumeiouar";
	char array[]=new char[s.length()];
	for(int i=0;i<s.length();i++){
		array[i]=s.charAt(i);
		//al.add(val.charAt(i));
	}
	char output[]=new char[s.length()];
	int count=0;
	while(count<s.length()){
		
		if(s.charAt(count)!='a'&&s.charAt(count)!='e'&&s.charAt(count)!='i'&&s.charAt(count)!='o'&&s.charAt(count)!='u'){
			output[count]=s.charAt(count);
			System.out.println(s.charAt(count));
		}
		count++;
		
	}
	System.out.println(output);
}
}
