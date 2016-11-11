package models.animals;

public class Spider extends Insect{
	private enum SpiderType{
		laceWeb, daddyLongLegs, zebraJumping
	}
	
	private SpiderType spiderType;
	
	public SpiderType getSpiderType(){
		return this.spiderType;
	}
	
	public void setSpiderType(SpiderType spiderType){
		this.spiderType = spiderType;
	}
	
	public Spider (String name, boolean canFly, boolean isDangerous ){
		setName(name);
		setNrOfLegs(8);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
		
	}
	
	public Spider (){
		this("Spider", false, true);
	}
}
