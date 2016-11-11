package models.animals;

public class Eagle extends Bird{
	
	private float wingSpred;
	
	/*
	public Eagle (){
		nrOfLegs = 2;
		name = "Eagle";
		migrate = true;
		avgFlightAltitude = 1000; 
		setWingSpred(3);
	}
	*/
	
	public Eagle(float wingSpred, boolean migrate, int avgFlightAltitude){
		super(4, 0.3);
		setNrOfLegs(2);
		setName("Eagle");
		this.setWingSpred(wingSpred);
		this.migrate = migrate;
		this.avgFlightAltitude = avgFlightAltitude;
	}

	public float getWingSpred() {
		return wingSpred;
	}

	public void setWingSpred(float wingSpred) {
		this.wingSpred = wingSpred;
	}
}
