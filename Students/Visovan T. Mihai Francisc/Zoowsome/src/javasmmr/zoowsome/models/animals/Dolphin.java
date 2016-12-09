package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic{
	
	public boolean kill(){
		
		if(super.randomValue < super.damagePerc)
			return true;
		else
			return false;
	}
	public Dolphin(){
		super(3.0,0.1);
		super.nrOfLegs = 2;
		super.avgSwimDepth = 500;
		super.name = "Crow";
	
		
	}

}
