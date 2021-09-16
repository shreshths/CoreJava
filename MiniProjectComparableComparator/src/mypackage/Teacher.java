package mypackage;

public class Teacher implements Comparable<Teacher> {

	private int mob;
	private String name;
	private int exp;
	private String dept;

	public Teacher(int mob, String name, int exp, String dept) {
		super();
		this.mob = mob;
		this.name = name;
		this.exp = exp;
		this.dept = dept;
	}

	public int getMob() {
		return mob;
	}

	public void setMob(int mob) {
		this.mob = mob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	// Sort teachers by name
	@Override
	public int compareTo(Teacher o) {

		// Ascending order
		return this.name.compareTo(o.name);

		// Descending order
		// return o.name.compareTo(this.name);
	}
}
