package javasmmr.zoowsome.models.animals;

public abstract class Insect extends Animal{
	
	//attributes
	private Boolean canFly;
	private Boolean isDangerous;
	
	//constructor 
	public Insect(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}
	
	//methods
	public Boolean getCanFly() {
		return canFly;
	}
	
	public void setCanFly(Boolean canFly) {
		this.canFly = canFly;
	}
	
	public Boolean getIsDangerous() {
		return isDangerous;
	}
	
	public void setIsDangerous(Boolean isDangerous) {
		this.isDangerous = isDangerous;
	}
	
	@Override
	public double getPredisposition(){
		return super.getPredisposition();
	}
}
