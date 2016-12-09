package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic {
	public Dolphin(){
		this("Dolphin",0,700,Enum.Saltwater);
	}
	public Dolphin(String name, int nrOfLegs, int avgSwimDepth, Enum waterType) {
		super(0.2,0.5);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
}
