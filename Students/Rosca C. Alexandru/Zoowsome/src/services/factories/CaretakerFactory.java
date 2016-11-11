package services.factories;
import java.util.*;
import models.employees.*;
import java.math.*;

import models.employees.Employee;

public class CaretakerFactory extends EmployeeFactory{

	Random random = new Random();
	public Employee getEmployee(String type) {
		
		if(Constants.Employees.Caretakers.CARETAKER.equals(type)){
			int name = random.nextInt(Constants.Employees.names.length);
			BigDecimal salary = new BigDecimal((random.nextInt(10)+1)* Constants.nrOfZeroSalary);
			
			double workingHours = (random.nextInt(4) + Constants.workingHours);
			
			return new Caretaker(Constants.Employees.names[name], salary, false , workingHours);
		}
		else 
			return null;
		
	}

}
