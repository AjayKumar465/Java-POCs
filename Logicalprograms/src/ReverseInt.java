import java.util.Scanner;

public class ReverseInt {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter number: ");
	int inNum=sc.nextInt();
	int tem=inNum;
	int rev=0;
	while(inNum>0){
	System.out.println(rev+" "+inNum);
	rev=inNum%10+rev*10;
	inNum=inNum/10;
	}
	System.out.println(rev);
}
}
