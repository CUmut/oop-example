package persistenceExample.test;

import persistenceExample.dao.EmployeeDao;
import persistenceExample.domain.Employee;
import persistenceExample.service.EmployeeService;

public class Test {
	public static void main(String[] args) {
		EmployeeDao employeeDao = new EmployeeDao();
		EmployeeService employeeService = new EmployeeService(employeeDao);

		Employee employee = new Employee(1234, "Umut", 5, "Production", "132412");
		employeeService.createEmployee(employee);
		employeeService.changePassword(employee, "aaa1234");
	}

}
