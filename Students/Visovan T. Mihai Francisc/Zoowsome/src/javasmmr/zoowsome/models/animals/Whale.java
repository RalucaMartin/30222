package javasmmr.zoowsome.models.animals;

public class Whale extends Aquatic {

	public boolean kill(){
		
		if(super.randomValue < super.damagePerc)
			return true;
		else
			return false;
	}
	public Whale(){
		super(6.0,0.8);
		super.nrOfLegs = 0;
		super.avgSwimDepth = 3000;
		super.name = "Whale";
	}
}
