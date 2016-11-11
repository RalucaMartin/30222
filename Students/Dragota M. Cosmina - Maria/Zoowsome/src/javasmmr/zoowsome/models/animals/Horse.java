package javasmmr.zoowsome.models.animals;

public class Horse extends Mammal{
	
	public Horse(int noOfLegs, String name, float normalBodyTemp, float percBodyHair){
		setNoOfLegs(noOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}

	public Horse() {
		// TODO Auto-generated constructor stub
		this(4, "Mustang", 70, 61);
	}

}
