package models.animals;



public class Chicken extends Bird{

	public Chicken() {
		this("KFC survivor", 2, false, 1, 5.9, 0.1);
		}

	public Chicken(String name, int nrOfLegs, boolean migrates, int avgFlightAltitude, double maintenanceCost, double dangerPerc) {
		setName(name);
		setNrOfLegs(nrOfLegs);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
		}


}
