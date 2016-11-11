package zoowsome.models.animals;

public class Shark extends Aquatic {

	public Shark() {
		setNrOfLegs(0);
		setName("Shark");
		super.setWatertype(watertype.Saltwater);
		super.setAvgSwimDepth(500);
	}
	
	public Shark(int nrOfLegs, String name, watertype type, int avgSwimDepth) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		super.setWatertype(type);
		super.setAvgSwimDepth(avgSwimDepth);
	}
}
