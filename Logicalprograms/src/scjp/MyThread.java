package scjp;

public class MyThread extends Thread{
	MyThread(){
		
	}
	MyThread(Runnable r){
		super(r);
	}
	public void run(){
		System.out.println("my thread");
	}
	public static void main(String[] args) {
		new	MyThread().start();
		new MyThread(new MyRunnable()).start();
		}
}
class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("inside my runnable");
		
	}
	
}
