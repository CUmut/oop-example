package StudentPolymorphismInheritance;

import java.util.Date;

public class PhdStudent extends GraduateStudent {

	public PhdStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
		super(no, name, year, dob, major, advisor, thesis);
		// TODO Auto-generated constructor stub
	}

	boolean qualifyingExamTaken;

	@Override
	public void study() {
		System.out.println("Phd Student is studying..");

	}

	@Override
	public void register() {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeTheSis() {
		// TODO Auto-generated method stub

	}

	@Override
	public void meetWithAdvisor() {
		System.out.println("Talking with Advisor....");
	}

	public void writePaper() {
		if (qualifyingExamTaken == true) {
			System.out.println("Paper Written " + "Name: " + name + "No:" + no);
		} else {
			System.out.println("Paper is not written " + "Name: " + name + "No:" + no);
		}

	}

}
