package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal {

	public boolean kill(){
		
		if(super.randomValue < super.damagePerc)
			return true;
		else
			return false;
	}
	public Cow(){
	super(4.0,0.2);
	super.nrOfLegs = 4;
	super.normalBodyTemp = 35.5F;
	super.percBodyHair = 10.2F;
	super.name = "Cow";
	}
}
