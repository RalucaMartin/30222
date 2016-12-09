package avasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;

public class CaretakerFactory extends EmployeeFactory{
	public Employee getEmployee(String type) throws Exception {
		if (Constants.Employees.Caretaker.equals(type)){
			 return new Caretaker();
		 	}
		 else{
		 	throw new Exception("Invalid employee exception");
		 	}
		
	}
}
