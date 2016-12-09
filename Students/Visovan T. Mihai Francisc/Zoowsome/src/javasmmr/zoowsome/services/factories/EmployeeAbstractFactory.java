package javasmmr.zoowsome.services.factories;
//import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.services.factories.Constants;

public class EmployeeAbstractFactory {

	public EmployeeFactory getEmployeeFactory(String type){
		if(Constants.Employee.CARETAKER.equals(type)){
		    return new CaretakerFactory();}
		else {
			return null;}
}
}
