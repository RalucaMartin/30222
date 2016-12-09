package javasmmr.zoowsome.models.animals;

public abstract class Mammal extends Animal{
	
	//attributes
	private float normalBodyTemp;
	private float percBodyHair;
	
	//constructor
	public Mammal(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}
	
	//methods
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
	
	@Override
	public double getPredisposition(){
		return super.getPredisposition();
	}
}
