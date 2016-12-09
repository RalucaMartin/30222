package javasmmr.zoowsome.models.animals;

public class Parrot extends Bird {
	public Parrot(String name, int nrOfLegs, double maintenanceCost, double dangPerc, boolean migrates,
			int avgFlightAltitude) {
		super(maintenanceCost, dangPerc, migrates, avgFlightAltitude);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);

	}

	public Parrot() {
		super(2, 0, false, 20);
		this.setName("Parrot");
		this.setNrOfLegs(2);

	}
}
