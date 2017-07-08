import java.util.Scanner;

public class FibnacciWithRecursion {
	static int first=0,second=1,sum=0,count;
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number to prnt fibb");
count=sc.nextInt();
	System.out.println("0 ");
	count=count-1;
	fibancci(count);
	
}
public static void fibancci(int n){
	
	if(n>0){
		first=second;
		second=sum;
		sum=first+second;
		System.out.println(sum);
	}else{
		return;
	}
	fibancci(n-1);
	
		
		
	
}

}
