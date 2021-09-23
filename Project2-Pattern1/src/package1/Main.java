/*
 * Java code to print below star pattern:
 * 
 * 		* * *
 * 		* * *
 * 		* * *
 * 		* * *
 * 		* * *
 */
package package1;

public class Main {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 3; j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}

}
