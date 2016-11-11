package models.animals;

public class Tiger extends Mammal{
	private enum TigerType{
		sumatran, bengal, siberian
	}
	
	private TigerType tigerType;
	
	public TigerType getTigerType(){
		return this.tigerType;
	}
	
	public void setTigerType(TigerType tigerType){
		this.tigerType = tigerType;
	}
	
	public Tiger (String name, Integer normalBodyTemp, Integer percBodyHair){
		setName(name);
		setNrOfLegs(4);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
		
	}
	public Tiger (){
		this("Tiger", 38, 95);
	}
}
