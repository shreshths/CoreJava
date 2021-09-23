/*
 * Java program to read age from the user and check if
 * it is valid[0<age<=100] or not.
 * 
 * Keep asking the user as long as he enters valid age.
 */
package package1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int age;
		Scanner obj = new Scanner(System.in);

		do {
			System.out.println("Enter the age:");
			age = obj.nextInt();
			if (age <= 0 || age > 100)
				System.out.println("Please enter valid age");
			else {
				System.out.println("Valid age");
				break;
			}
		} while (true);
		
		obj.close();
	}

}
