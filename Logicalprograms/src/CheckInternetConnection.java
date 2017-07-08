import java.net.URL;
import java.net.URLConnection;

public class CheckInternetConnection {
public static void main(String[] args)throws Exception  {
	try{
	URL u=new URL("http://www.google.com");
	URLConnection con=u.openConnection();
	con.connect();
	System.out.println("connected");
}catch(Exception e){
	e.printStackTrace();
System.out.println("not connected");
}
}
}
