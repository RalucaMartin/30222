package javasmmr.zoowsome.models.animals;

import java.time.LocalDateTime;

public class Tortoise extends Reptile{
	
	//constructors
	public Tortoise(){
		this (true, "Tortoise", 4, 5.6, 0.0);	
	}
	
	public Tortoise(Boolean laysEggs, String name, int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		super.setLaysEggs(laysEggs);
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);
	}
	
	//methods
	@Override
	public double getPredisposition(){
		int year = LocalDateTime.now().getYear();
		if (year == 2060){
			return 1.0; // the year tortoise will kill us all
		}
		else {
			return 0.0;
		}
	}
}
