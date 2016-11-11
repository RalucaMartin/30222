package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal{

	public Tiger(int noOfLegs, String name, float normalBodyTemp, float percBodyHair) {//toate atr cu set
		// TODO Auto-generated constructor stub
		setNoOfLegs(noOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
	public Tiger() {
		this(4, "Tigru bengalez", 50, 90); 
	}

}
