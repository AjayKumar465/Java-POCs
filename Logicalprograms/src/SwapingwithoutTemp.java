
public class SwapingwithoutTemp {
public static void main(String[] args) {
	int a=10;
	int b=15;
	System.out.println("before swaping");
	System.out.println("a="+a);
	System.out.println("b="+b);
	b=a+b;
	a=b-a;
	b=b-a;
	System.out.println("After swaping");
	System.out.println("a="+a);
	System.out.println("b="+b);
}
}
