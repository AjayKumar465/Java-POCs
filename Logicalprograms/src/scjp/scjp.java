package scjp;

public class scjp {
public static void main(String[] args) {
	method(null);
}
public static void method(Object o){
	System.out.println("object impl");
} 
public static void method(String o){
	System.out.println("String impl");
} 
}
