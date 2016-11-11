package models.animals;

public class Cockroach extends Insect {
	private enum CockroachType{
		asian, albino, green
	}
	
	private CockroachType cockroachType;
	
	public CockroachType getCockroachType(){
		return this.cockroachType;
	}
	
	public void setCockroachType(CockroachType cockroachType){
		this.cockroachType = cockroachType;
	}
	
	public Cockroach (String name, boolean canFly, boolean isDangerous ){
		setName(name);
		setNrOfLegs(6);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
		
	}
	
	public Cockroach (){
		this("Cockroach", true, false);
	}
}
