package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal{

	
	public Monkey(int noOfLegs, String name, float normalBodyTemp, float percBodyHair){
		setNoOfLegs(noOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
	
	public Monkey() {
		// TODO Auto-generated constructor stub
		this(4, "Urangutan", 45, 79);
	}

}
