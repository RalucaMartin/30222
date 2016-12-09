package javasmmr.zoowsome.models.animal;

public class Shark extends Aquatic {

	public Shark() {
		this("Shark",0,2000,Water.SALTWATER);
	}

	public Shark(String name, int nrOfLegs, int avgSwimDepth, Water waterType){
		super(0.3, 0.9);
		setName(name);
		setNrOfLegs(nrOfLegs);
		setAvgSwimDetpth(avgSwimDepth);
		setWaterType(waterType);
	}
	
}
