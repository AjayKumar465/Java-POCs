package com.aj.practice;

public class IndiaBixProgrsm {
	 public static void main(String [] args) 
	    {
	        IndiaBixProgrsm p = new IndiaBixProgrsm();
	        p.start();
	        int i=0;
	        i=9^3;
	        System.out.println(i);
	        i=i++;
	        System.out.println(i++);
	        
	    }

	    void start() 
	    {
	        String s1 = "slip";
	      // System.out.println(fix(s1));
	        String s2 = fix(s1);
	     // System.out.println(s1);
	     //   System.out.println(s1 + " yi " + s2);
	    }

	    String fix(String s1) 
	    {
	        s1 = s1 + "stream";
	     //   System.out.println(s1 + " ");
	        return "stream";
	    }
}
