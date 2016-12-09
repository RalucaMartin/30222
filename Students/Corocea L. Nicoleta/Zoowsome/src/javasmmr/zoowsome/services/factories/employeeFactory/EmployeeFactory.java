package javasmmr.zoowsome.services.factories.employeeFactory;

import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.utils.Constants;

public class EmployeeFactory {
	public EmployeeAbstractFactory getEmployeeAbstractFactory(String type) {
		if (Constants.Employee.CareTaker.equals(type)) {
			return new CareTakerFactory();
		}
		return null;

	}
}
