package scjp;

public class StringTest {
public static void main(String[] args) {
	String test="this is atest";
	String[] tokens=test.split("s");
	System.out.println(tokens.length+"");
	for(int i=0;i<4;i++){
		System.out.print(tokens[i]);
	}
}
}
