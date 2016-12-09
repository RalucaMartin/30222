package javasmmr.zoowsome.services.factories.animal;

import java.util.Random;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Eagle;
import javasmmr.zoowsome.models.animals.Parrot;
import javasmmr.zoowsome.models.animals.Swan;
import javasmmr.zoowsome.services.factories.Constants;

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
		
		if (Constants.Animal.Bird.PARROT.equals(type)) {    
			return new Parrot(randomAvgFlightAltitude, randomMigrates, super.getRandomName() + " Parrot", super.getRandomNrOfLegs(), super.getRandomMaintenanceCost(), 0.1);   
		} else if (Constants.Animal.Bird.EAGLE.equals(type)) {    
			return new Eagle(randomAvgFlightAltitude, randomMigrates, super.getRandomName() + " Eagle", super.getRandomNrOfLegs(), super.getRandomMaintenanceCost(), 0.5);  
		} else if (Constants.Animal.Bird.SWAN.equals(type)) {
			return new Swan(randomAvgFlightAltitude, randomMigrates, super.getRandomName() + " Swan", super.getRandomNrOfLegs(), super.getRandomMaintenanceCost(), 0.1); 
		} else  { 
			throw new Exception("Invalid animal exception!");  
		}
	}
}
	
