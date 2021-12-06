package StudentInterface;

public class RegistrationOffice {

	public AbstractStudent getAStudent(AbstractStudent s) {
		System.out.println(s.name + "Registration Office");

		return s;
	}

	public void registerStudent(AbstractStudent s) {

		System.out.println("new Student to be registered" + " " + "Name:" + s.name + " " + "No:" + " " + s.no + " "
				+ "Date:" + " " + s.dob);

	}
}
