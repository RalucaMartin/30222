package javasmmr.zoowsome.models.employees;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;
import java.math.*;

public class Caretaker extends Employee implements Caretaker_I{
	
	double workingHours;

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}
	
	public Caretaker(String name, BigDecimal salary, boolean isDead, double workingHours){
		super.isDead = isDead;
		super.name = name;
		super.salary = salary;
		this.workingHours = workingHours;
	}
	

	public String takeCareOf(Animal a) {    
		if (a.kill()) {   
			return Constants.Employee.Caretaker.TCO_KILLED;   }   
		if (this.workingHours < a.getMaintenanceCost()){ 
			return Constants.Employee.Caretaker.TCO_NO_TIME;   }       
			a.setTakenCareOf(true);
			this.workingHours = this.workingHours - a.maintenanceCost;
			return Constants.Employee.Caretaker.TCO_SUCCESS;     }

}
