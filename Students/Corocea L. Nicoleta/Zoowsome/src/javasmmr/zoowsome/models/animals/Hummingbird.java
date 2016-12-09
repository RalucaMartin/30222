package javasmmr.zoowsome.models.animals;

public class Hummingbird extends Bird {
	public Hummingbird(String name, int nrOfLegs, double maintenanceCost, double dangPerc, boolean migrates,
			int avgFlightAltitude) {
		super(maintenanceCost, dangPerc, migrates, avgFlightAltitude);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);

	}

	public Hummingbird() {
		super(2, 0.1, false, 15);
		this.setName("Hummingbird");
		this.setNrOfLegs(2);

	}
}
