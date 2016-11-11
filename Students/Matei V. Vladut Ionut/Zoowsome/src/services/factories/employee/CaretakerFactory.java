package services.factories.employee;


import models.animals.Constants;
import models.employees.*;


public class CaretakerFactory {
	public Employee getEmployeeFactory(String type) throws Exception{
		if (Constants.Employees.CARETAKER.equals(type)){
			return new Caretaker();
		}
		else{
			throw new Exception("Invalid employee exception");
		}
	}

}
