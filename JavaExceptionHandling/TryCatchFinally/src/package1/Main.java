package package1;

public class Main {

	public static void main(String[] args) {
		
		int a = 10, b = 0;
		
		try {
			
			System.out.println("a / b = " + a/b);
			
		} catch (NullPointerException e) {
			// TODO: handle exception
		} finally {
			
			System.out.println("The exception is handled properly or not but ");
			System.out.println("the finally block is executed irrespective of ");
			System.out.println("exception occurred or not.");
		}
	}
}