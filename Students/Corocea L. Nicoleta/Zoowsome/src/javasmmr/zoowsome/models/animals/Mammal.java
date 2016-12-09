package javasmmr.zoowsome.models.animals;

public abstract class Mammal extends Animal {
	float normalBodyTemp;
	float percBodyHair;

	public Mammal(double maintenanceCost, double dangPerc, float normalBodyTemp, float percBodyHair) {
		super(maintenanceCost, dangPerc);
		this.normalBodyTemp = normalBodyTemp;
		this.percBodyHair = percBodyHair;
		// TODO Auto-generated constructor stub
	}

}
