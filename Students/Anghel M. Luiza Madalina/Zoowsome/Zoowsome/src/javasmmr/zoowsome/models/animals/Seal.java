package javasmmr.zoowsome.models.animals;

public class Seal extends Aquatic {
	public Seal() {
		super();
		this.setNrOfLegs(0);
		this.setName("Seal");
		this.setAvgSwimDepth(4100);
		this.setWaterType(WaterType.SaltWater);
	}
}
