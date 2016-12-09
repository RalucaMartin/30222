package javasmmr.zoowsome.models.animals;

import java.util.Random;

public class Snake extends Reptile {
	public Snake(int nrOfLegs, String name, boolean laysEggs){
		super(0.6,7.0);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
	public Snake(){
		this(0, "Boa",true);
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
