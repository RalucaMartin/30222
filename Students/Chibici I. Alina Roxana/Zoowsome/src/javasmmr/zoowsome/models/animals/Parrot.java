package javasmmr.zoowsome.models.animals;

import java.time.LocalDateTime;

public class Parrot extends Bird{
	
	//constructors
	public Parrot(){
		this( 97, false, "Parrot", 2, 2.8, 0.1);
	}
	
	public Parrot(int avgFlightAltitude, Boolean migrates, String name, int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		super.setAvgFlightAltitude(avgFlightAltitude);
		super.setMigrates(migrates);
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);
	}
	
	//methods
	@Override
	public double getPredisposition(){
		int dayOfMonth = LocalDateTime.now().getDayOfMonth();
		if (dayOfMonth < 3){
			return 0.2;
		}
		else {
			return 0.0;
		}
	}
}
