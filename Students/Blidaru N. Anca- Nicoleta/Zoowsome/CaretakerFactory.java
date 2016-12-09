package javasmmr.zoowsome.services.factories;

import java.math.BigDecimal;
import java.util.Random;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;

public class CaretakerFactory extends EmployeeFactory {

	@Override
	public Employee getEmployee(String type) throws Exception {

		int randomName;
		Random random = new Random();
		randomName = random.nextInt(Constants.Employees.Caretakers.NAME.length);
		
		long id = (long) (Math.random() * 10000000 * 1000000);  // random number generator, pseudo-random 13 digit code
		
		
		BigDecimal salary = new BigDecimal((random.nextInt(10)+1) * 1000);
		
		double workingHours = 40.0;
		

		if (Constants.Employees.Caretakers.CARETAKER.equals(type)) {
			return new Caretaker(Constants.Employees.Caretakers.NAME[randomName], id, false, salary, workingHours);
		} 
		else {
			throw new Exception("Invalid employee exception");
		}
	}

}
