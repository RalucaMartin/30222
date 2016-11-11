package models.employees;

import java.math.BigDecimal;

import models.animals.Animal;
import models.animals.Constants;

public class Caretaker extends Employee implements Caretaker_I {
	public double workingHours;
	

	public Caretaker(String name, BigDecimal salary, boolean isDead, double workingHours){
		super(name, isDead, salary);
		setWorkingHours(workingHours);
	}
	
	public Caretaker(){
		this("Employee", BigDecimal.ZERO, false, 6);
	}
	
	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double workHours) {
		this.workingHours = workHours;
	}

	@Override
	public String takeCareOf(Animal animal) {
		if (animal.kill()){
			return Constants.Employees.Caretakers.TCO_KILLED;
		}

		if (this.workingHours < animal.getMaintenanceCost()){
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		}
			
		animal.setTakenCareOf(true);
			this.workingHours = this.workingHours - animal.getMaintenanceCost();
			return Constants.Employees.Caretakers.TCO_SUCCESS;
	}

}
