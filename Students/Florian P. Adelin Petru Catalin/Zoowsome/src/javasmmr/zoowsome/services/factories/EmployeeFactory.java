package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Constants;

public abstract class EmployeeFactory {
	public EmployeeAbstractFactory getEmployeeAbstractFactory(String type) throws Exception{
		if(Constants.Employees.CARETAKER.equals(type)){
			return new CaretakerFactory();
		}
		else throw new Exception ("Invalid employee specifications");
	}
}
