
public class StaticVariable {
	static int a = 9;

	public static void main(String[] args) {
		StaticVariable sv = new StaticVariable();
		a = 8;
		sv.display();
		StaticVariable sv1 = new StaticVariable();
		sv1.a = 45;
		sv1.display();
	}

	public void display() {
		System.out.println(a);
	}

}
