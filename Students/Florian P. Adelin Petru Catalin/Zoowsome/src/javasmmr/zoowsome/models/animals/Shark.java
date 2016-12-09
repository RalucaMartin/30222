package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {
	public Shark(){
		this("Shark",0,1000,Enum.Saltwater);
	}
	public Shark(String name, int nrOfLegs, int avgSwimDepth, Enum waterType) {
		super(0.2,0.5);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
}
