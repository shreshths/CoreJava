//A Java program to sort custom objects using Comparable & Comparator interface
package mypackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Sort students by department
class CompareDeptStudent implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		return o1.getDept().compareTo(o2.getDept());
	}
}

//Sort teachers by department
class CompareDeptTeacher implements Comparator<Teacher> {

	@Override
	public int compare(Teacher o1, Teacher o2) {

		return o1.getDept().compareTo(o2.getDept());
	}

}

public class School {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<Student>();
		Teacher[] teachers = { new Teacher(500000, "Narayan", 9, "IT"), new Teacher(900000, "Hari", 14, "EE"),
				new Teacher(600000, "Dharesh", 10, "CS"), new Teacher(200000, "Nameesh", 4, "EC"),
				new Teacher(800000, "Pranav", 11, "EE"), new Teacher(400000, "Vishnu", 16, "EC"),
				new Teacher(300000, "Vibhu", 6, "IT"), new Teacher(700000, "Vasu", 15, "CS") };

		students.add(new Student(1404, 7, "Ram", "CS"));
		students.add(new Student(1110, 4, "Madhav", "EE"));
		students.add(new Student(2106, 21, "Krishna", "IT"));
		students.add(new Student(1707, 2, "Raghav", "EC"));
		students.add(new Student(1501, 11, "Mohan", "CS"));
		students.add(new Student(1906, 51, "Shyam", "IT"));
		students.add(new Student(2121, 7, "Gopal", "EC"));
		students.add(new Student(1770, 11, "Govind", "EE"));

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~| STUDENTS |~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");

		// Students sorted by student no.
		Collections.sort(students);
		System.out.println("Sorted by Student No.:\n");
		System.out.println("Student No.\tName\t\tRoll No.\tDept");
		System.out.println("-----------\t----\t\t--------\t----");

		for (Student s : students)
			System.out.println(s);

		// Students sorted by roll no.
		students.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {

				return o1.getRollNo() - o2.getRollNo();
			}

		});

		System.out.println("\n\nSorted by Roll No.:\n");
		System.out.println("Student No.\tName\t\tRoll No.\tDept");
		System.out.println("-----------\t----\t\t--------\t----");

		for (Student s : students)
			System.out.println(s);

		// Students sorted by name
		Collections.sort(students, new StudentNameComparator());
		System.out.println("\n\nSorted by Name:\n");
		System.out.println("Student No.\tName\t\tRoll No.\tDept");
		System.out.println("-----------\t----\t\t--------\t----");

		for (Student s : students)
			System.out.println(s);

		// Student sorted by department
		CompareDeptStudent compareDeptStudent = new CompareDeptStudent();
		Collections.sort(students, compareDeptStudent);
		System.out.println("\n\nSorted by Dept:\n");
		System.out.println("Student No.\tName\t\tRoll No.\tDept");
		System.out.println("-----------\t----\t\t--------\t----");

		for (Student s : students)
			System.out.println(s);

		System.out.println("\n\n\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~| TEACHERS |~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");

		// Teachers sorted by name
		Arrays.sort(teachers);
		System.out.println("Sorted by Name:\n");
		System.out.println("Name\t\tExp(years)\tDept\t      Mobile");
		System.out.println("----\t\t----------\t----\t      ------");

		for (Teacher t : teachers)
			System.out.println(t.getName() + "\t\t" + t.getExp() + "\t\t" + t.getDept() + "\t      " + t.getMob());

		// Teachers sorted by experience
		Comparator<Teacher> expComparator = new Comparator<Teacher>() {

			@Override
			public int compare(Teacher o1, Teacher o2) {

				return o1.getExp() - o2.getExp();
			}

		};

		Arrays.sort(teachers, expComparator);
		System.out.println("\n\nSorted by Exp:\n");
		System.out.println("Name\t\tExp(years)\tDept\t      Mobile");
		System.out.println("----\t\t----------\t----\t      ------");

		for (Teacher t : teachers)
			System.out.println(t.getName() + "\t\t" + t.getExp() + "\t\t" + t.getDept() + "\t      " + t.getMob());

		// Teachers sorted by department
		CompareDeptTeacher compareDeptTeacher = new CompareDeptTeacher();
		Arrays.sort(teachers, compareDeptTeacher);
		System.out.println("\n\nSorted by Dept:\n");
		System.out.println("Name\t\tExp(years)\tDept\t      Mobile");
		System.out.println("----\t\t----------\t----\t      ------");

		for (Teacher t : teachers)
			System.out.println(t.getName() + "\t\t" + t.getExp() + "\t\t" + t.getDept() + "\t      " + t.getMob());
	}
}