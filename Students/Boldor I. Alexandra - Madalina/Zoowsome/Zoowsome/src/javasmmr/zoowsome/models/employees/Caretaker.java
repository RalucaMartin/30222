package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employee implements Caretaker_I {
	private double workingHours;

	public Caretaker(String name, BigDecimal salary, Boolean isDead, double workingHours) {
		super(name, salary, isDead);
		setWorkingHours(workingHours);
	}

	public Caretaker() {
		this("---", BigDecimal.ZERO, false, 0);
	}

	public double getWorkingHours() {
		return this.workingHours;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}

	@Override
	public String takeCareOf(Animal animal) {
		if (animal.kill()) {
			return Constants.Employees.Caretakers.TCO_KILLED;
		}
		if (this.workingHours < animal.getMaintenanceCost()) {
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		}
		animal.setTakenCareOf(true);
		setWorkingHours(getWorkingHours() - animal.getMaintenanceCost());
		return Constants.Employees.Caretakers.TCO_SUCCESS;
	}

}
