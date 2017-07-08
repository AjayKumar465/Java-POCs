
public class ExceptionHandling {
	static int i=0;
public static void main(String[] args) {
	start();
}

private static void start() {
	System.out.println("educa");
	i++;
	System.out.println(i);
	try{
	start();
	}catch(Error e){
		System.out.println("hi");
	}
	
}

}
