package StudentInterface;

import java.util.Date;

public class MasterStudent extends GraduateStudent {

	public MasterStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
		super(no, name, year, dob, major, advisor, thesis);
		// TODO Auto-generated constructor stub
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
	public void graduate() {
		System.out.println("Graduate....");
	}

	@Override
	public void writeTheSis() {
		System.out.println("Write TheSis");
	}

	@Override
	public void meetWithAdvisor() {
		System.out.println("Meet Advisor");

	}

}
