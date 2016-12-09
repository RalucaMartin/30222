package javasmmr.zoowsome.models.employees;
import java.math.BigDecimal;

import avasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.Interfeces.Caretaker_I;
import javasmmr.zoowsome.models.animals.Animal;

public class Caretaker extends Employee implements Caretaker_I{
	private double workingHours;
	
	public Caretaker(String name, BigDecimal salary, boolean isDead) {
		super(name, salary, isDead);
	}
	public Caretaker() {
		this("John",null,false);
	}
	
	public double getWorkingHours() {
		return this.workingHours;
	}
	public void setWorkingHours(double workingHours){
		this.workingHours = workingHours;
	}
	@Override
	public String takeCareOf(Animal animal) {
		if (animal.kill()) {
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


