package javasmmr.zoowsome.services.factories;

import java.util.Random;
import javasmmr.zoowsome.models.animals.Animal;

public abstract class SpeciesFactory {
	public abstract Animal getAnimal(String type) throws Exception; 
	
	public String getRandomName(){
		Random random = new Random ();
		int randomNameGetter = random.nextInt(2);
		String randomName = "-";
		switch(randomNameGetter){
			case 0:
				randomName = "female";
			case 1: 
				randomName = "male";
		}
		return randomName;
	}
	
	public int getRandomNrOfLegs(){
		Random random = new Random();
		return random.nextInt(20);
	}
}
