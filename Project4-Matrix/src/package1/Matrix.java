/*
 * Java program to print a 2D array or matrix.
 */
package package1;

public class Matrix {

	public static void main(String[] args) {

		int[][] m = { { 2, 5, 4 },
					  { 7, 6, 9 },
					  { 4, 3, 6 } };

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.print("\n");
		}

	}

}
