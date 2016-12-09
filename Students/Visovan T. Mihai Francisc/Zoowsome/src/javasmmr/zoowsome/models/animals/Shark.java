package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic{

	public boolean kill(){
		
		if(super.randomValue < super.damagePerc)
			return true;
		else
			return false;
	}
	public Shark(){
		super(7.0, 0.9);
		super.nrOfLegs = 0;
		super.avgSwimDepth = 500;
		super.name = "Shark";
	}
}
