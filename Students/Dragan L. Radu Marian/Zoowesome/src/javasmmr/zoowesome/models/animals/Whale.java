package javasmmr.zoowesome.models.animals;

public class Whale extends Aquatic {
	
	public Whale() {
		setNrOfLegs(0);
		setName("Biggy");
		setAvgSwimDepth(1400);
	}
	
	public Whale ( String name, Integer avgSwimDepth) {
		setNrOfLegs(0);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
	}

}