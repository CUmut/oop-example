package StudentPolymorphismInheritance;

import java.util.Date;

public class TestStudent {

	public Student getStudent() {
		Student s = null;

		int i = (int) (2 * Math.random());
		switch (i) {
		case 1:
			s = new PhdStudent(5, "İsmail", 14, null, "Mehmet", "CS", "ABC");
			break;
		case 2:
			s = new VocationalStudent(1, "Ahmet", 2021, new Date(), "major");
			break;

		}

		return s;

	}

}
