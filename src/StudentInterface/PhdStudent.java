package StudentInterface;

import java.util.Date;

public class PhdStudent extends GraduateStudent {

	boolean qualifyingExamTaken;

	public PhdStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis,
			boolean qualifyingExamTaken) {
		super(no, name, year, dob, major, advisor, thesis);
		this.qualifyingExamTaken = qualifyingExamTaken;
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub

	}

	@Override
	public void register() {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeTheSis() {
		System.out.println("Write TheSis");
	}

	@Override
	public void meetWithAdvisor() {
		System.out.println("Meet Advisor");

	}

	public void writePaper() {
		if (qualifyingExamTaken == true) {
			System.out.println("Paper Written " + "Name: " + name + "No:" + no);
		} else {
			System.out.println("Paper is not written " + "Name: " + name + "No:" + no);
		}

	}

}
