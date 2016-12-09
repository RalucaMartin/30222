package javasmmr.zoowsome.services.factories.employee;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.services.factories.Constants;

public class CaretakerFactory extends EmployeeFactory{

	@Override
	public Employee getEmployee(String type) throws Exception {
		BigDecimal salary = new BigDecimal (2000);
		double workingHours = 40.0;
		if (Constants.Employees.CARETAKER.equals(type)) {
			return new Caretaker(super.getRandomName()+ " Caretaker", super.getRandomId(), salary, workingHours);
		} else  { 
			throw new Exception("Invalid employee exception!");
		}
	}	
}