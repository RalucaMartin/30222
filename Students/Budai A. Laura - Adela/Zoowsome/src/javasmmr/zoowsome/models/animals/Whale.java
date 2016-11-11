package javasmmr.zoowsome.models.animals;

public class Whale extends Aquatic {
	public Whale(){
		super();
		this.setNrOfLegs(0);
		this.setName("Whale");
		this.setAvgSwimDepth(900);
		this.setWaterType(waterType.saltwater);
	}
}
