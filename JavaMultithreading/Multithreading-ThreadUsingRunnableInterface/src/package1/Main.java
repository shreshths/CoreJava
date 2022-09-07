package package1;

public class Main {

	public static void main(String[] args) {
		
		ThreadDemo threadDemo = new ThreadDemo();
		
		Thread thread = new Thread(threadDemo);
		
		thread.start();
	}

}
