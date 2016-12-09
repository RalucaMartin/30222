package javasmmr.zoowsome.models.animal;


public class Dolphin extends Aquatic {

	public Dolphin() {
		this("Dolphin",0,1000,Water.SALTWATER);
	}

	public Dolphin(String name, int nrOfLegs, int avgSwimDepth, Water waterType){
		super(0.3, 0.1);
		setName(name);
		setNrOfLegs(nrOfLegs);
		setAvgSwimDetpth(avgSwimDepth);
		setWaterType(waterType);
	}
	

}
