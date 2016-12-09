package javasmmr.zoowsome.models.animal;


public class Whale extends Aquatic{

	public Whale() {
		this("Whale",0,2000,Water.SALTWATER);
	}

	public Whale(String name, int nrOfLegs, int avgSwimDepth, Water waterType){
		super(0.3, 0.6);
		setName(name);
		setNrOfLegs(nrOfLegs);
		setAvgSwimDetpth(avgSwimDepth);
		setWaterType(waterType);
	}
	

}
