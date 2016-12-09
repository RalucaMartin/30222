package javasmmr.zoowsome.models.animals;

public class Whale extends Aquatic{

	public Whale(int noOfLegs, String name, int avgSwimDepth, Water waterType) {
		setNoOfLegs(noOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
		
	}
	
	public Whale() {
		// TODO Auto-generated constructor stub
		this(0, "Balena albastra", 900, Water.SALTWATER);
	}

}
