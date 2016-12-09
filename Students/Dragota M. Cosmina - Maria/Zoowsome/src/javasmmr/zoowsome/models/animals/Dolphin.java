package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic{

	public Dolphin (int noOfLegs, String name, int avgSwimDepth, Water waterType) {
		setNoOfLegs(noOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
		
	}
	
	public Dolphin() {
		// TODO Auto-generated constructor stub
		this(0, "Delfinul de Amazon", 150, Water.SALTWATER);
	}

}
