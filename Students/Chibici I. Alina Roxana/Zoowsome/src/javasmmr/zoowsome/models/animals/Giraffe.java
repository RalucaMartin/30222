package javasmmr.zoowsome.models.animals;

import java.time.LocalDateTime;

public class Giraffe extends Mammal{
	
	//constructors
	public Giraffe(){
		this ( (float)38.5, 95, "Giraffe", 4, 5.6, 0.2);
	}
	
	public Giraffe(float normalBodyTemp, float percBodyHair, String name, int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		super.setNormalBodyTemp(normalBodyTemp);
		super.setPercBodyHair(percBodyHair);
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);	
	}
	
	//methods
	@Override
	public double getPredisposition(){
		int period = LocalDateTime.now().getDayOfMonth();
		if (period > 14 && period < 20){
			return 0.2;
		}
		else {
			return 0.0;
		}
	}
}
