package javasmmr.zoowesome.models.animals;

public class SeaHorse extends Aquatic {
	
	public SeaHorse() {
		setNrOfLegs(0);
		setName("Viki");
		setAvgSwimDepth(220);
	}
	
	public SeaHorse( String name, Integer avgSwimDepth) {
		setNrOfLegs(0);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
	}

}
