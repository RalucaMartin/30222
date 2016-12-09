package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Crocodile extends Reptile{
	public Crocodile(int nrOfLegs, String name, boolean laysEggs){
		super(1.0,8.0);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
	public Crocodile(){
		this(4, "Crocodile",true);
	}
	
	public boolean kill() {

		Random random = new Random();
		int ran = random.nextInt(10);
		if((ran/10) < dangerPerc) {
			return true;
		} 
		else {
			return false;
		}
	}
}
