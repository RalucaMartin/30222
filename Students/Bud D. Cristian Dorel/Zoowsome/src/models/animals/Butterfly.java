package models.animals;

public class Butterfly extends Insect{
	private enum ButterflyType{
		heliconians, snout, swallowtails
	}
	
	private ButterflyType butterflyType;
	
	public ButterflyType getButterflyType(){
		return this.butterflyType;
	}
	
	public void setButterflyType(ButterflyType butterflyType){
		this.butterflyType = butterflyType;
	}
	
	public Butterfly (String name, boolean canFly, boolean isDangerous ){
		setName(name);
		setNrOfLegs(6);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
		
	}
	
	public Butterfly(){
		this("Butterfly",true,true);
	}
}
