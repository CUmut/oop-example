package StudentPolymorphismInheritance;

import java.util.Date;

public class GraduateStudent extends Student {

	protected String advisor;
	protected String thesis;

	public GraduateStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
		super(no, name, year, dob, major);

	}

	@Override
	public void study() {
		System.out.println("Graduate Student");
	}

	@Override
	public void register() {

	}

	public void writeTheSis() {
		System.out.println("Write TheSis");
	}

	public void meetWithAdvisor() {
		System.out.println("Meet Advisor");

	}

}
