package javasmmr.zoowsome.models.animals;


public class Jellyfish extends Aquatic{
	public Jellyfish(int nrOfLegs,String name,int avgSwimDepth,water waterType) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);	
	}
	public Jellyfish() {
		this(8,"Meduza",800,water.saltwater);
	}

}
