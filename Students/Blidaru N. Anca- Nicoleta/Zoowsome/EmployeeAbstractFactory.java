package javasmmr.zoowsome.services.factories;

public class EmployeeAbstractFactory {

	public EmployeeFactory getEmployeeFactory(String type) throws Exception {
		
		if (Constants.Employees.Caretakers.CARETAKER.equals(type)) {
			return new CaretakerFactory();
		} 
		else {
			throw new Exception("Invalid employee exception");
		}
	}
}
