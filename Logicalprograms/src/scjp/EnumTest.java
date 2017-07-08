package scjp;

public class EnumTest {
public enum Dogs{ajay,kumar,anil};
public static void main(String[] args) {
	Dogs myDogs=Dogs.ajay;
	switch(myDogs){
	case ajay:
		System.out.println("ajay");
//	case default: this is the line to get ce
		System.out.println("kumar");
	case anil:
		System.out.println("anil");
	
	}
}
}
