package javasmmr.zoowsome.models.animals;

public class Crow extends Bird {
	
	public boolean kill(){
		
		if(super.randomValue < super.damagePerc)
			return true;
		else
			return false;
	}
	public Crow(){
		super(2.0,0.2);
		super.nrOfLegs = 2;
		super.avgFlightAltitude = 300;
		super.migrates = true;
		super.name = "Crow";
		
		
	}

}
