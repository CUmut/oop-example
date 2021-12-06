package StudentPolymorphismInheritance;

import java.util.Date;

public class TestPolymorphism {

	public static void main(String[] args) {

		RegistrationOffice office = new RegistrationOffice();
		VocationalStudent vocationalStudent = new VocationalStudent(1, "Umut", 2021, new Date(), "major");
		office.registerStudent(vocationalStudent);

		System.out.println();

		PhdStudent g = new PhdStudent(1, "Umut", 2020, new Date(), null, null, null);

		if (g instanceof GraduateStudent) {
			PhdStudent p = (PhdStudent) g;
			p.study();
			System.out.println(p);
		}

	}

}
