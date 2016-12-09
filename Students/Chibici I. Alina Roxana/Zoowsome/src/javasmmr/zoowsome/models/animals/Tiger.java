package javasmmr.zoowsome.models.animals;

import java.time.LocalDateTime;

public class Tiger extends Mammal{
	
	//constructors
	public Tiger(){
		this ( (float)37.5, 95, "Tiger", 4, 4.5, 0.9);	
	}
	
	public Tiger(float normalBodyTemp, float percBodyHair, String name, int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		super.setNormalBodyTemp(normalBodyTemp);
		super.setPercBodyHair(percBodyHair);
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);
	}
	
	//methods
	@Override
	public double getPredisposition(){
		int hour = LocalDateTime.now().getHour();
		if (hour >= 16 && hour <= 17){
			return -0.6; //after feeding
		}
		else {
			return 0.0;
		}
	}
}

