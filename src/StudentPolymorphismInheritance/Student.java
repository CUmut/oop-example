package StudentPolymorphismInheritance;

import java.util.Date;

public abstract class Student {

	protected int no;

	protected String name;
	protected int year;
	protected Date dob;
	protected String major;

	public Student(int no, String name, int year, Date dob, String major) {
		super();
		this.no = no;
		this.name = name;
		this.year = year;
		this.dob = dob;
		this.major = major;
	}

	public abstract void study();

	public abstract void register();

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", year=" + year + ", dob=" + dob + ", major=" + major + "]";
	}

}
