package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;
import java.util.UUID;

import javasmmr.zoowsome.models.animal.Animal;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretakers extends Employee implements Caretakers_I{

	
	public Caretakers(String name, long id, BigDecimal salary, boolean isDead) {
		super(name, id, salary, isDead);
		// TODO Auto-generated constructor stub
	}
	public Caretakers(){
		this("Employee",6, BigDecimal.ZERO, false);
	}
	double workingHours;
	public double getWorkingHours() {
		return workingHours;
	}
	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}
	@Override
	public String takeCareOf(Animal animal) {
		if(!(animal.kill())){
			return Constants.Employees.Caretakers.TCO_KILLED;
		}
		if(this.workingHours < animal.getMaintenanceCost()){
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		}
		animal.setTakenCareOf(true);
		this.workingHours = this.workingHours - animal.getMaintenanceCost();
		return Constants.Employees.Caretakers.TCO_SUCCES;
	}
	

}
