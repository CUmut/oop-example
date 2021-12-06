package StudentInterface;

import java.util.Date;

public class GraduateStudent extends AbstractStudent {

	protected String advisor;
	protected String thesis;

	public GraduateStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
		super(no, name, year, dob, major);
		this.advisor = advisor;
		this.thesis = thesis;
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub

	}

	@Override
	public void register() {
		// TODO Auto-generated method stub

	}

	public void graduate() {
		System.out.println("Graduate....");
	}

	public void writeTheSis() {
		System.out.println("Write TheSis");
	}

	public void meetWithAdvisor() {
		System.out.println("Meet Advisor");

	}

}
