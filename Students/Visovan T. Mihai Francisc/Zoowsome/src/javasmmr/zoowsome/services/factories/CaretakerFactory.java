package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.services.factories.EmployeeFactory;
import javasmmr.zoowsome.models.employees.*;
import java.math.BigDecimal;
import java.util.Random;


public class CaretakerFactory extends EmployeeFactory {  
	 //@Override  
	BigDecimal first = new BigDecimal("950.02");
	BigDecimal second = new BigDecimal("100.00");
	
	Random random = new Random();
	 public Employee getEmployee(String type){
		 	if(Constants.Employee.Caretaker.TCO_KILLED.equals(type) 
		 		|| Constants.Employee.Caretaker.TCO_NO_TIME.equals(type) 
		 		|| Constants.Employee.Caretaker.TCO_SUCCESS.equals(type)){
		 			int name = random.nextInt(Constants.EMPLOYEES.length);
		 			BigDecimal salary = second.subtract(first);
		 			int workinghours = random.nextInt(Constants.WORKINGHOURS.length);
		 			return new Caretaker(Constants.EMPLOYEES[name],salary,false,workinghours);
		 	}
		 	else{
		 		return null;
		 	}
	 }
}
		
	
	
	
	
	/*public EmployeeAbstractFactory getEmployeeFactory(String type) {   
		 if (Constants.Employee.CARETAKER.equals(type)) {   
			 return new CaretakerFactory();}
			 else{
				 return null;
			}    
		 }  */
	
	