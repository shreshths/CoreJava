package package1;

public class Main {

	public static void main(String[] args) {
		
		int a = 10, b = 0;
		
		try {
			
			System.out.println("a / b = " + a/b);
			
		} catch (ArithmeticException e) {
			System.out.println("Can't be devided by 0");
		}
	}

}