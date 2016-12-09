package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.employees.*;

public abstract class EmployeeFactory {
	public abstract Employees getEmployeeFactory(String type)
			throws Exception;
	// for each type of employee, both add specific entries in the Constants
	// class and create a factory for it.
}
