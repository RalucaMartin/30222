package zoowsome.models.animals;

public class Whale extends Aquatic {

	public Whale() {
		setNrOfLegs(0);
		setName("Whale");
		super.setWatertype(watertype.Saltwater);
		super.setAvgSwimDepth(1700);
	}
	
	public Whale(int nrOfLegs, String name, watertype type, int avgSwimDepth) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		super.setWatertype(type);
		super.setAvgSwimDepth(avgSwimDepth);
	}
}
