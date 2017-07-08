import java.io.IOException;

public class ThisExamp {
	public static final void main(String[] args) throws IOException {
		 int a = 0,b = 0;
		
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		ThisExamp t=new ThisExamp(1,2);
	}
	private int a,b;
	ThisExamp(int a,int b) throws IOException{
		this.a=a;
		this.b=b;
		
		System.out.write("asfsa\t".getBytes());
		System.out.format("%s",'f');
	}
	public ThisExamp() {
		// TODO Auto-generated constructor stub
	}
	public  void mainM(){
		 int b=0;
		// a=0;
	}
}
