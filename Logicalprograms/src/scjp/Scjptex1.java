package scjp;

public class Scjptex1 {
	int i = 10;
	public void printValue() {
	System.out.println("Value-A");
	};
	public static void main(String argv[]){
		Scjptex1 a = new B1();
	a.printValue();
	System.out.println(a.i);
	}
}

	 class B1 extends Scjptex1{
	int i = 12;
	public void printValue() {
	System.out.print("Value-B");
	}
	}
	 