//
//public class DeadLock {
//String str="star";
//String str1="star1";
//Thread t=new Thread("My Thread"){
//	public void run(){
//		while(true){
//		synchronized(str){
//		synchronized(str){
//			System.out.println(str);
//		}	
//		}
//	}}
//	
//
//};
//Thread tt=new Thread("My Thread2"){
//	public void run(){
//		//while(true){
//		synchronized(str){
//		synchronized(str){
//			System.out.println(str+str1);
//		}	
//		//}
//	}}
//	
//	
//};
//public static void main(String[] args) {
//	DeadLock d=new DeadLock();
//	d.t.start();
//	d.tt.start();
//}
//}
