package javasmmr.zoowsome.models.animals;

public class Eagle extends Bird{
	
	public boolean kill(){
		
		if(super.randomValue < super.damagePerc)
			return true;
		else
			return false;
	}
	public Eagle(){
		super(5.0,0.4);
		super.nrOfLegs = 2;
		super.avgFlightAltitude = 2000;
		super.migrates = true;
		super.name = "Eagle";
	}

}
