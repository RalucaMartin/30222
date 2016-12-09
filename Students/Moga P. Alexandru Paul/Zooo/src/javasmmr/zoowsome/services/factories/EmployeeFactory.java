package javasmmr.zoowsome.services.factories;

public class EmployeeFactory {
	public EmployeeAbstractFactory getEmployeeAbstractFactory(String type) throws Exception{
		if(Constants.Employees.CARETAKERS.equals(type)){
			return new CaretakersFactory();
		}
		else{
			throw new Exception("Invalid employee exception");
		}
	}

}
