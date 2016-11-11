package models.animals;

import java.util.*;

import services.factories.Constants;

public class Snake extends Reptile{

	Date time = new Date();
	
	private boolean isPoisonous; 
	/*
	public Snake(){
		nrOfLegs = 0;
		name = "Snake";
		laysEggs = true;
		isPoisonous = true;
	}
	*/
	
	public Snake(boolean isPoisonous, boolean laysEggs){
		super(3, 0.3);
		setName("Snake");
		setNrOfLegs(0);
		this.setPoisonous(isPoisonous);
		this.laysEggs = laysEggs;
		
	}
	
	@SuppressWarnings("deprecation")
	public double getPredisposition(){
		if( time.getHours() > Constants.startHourDanger && time.getHours() < Constants.endHourDanger){
			//System.out.println("Danger");
			return Constants.percDeng;
		}
		return 0;
	}

	public boolean isPoisonous() {
		return isPoisonous;
	}

	public void setPoisonous(boolean isPoisonous) {
		this.isPoisonous = isPoisonous;
	}
	
}
