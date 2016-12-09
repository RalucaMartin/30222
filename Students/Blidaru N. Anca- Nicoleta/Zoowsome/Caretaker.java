package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

import interfaces.Caretaker_I;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employee implements Caretaker_I {

	private double workingHours;
	
	public Caretaker(String name, long id, boolean isDead, BigDecimal salary, double workingHours) {
		super(name, id, isDead, salary);
		setWorkingHours(workingHours);
		// TODO Auto-generated constructor stub
	}

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}

	public String takeCareOf(Animal a) {
		if (a.kill()) {
			return Constants.Employees.Caretakers.TCO_KILLED;
		}
		if (this.workingHours < a.getMaintenanceCost()) {
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		}

		a.setTakenCareOf(true);
		this.workingHours -= a.getMaintenanceCost();

		return Constants.Employees.Caretakers.TCO_SUCCESS;
	}
}
