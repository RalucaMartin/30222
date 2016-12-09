package javasmmr.zoowsome.services.factories.animal;

import java.util.Random;
import javasmmr.zoowsome.models.animals.Animal;

public abstract class SpeciesFactory {
	Random random = new Random ();
	
	public abstract Animal getAnimal(String type) throws Exception; 
	
	public String getRandomName(){
		boolean randomNameGetter = random.nextBoolean();
		String randomName = "-";
		if(randomNameGetter){
				randomName = "male";
		}
		else {
				randomName = "female";
		}
		return randomName;
	}
	
	public int getRandomNrOfLegs(){
		return random.nextInt(20);
	}
	public double getRandomMaintenanceCost(){
		return random.nextDouble() + (double)random.nextInt(8);
	}
}
