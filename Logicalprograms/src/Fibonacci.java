
public class Fibonacci {
public static void main(String[] args) {
	int i=0,j=1,n,k=0,rem=0;
	System.out.println(i);
	n=9;
	for(;i<n;i++){
		System.out.print(" "+j);
		rem=k;
		k=j;
		j=j+rem;

	}
	System.out.println(i);
}
}
