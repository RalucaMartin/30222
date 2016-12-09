package javasmmr.zoowsome.models.animals;

public abstract class Mammal extends Animal{
	
	public Mammal(double maintenanceCost, double damagePerc) {
		super(maintenanceCost, damagePerc);
		// TODO Auto-generated constructor stub
	}
	float normalBodyTemp;
	float percBodyHair;
	
	public float getNormalBodyTemp() {
		return normalBodyTemp;
	}
	public void setNormalBodyTemp(float normalBodyTemp) {
		this.normalBodyTemp = normalBodyTemp;
	}
	
	public float getPercBodyHair() {
		return percBodyHair;
	}
	public void setPercBodyHair(float percBodyHair) {
		this.percBodyHair = percBodyHair;
	}
	
}
