package javasmmr.zoowsome.models.animals;

public class Whale extends Aquatic {
	public Whale(){
		this("Whale",0,1700,Enum.Saltwater);
	}
	public Whale(String name, int nrOfLegs, int avgSwimDepth, Enum waterType) {
		super(0.2,0.5);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
}
