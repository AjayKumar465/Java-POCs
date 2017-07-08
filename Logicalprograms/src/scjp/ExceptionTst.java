package scjp;

public class ExceptionTst {
public void methodA(){
	ClassB classb=new ClassB();
String g=	classb.getValue();
	
}
public static void main(String[] args) {
	ExceptionTst exceptionTst=new ExceptionTst();
	exceptionTst.methodA();
}
}
class ClassB{
public ClassC classc;
	public String getValue() {
		// TODO Auto-generated method stub
		return classc.getValue();
	}
	
}
class ClassC{
public String value;
	public String getValue() {
		// TODO Auto-generated method stub
		value="ClassB";
		return value;
	}
	
	
}