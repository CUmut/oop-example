package StudentInterface;

import java.util.Date;

import StudentInterface.GraduateStudent;
import StudentInterface.PhdStudent;
import StudentInterface.RegistrationOffice;
import StudentInterface.VocationalStudent;

public class TestPolymorphism {

	public static void main(String[] args) {
		RegistrationOffice office = new RegistrationOffice();
		VocationalStudent vocationalStudent = new VocationalStudent(1, "Umut", 2021, new Date(), "major");
		office.registerStudent(vocationalStudent);

		System.out.println();

		PhdStudent g = new PhdStudent(1, "Umut", 2020, new Date(), null, null, null, true);

		if (g instanceof GraduateStudent) {
			PhdStudent p = (PhdStudent) g;
			p.study();
			System.out.println(p);
		}

		g.writePaper();

	}

}
