package javasmmr.zoowesome.models.animals;

public class SeaHorse extends Aquatic {
	
	public SeaHorse() {
		setNrOfLegs(0);
		setName("Viki");
		avgSwimDepth = 200;
	}
	
	public SeaHorse( String name, Integer avgSwimDepth) {
		setNrOfLegs(0);
		setName(name);
		this.avgSwimDepth = avgSwimDepth;
	}

}
