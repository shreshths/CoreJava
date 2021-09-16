package mypackage;

public class Student implements Comparable<Student> {

	private int studentNo;
	private int rollNo;
	private String name;
	private String dept;

	public Student(int studentNo, int rollNo, String name, String dept) {
		super();
		this.studentNo = studentNo;
		this.rollNo = rollNo;
		this.name = name;
		this.dept = dept;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	// Sort students by student no.
	@Override
	public int compareTo(Student o) {

		// Ascending order
		return this.studentNo - o.studentNo;

		// Descending order
		// return o.studentNo - this.studentNo;
	}

	@Override
	// This is overridden to print the user-friendly information about the Student
	public String toString() {

		return studentNo + "\t\t" + name + "\t\t" + rollNo + "\t\t" + dept;
	}
}