package javasmmr.zoowsome.models.animals;

public class Frog extends Aquatic {
	public Frog(){
		super();
		this.setNrOfLegs(4);
		this.setName("Frog");
		this.setAvgSwimDepth(66);
		this.setWaterType(waterType.freshwater);
	}

}
