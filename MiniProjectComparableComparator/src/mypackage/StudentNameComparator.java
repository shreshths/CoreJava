package mypackage;

import java.util.Comparator;

// Sort students by name
public class StudentNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		return o1.getName().compareTo(o2.getName());
	}

}
