package javasmmr.zoowsome.models.animals;

public class Clownfish extends Aquatic {
	public Clownfish(int nrOfLegs, String name, int avgSwimDepth, Enum waterType, double maintenanceCost,
			double dangPerc) {
		super(maintenanceCost, dangPerc, avgSwimDepth, waterType);
		this.setName(name);
		// this.avgSwimDepth = avgSwimDepth;
		this.setNrOfLegs(nrOfLegs);
		// this.waterType = waterType;

	}

	public Clownfish() {
		super(2, 0, 20, Enum.Saltwater);
		this.setName("Nemo");
		this.setNrOfLegs(0);

	}
}
