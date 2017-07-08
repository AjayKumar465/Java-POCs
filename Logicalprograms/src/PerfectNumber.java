import java.util.Scanner;

public class PerfectNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int inputNumber=sc.nextInt();
	int temp=0;
	for(int i=1;i<=inputNumber/2;i++){
		if(inputNumber%i==0){
			temp += i;
		}
	}
	if(temp==inputNumber){
		System.out.println(inputNumber+" is a Perfect Number");
	}else{
		System.out.println(inputNumber+" is not a Perfect Number");
	}
}
}
