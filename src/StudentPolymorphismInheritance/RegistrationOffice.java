package StudentPolymorphismInheritance;

public class RegistrationOffice {

	public Student getAStudent(Student s) {
		System.out.println(s.name + "Registration Office");

		return s;
	}

	public void registerStudent(Student s) {

		System.out.println("new Student to be registered" + " " + "Name:" + s.name + " " + "No:" + " " + s.no + " "
				+ "Date:" + " " + s.dob);

	}

}
