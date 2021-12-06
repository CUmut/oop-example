package StudentPolymorphismInheritance;

import java.util.Date;

public class VocationalStudent extends Student {

	public VocationalStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void study() {
		System.out.println("Bu öğrenci okuluna devam ediyor");

	}

	@Override
	public void register() {
		System.out.println(
				"New Vocational Student Registration completed" + " " + "Name:" + name + " " + "No:" + " " + no);

	}

}
