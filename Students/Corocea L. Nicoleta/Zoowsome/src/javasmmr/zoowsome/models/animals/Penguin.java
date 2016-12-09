package javasmmr.zoowsome.models.animals;

public class Penguin extends Bird {
	public Penguin(String name, int nrOfLegs, double maintenanceCost, double dangPerc, boolean migrates,
			int avgFlightAltitude) {
		super(maintenanceCost, dangPerc, migrates, avgFlightAltitude);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);

	}

	public Penguin() {
		super(5, 0, false, 0);
		this.setName("Pingu");
		this.setNrOfLegs(2);

	}
}
