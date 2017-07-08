import java.util.Scanner;

public class StringReverse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter String");
	String string=sc.nextLine();
	//char[] revString;
	System.out.println("before reverse :"+string);
	char[] revString=new char[string.length()];
	int length=revString.length-1;
	for(int i=0;i<revString.length;i++){
		
		revString[i]=string.charAt(length);
		length--;
	}
	
	System.out.println(revString);
//	System.out.println(n+""+rem);
}
}
