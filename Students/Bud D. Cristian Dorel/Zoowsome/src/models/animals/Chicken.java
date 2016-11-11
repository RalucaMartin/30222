package models.animals;

public class Chicken extends Bird{
	private enum ChickenType{
		plymouth, orpington, wyandotte
	}
	
	private ChickenType chickenType;
	
	public ChickenType getChickenType(){
		return this.chickenType;
	}
	
	public void setCockroachType(ChickenType chickenType){
		this.chickenType = chickenType;
	}
	
	public Chicken (String name, boolean migrates, Integer avgFlightAltitude){
		setName(name);
		setNrOfLegs(2);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
		
	}
	
	public Chicken(){
		this("Chicken", false, 0);
	}
}
