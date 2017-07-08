package scjp;

public class Sc3 {
	private static float[] f = new float[2];
	 public static void main(String [] args) 
	    {
	        Sc3 s = new Sc3();
	        s.start();
	        System.out.println("f[0] = " + f[0]);
	    }
	 protected int method11(int a, int b) 
	    {
	        return 0; 
	    } 
	 int [] a = {23,22,21,20,19};

	    void start() 
	    {
	        int a = 3;
	        int b = 4;
	        System.out.print(" " + 7 + 2 + " ");
	        System.out.print(a + b);
	        System.out.print(" " + a + b + " ");
	        System.out.print(foo() + a + b + " ");
	        System.out.println(a + b + foo());
	    }

	    String foo() 
	    {
	        return "foo";
	    }
}
