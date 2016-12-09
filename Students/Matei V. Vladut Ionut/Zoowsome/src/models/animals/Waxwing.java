package models.animals;


public class Waxwing extends Bird {
	

	public Waxwing() {
		this("Waxwing", 2, true, 121, 1.2, 0.1);
	}
	
	public Waxwing(String name, int nrOfLegs, boolean migrates, int avgFlightAltitude,double maintenanceCost, double dangerPerc) {
		setName(name);
		setNrOfLegs(nrOfLegs);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
		}

}
