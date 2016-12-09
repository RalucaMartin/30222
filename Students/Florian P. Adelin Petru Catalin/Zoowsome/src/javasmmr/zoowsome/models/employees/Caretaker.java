package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Constants;

public class Caretaker extends Employee implements Caretaker_I {

	public Double workingHours=(double) 1;
	public Caretaker() {
		this("Employee",(long) 1,BigDecimal.ZERO);
	}
	public Caretaker(String name, Long id, BigDecimal salary) {
		super(name, id, salary);
	}
	public Double getWorkingHours() {
		return workingHours;
	}
	public void setWorkingHours(Double workingHours) {
		this.workingHours = workingHours;
	}
	public String takeCareOf(Animal a) {
		if (a.kill()) {
			return Constants.Employees.Caretakers.TCO_KILLED;
		}
		if (this.workingHours < a.getMaintenanceCost()){
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		}
		a.setTakenCareOf(true);
		this.workingHours=this.workingHours-a.maintenanceCost;
		return Constants.Employees.Caretakers.TCO_SUCCESS;
	}

}
