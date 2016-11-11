package models.animals;

public class Cow extends Mammal{
	private enum CowType{
		holstein, jersey, brownswiss
	}
	
	private CowType cowType;
	
	public CowType getCowType(){
		return this.cowType;
	}
	
	public void setCowType(CowType cowType){
		this.cowType = cowType;
	}
	
	public Cow (String name, Integer normalBodyTemp, Integer percBodyHair){
		setName(name);
		setNrOfLegs(4);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
		
	}
	
	public Cow (){
		this("Cow", 36, 90);
	}
}
