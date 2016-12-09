package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employee {
	
	Double workingHours;
	
	public Double getWorkingHours() {
		return this.workingHours;
	}
	public void setWorkingHours(Double workingHours) {
		this.workingHours = workingHours;
	}
	
	public Caretaker(String name, BigDecimal salary, boolean isDead, double workingHours) {
		this.setName(name);
		this.setId(id);
		this.setSalary(salary);
		this.setIsDead(isDead);
		this.setWorkingHours(workingHours);
	}
	
	public Caretaker() {
		this.setName("Employee");
		this.setId(id);
		this.setSalary(BigDecimal.ZERO);
		this.setIsDead(false);
		this.setWorkingHours(8.0);
	}
	
	public String takeCareOf(Animal animal) {
		if (animal.kill()) {
			return Constants.Employees.Caretakers.TCO_KILLED;
		}
		
		if (this.workingHours < animal.getMaintenanceCost()) {
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		}
		
		animal.setTakenCareOf(true);
		this.workingHours = this.workingHours - animal.getMaintenanceCost();
		return Constants.Employees.Caretakers.TCO_SUCCESS;
	}
}
