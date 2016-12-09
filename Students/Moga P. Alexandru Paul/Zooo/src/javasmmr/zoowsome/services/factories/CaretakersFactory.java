package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.employees.Caretakers;
import javasmmr.zoowsome.models.employees.Employee;

public class CaretakersFactory extends EmployeeAbstractFactory{

	@Override
	public Employee getEmployee(String type) throws Exception {
		// TODO Auto-generated method stub
		if(Constants.Employees.CARETAKERS.equals(type)){
			return new Caretakers();
		}else{
			throw new Exception("Invalid Employee exception:");
		}
	}



}
