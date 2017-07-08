package scjp;

public class Exception2 {
public static void main(String[] args) {
float f=1/3;
int ii=1/3;
//float b=1.01 illegal decl
double d=999d;
Integer i = new Integer (42);
Long l = new Long (42);
Double dd = new Double (42.0);
System.out.println(i.equals(42)+""+dd.equals(i)+""+l.equals(dd));

}
void waitForSignal() {
	 Object obj = new Object();
	synchronized (Thread.currentThread()) {
	// obj.wait(); this line vl throw an exception
	obj.notify();
	}
	 }
}
