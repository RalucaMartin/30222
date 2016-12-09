package javasmmr.zoowsome.models.animals;

public class Bear extends Mammal {
	public Bear(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair, double maintenanceCost,
			double dangPerc) {
		super(maintenanceCost, dangPerc, percBodyHair, normalBodyTemp);
		this.setNrOfLegs(nrOfLegs);
	}

	public Bear() {
		super(4, 0.9, 96, 35);
		this.setName("Yoghi");
		this.setNrOfLegs(4);
	}
}
