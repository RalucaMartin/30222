package javasmmr.zoowsome.models.animals;

import java.time.LocalDateTime;

public class Snake extends Reptile{
	
	//constructors
	public Snake(){
		this (true, "Snake", 0, 1.5, 0.7);
	}
	
	public Snake(Boolean laysEggs, String name, int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		super.setLaysEggs(laysEggs);
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);
	}
	
	//methods
	@Override
	public double getPredisposition(){
		int month = LocalDateTime.now().getMonthValue();
		if (month < 3){
			return 0.2;
		}
		else {
			return 0.0;
		}
	}
}
