package javasmmr.zoowsome.models.animals;

import java.time.LocalDateTime;

public class Swan extends Bird{
	
	//constructors
	public Swan(){
		this (4000, true, "Swan", 2, 2.0, 0.2);	
	}
	
	public Swan(int avgFlightAltitude, Boolean migrates, String name, int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		super.setAvgFlightAltitude(avgFlightAltitude);
		super.setMigrates(migrates);
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);
	}
	
	//methods
	@Override
	public double getPredisposition(){
		int dayOfYear = LocalDateTime.now().getDayOfYear();
		if(dayOfYear > 100 && dayOfYear < 150){
			return 0.2;
		}
		else {
			return 0.0;
		}
	}
}
