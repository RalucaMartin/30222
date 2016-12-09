package javasmmr.zoowsome.models.animals;

public abstract class Mammal extends Animal {
	public Mammal(Double maintenanceCost,Double dangerPerc) {
		super(maintenanceCost,dangerPerc);
	}
	public float normalBodyTemp;
	public float percBodyHair;
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
