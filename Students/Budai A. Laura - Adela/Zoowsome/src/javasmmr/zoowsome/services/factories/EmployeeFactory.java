package javasmmr.zoowsome.services.factories;


public class EmployeeFactory {
	public EmployeeAbstractFactory getEmployeeAbstractFactory(String type) throws Exception {
		if(Constants.Employees.CARETAKER.equals(type))
			return new CaretakerFactory();
		else
			throw new Exception("Invalid employee specification");
	}
}