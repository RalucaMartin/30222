package models.animals;

public class Lizard extends Reptile{
	private enum LizardType{
		chameleon, iguana, leopardLizard
	}
	
	private LizardType lizardType;
	
	public LizardType getLizardType(){
		return this.lizardType;
	}
	
	public void setFishType(LizardType lizardType){
		this.lizardType = lizardType;
	}
	
	public Lizard (String name, boolean laysEggs ){
		setName(name);
		setNrOfLegs(4);
		setLaysEggs(laysEggs);
		
	}

	public Lizard (){
		this("Lizard", true);
	}
	
}
