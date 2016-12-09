package javasmmr.zoowsome.models.employees;

public class Caretakers extends Employees {

	private double workingHours;

	public double getWorkingHours() {
		return this.workingHours;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}

	public Caretakers(){
		
	}
	public Caretakers(double workingHours) {
		super();
		setWorkingHours(workingHours);
	}

}
