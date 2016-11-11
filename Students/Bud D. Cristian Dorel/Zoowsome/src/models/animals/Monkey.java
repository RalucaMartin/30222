package models.animals;

public class Monkey extends Mammal{
	private enum MonkeyType{
		squirrel, spider, goldenface
	}
	
	private MonkeyType monkeyType;
	
	public MonkeyType getMonkeyType(){
		return this.monkeyType;
	}
	
	public void setMonkeyType(MonkeyType monkeyType){
		this.monkeyType = monkeyType;
	}
	
	public Monkey (String name, Integer normalBodyTemp, Integer percBodyHair){
		setName(name);
		setNrOfLegs(4);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
		
	}
	
	public Monkey (){
		this("Monkey", 37, 96);
	}
}
