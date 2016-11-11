package services.factories.employee;

import models.employees.Employee;

public abstract class EmployeeFactory{
	public abstract Employee getEmployeeFactory(String type) throws Exception;

}
