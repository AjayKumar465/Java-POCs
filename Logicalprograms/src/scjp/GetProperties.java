package scjp;

public class GetProperties {
public static void main(String[] args) {
	String myProp=System.getProperty("prop.custom");
	String myProp1=System.getProperties().getProperty("prop.custom");
	//String myProp3=System.getenv("prop.custom");
	
	//
	//-Dprop.custom=gobstopper Commander;	
}


}
