package javasmmr.zoowsome.models.animals;

import java.time.LocalDateTime;

public class Eagle extends Bird{
	
	//constructors
	public Eagle(){
		this (1200, true, "Eagle", 2, 2.8, 0.4);
	}
	
	public Eagle(int avgFlightAltitude, Boolean migrates, String name, int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		super.setAvgFlightAltitude(avgFlightAltitude);
		super.setMigrates(migrates);
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);
	}
	
	//methods
	@Override
	public double getPredisposition(){
		int hour = LocalDateTime.now().getHour();
		if (hour > 10 && hour < 18){
			return 0.25;
		}
		else {
			return 0.0;	
		}
	}
}

