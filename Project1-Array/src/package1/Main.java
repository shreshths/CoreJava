/*
 * Java program to illustrate declaring, instantiating, initializing
 * & four ways of printing each value of an array of integers
 * to standard output. 
 */
package package1;

public class Main {

	public static void main(String[] args) {

		// Declaration
		int[] arr;
		// or
		// int arr[];

		// Instantiation
		arr = new int[4];

		// Initialization
		arr[0] = 4;
		arr[1] = 5;
		arr[2] = 6;
		arr[3] = 7;

		// Declaration & Instantiation
		// int[] arr = new int[4];

		// Declaration, Instantiation & Initialization
		// int[] arr = new int[] { 4, 5, 6, 7 };
		// or
		// int[] arr = { 4, 5, 6, 7 };

		// Way 1: accessing each element of the array
		for (int i = 0; i < 4; i++)
			System.out.println(arr[i]);

		// Way 2: accessing each element of the array
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

		// Way 3: accessing each element of the array
		for (int a : arr)
			System.out.println(a);

		// Way 4: accessing each element of the array
		for (var a : arr)
			System.out.println(a);
	}
}