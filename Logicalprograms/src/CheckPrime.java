import java.util.Scanner;

public class CheckPrime {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number: ");
boolean flag=true;
	int number=sc.nextInt();
	for(int i=2;i<=number/2;i++){
		System.out.println(i);
		if(number/i==0){
			flag=false;
		}
		
		
	}
	if(flag==true){
		System.out.println("prime");
	}else{
		System.out.println("not prime");
	}
}
}
