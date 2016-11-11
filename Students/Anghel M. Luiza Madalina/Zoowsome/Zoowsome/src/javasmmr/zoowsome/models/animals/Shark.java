package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {
	public Shark() {
		super();
		this.setNrOfLegs(0);
		this.setName("Shark");
		this.setAvgSwimDepth(2000);
		this.setWaterType(WaterType.SaltWater);
	}
}
