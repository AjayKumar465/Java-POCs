package scjp;

public class PasswordVald {
public static void main(String[] args) {
	String st="4350Aa@56769867";
	System.out.println(st.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}"));
	System.out.println(st.matches(".{8,15}"));
	System.out.println(st.matches("(?=.*[a-z])(?=.*[A-Z])"));
	System.out.println(st.matches("(?=.*[A-Z])"));
	System.out.println(st.matches("(?=.*[@#$%^&+=])"));
	System.out.println(st.matches("(?=\\S+$)"));




}
}
