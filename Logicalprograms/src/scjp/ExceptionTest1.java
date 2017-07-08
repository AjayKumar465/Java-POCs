package scjp;

public class ExceptionTest1 {
	static String  o="";
public static void main(String[] args) {//z:
	o=o+2;
for(int x=3;x<8;x++){
	
	if(x==4)break;
	if(x==6)break;
	o=o+x;
}
System.out.println(o);
	
	
	try{
		System.out.println(1/0);;
	}catch(NullPointerException npe){
		System.out.println("a");
	}
	catch(Exception e){
		System.out.println("b");
	}
	finally{
		System.out.println("c");
	}
	
}
}
