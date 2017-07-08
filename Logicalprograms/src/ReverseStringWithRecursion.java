
public class ReverseStringWithRecursion {
	static String string = "madam";
	static char revString[] = new char[string.length()];
	static int i = 0;

	public static void main(String[] args) {

		int slength = revString.length - 1;
		reverseString(slength);

		System.out.println(revString);
	}

	private static void reverseString(int slength) {

		revString[i] = string.charAt(slength);
		i++;
		if (slength == 0) {
			return;
		}
		System.out.println(i);
		reverseString(slength - 1);

	}
}
