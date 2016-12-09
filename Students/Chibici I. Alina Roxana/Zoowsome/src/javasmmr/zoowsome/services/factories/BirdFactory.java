package javasmmr.zoowsome.services.factories;

import java.util.Random;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Eagle;
import javasmmr.zoowsome.models.animals.Parrot;
import javasmmr.zoowsome.models.animals.Swan;

public class BirdFactory extends SpeciesFactory{
	@Override  
	public Animal getAnimal(String type) throws Exception {
		/*
		if (Constants.Animal.Bird.Parrot.equals(type)) {    
			return new Parrot();   
		} else if (Constants.Animal.Bird.Eagle.equals(type)) {    
			return new Eagle();  
		} else if (Constants.Animal.Bird.Swan.equals(type)) {
			return new Swan(); 
		} else  { 
			throw new Exception("Invalid animal exception!");  
		}
		*/
		
		//twist 2
		Random random = new Random ();
		int randomAvgFlightAltitude = random.nextInt(3000);
		boolean randomMigrates = random.nextBoolean();
		
		if (Constants.Animal.Bird.Parrot.equals(type)) {    
			return new Parrot(randomAvgFlightAltitude, randomMigrates, super.getRandomName(), super.getRandomNrOfLegs());   
		} else if (Constants.Animal.Bird.Eagle.equals(type)) {    
			return new Eagle(randomAvgFlightAltitude, randomMigrates, super.getRandomName(), super.getRandomNrOfLegs());  
		} else if (Constants.Animal.Bird.Swan.equals(type)) {
			return new Swan(randomAvgFlightAltitude, randomMigrates, super.getRandomName(), super.getRandomNrOfLegs()); 
		} else  { 
			throw new Exception("Invalid animal exception!");  
		}
	}
}
	
