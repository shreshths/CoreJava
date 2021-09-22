package mypackage;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {

		try {
			// Creating a FileWriter object
			FileWriter fw = new FileWriter("F:\\File");

			// Writing students' data to the file
			fw.write("Ram,100\nRaj,94\nTim,96\nTom,88\nRaj,89");

			// Close the file
			fw.close();

			// Display the message
			System.out.println("Students' scores have been updated");
		} catch (Exception e) {

		}

		try {
			// Getting the scores of students into a List of String
			List<String> students = Files.readAllLines(Paths.get("F:\\File"));

			// Creating an ArrayList of Integer to store scores of
			// a given student
			ArrayList<Integer> studentScores = new ArrayList<Integer>();

			// Variable declaration
			boolean isFound = false;
			String name;
			Scanner obj = new Scanner(System.in);

			// Read data from user
			System.out.println("Enter the name of student:");
			name = obj.next();
			obj.close();

			// Getting scores of the student
			for (String s : students) {
				String data[] = s.split(",");
				if (data[0].equals(name)) {
					studentScores.add(Integer.parseInt(data[1]));
					isFound = true;
				}
			}

			// Check if the student is present for the exam or not
			if (isFound) {

				// If the student is present, then print the scores
				System.out.println("Student score(s) is/are:");
				for (int i : studentScores)
					System.out.println(i);
			} else
				// Otherwise, notify the user that the student is not present
				System.out.println("Student is absent for exam");
		} catch (Exception e) {

		}
	}
}