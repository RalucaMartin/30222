package models.employees;

import java.math.BigDecimal;

import interfaces.Caretaker_I;
import models.animals.Animal;
import services.factories.Constants;

public class Caretaker extends Employee implements Caretaker_I{

	private double workingHours;
 
	public Caretaker(String name, BigDecimal salary, boolean isDead, double workingHours){
		super(name, salary, isDead);
		count++;
		this.workingHours = workingHours;
	}
	
	public Caretaker(String name, BigDecimal salary, boolean isDead){
		super(name, salary, isDead);
	}
	
	
	public double getWorkingHours() {
		return workingHours;
	}
	
	
	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}

	@Override
	public String takeCareOf(Animal a) {
		if(a.kill()){
			return Constants.Employees.Caretakers.TCO_KILLED;
		}
		if(this.workingHours < a.getMaintenanceCost()){
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		}
		
		a.setTakenCareOf(true);
		this.workingHours = this.workingHours - a.getMaintenanceCost();
		
		return Constants.Employees.Caretakers.TCO_SUCCESS;
	}
	
}
