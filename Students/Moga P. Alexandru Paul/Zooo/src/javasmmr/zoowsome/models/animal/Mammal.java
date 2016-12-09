package javasmmr.zoowsome.models.animal;

public abstract class Mammal extends Animal {
	private float normalBodyTemp;
	private float percBodyHair;
	
	
	public Mammal(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		// TODO Auto-generated constructor stub
	}
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
