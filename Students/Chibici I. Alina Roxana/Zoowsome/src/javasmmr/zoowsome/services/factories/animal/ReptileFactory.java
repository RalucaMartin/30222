package javasmmr.zoowsome.services.factories.animal;

import java.util.Random;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Lizard;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Tortoise;
import javasmmr.zoowsome.services.factories.Constants;

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
		
		if (Constants.Animal.Reptile.LIZARD.equals(type)) {    
			return new Lizard(randomLaysEggs, super.getRandomName() + " Lizard", super.getRandomNrOfLegs(), super.getRandomMaintenanceCost(), 0.2);  
		} else if (Constants.Animal.Reptile.TORTOISE.equals(type)) {    
			return new Tortoise(randomLaysEggs, super.getRandomName() + " Tortoise", super.getRandomNrOfLegs(), super.getRandomMaintenanceCost(), 0.1);  
		} else if (Constants.Animal.Reptile.SNAKE.equals(type)) {
			return new Snake(randomLaysEggs, super.getRandomName() + " Snake", super.getRandomNrOfLegs(), super.getRandomMaintenanceCost(), 0.6);
		} else  { 
			throw new Exception("Invalid animal exception!");  
		}
	}
}
