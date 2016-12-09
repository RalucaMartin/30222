package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal{
	
	public boolean kill(){
		
		if(super.randomValue < super.damagePerc)
			return true;
		else
			return false;
	}
	public Tiger(){
		super(7.0, 0.7);
		super.nrOfLegs = 4;
		super.normalBodyTemp = 37.5F;
		super.percBodyHair = 80.2F;
		super.name = "Tiger";
	}

}
