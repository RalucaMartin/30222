package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Chameleon extends Reptile{
	public Chameleon(int nrOfLegs, String name, boolean laysEggs){
		super(0.5,0.2);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
	public Chameleon(){
		this(4, "Cameleon",true);
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
