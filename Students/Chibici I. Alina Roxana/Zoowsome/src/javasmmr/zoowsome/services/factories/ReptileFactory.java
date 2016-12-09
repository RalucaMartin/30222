package javasmmr.zoowsome.services.factories;

import java.util.Random;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Lizard;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Tortoise;

public class ReptileFactory extends SpeciesFactory {
	@Override  
	public Animal getAnimal(String type) throws Exception {
		/*
		if (Constants.Animal.Reptile.Lizard.equals(type)) {    
			return new Lizard();  
		} else if (Constants.Animal.Reptile.Tortoise.equals(type)) {    
			return new Tortoise();  
		} else if (Constants.Animal.Reptile.Snake.equals(type)) {
			return new Snake();
		} else  { 
			throw new Exception("Invalid animal exception!");  
		}
		*/
		
		//twist2
		Random random = new Random ();
		boolean randomLaysEggs = random.nextBoolean();
		
		if (Constants.Animal.Reptile.Lizard.equals(type)) {    
			return new Lizard(randomLaysEggs, super.getRandomName(), super.getRandomNrOfLegs());  
		} else if (Constants.Animal.Reptile.Tortoise.equals(type)) {    
			return new Tortoise(randomLaysEggs, super.getRandomName(), super.getRandomNrOfLegs());  
		} else if (Constants.Animal.Reptile.Snake.equals(type)) {
			return new Snake(randomLaysEggs, super.getRandomName(), super.getRandomNrOfLegs());
		} else  { 
			throw new Exception("Invalid animal exception!");  
		}
	}
}
