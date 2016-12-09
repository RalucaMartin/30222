package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;

public class CaretakerFactory extends EmployeeFactory{


	@Override
	public Employee getEmployeeFactory(String type) {
		if ( Constants.Employees.Caretakers.CARETAKER.equals(type) ) {
			return new Caretaker();
		}
		return null;
	}

}
