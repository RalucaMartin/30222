package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic {
	public Dolphin() {
		super();
		this.setNrOfLegs(0);
		this.setName("Dolphin");
		this.setAvgSwimDepth(300);
		this.setWaterType(WaterType.SaltWater);
	}
}
