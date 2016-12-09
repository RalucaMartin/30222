package javasmmr.zoowsome.models.animals;

public class Salmon extends Aquatic{

	public Salmon(int noOfLegs, String name, int avgSwimDepth, Water waterType){
		setNoOfLegs(noOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);		
	}
	
	public Salmon() {
		// TODO Auto-generated constructor stub
		this(0, "Somon", 50, Water.FRESHWATER);
	}

}
