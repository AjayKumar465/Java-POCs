package com.aj.logics;

public class RevString {
	public static void main(String[] args) {
		String st = "ajay";
		char revString[] = new char[st.length()];
		int stlength = st.length() - 1;
		for (int i = 0; i < st.length(); i++) {
			System.out.println(stlength + " " + i);
			revString[i] = st.charAt(stlength);
			--stlength;

		}
		// System.out.println(st.length()-1);
		System.out.println(revString);
		if("1"!="2")
			System.out.println(true);
	}
}
