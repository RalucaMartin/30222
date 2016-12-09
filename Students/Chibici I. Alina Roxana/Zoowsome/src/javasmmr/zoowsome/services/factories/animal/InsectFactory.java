package javasmmr.zoowsome.services.factories.animal;

import java.util.Random;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Mosquito;
import javasmmr.zoowsome.models.animals.Spider;
import javasmmr.zoowsome.services.factories.Constants;

public class InsectFactory extends SpeciesFactory{
	
	@Override  
	public Animal getAnimal(String type) throws Exception {   
		/*
		if (Constants.Animal.Insect.Mosquito.equals(type)) {    
			return new Mosquito();   
		} else if (Constants.Animal.Insect.Spider.equals(type)) {    
			return new Spider();  
		} else if (Constants.Animal.Insect.Butterfly.equals(type)) {
			return new Butterfly();
		} else  { 
			throw new Exception("Invalid animal exception!"); 
		}
		*/
		
		//twist2
		Random random = new Random ();
		boolean randomCanFly = random.nextBoolean();
		boolean randomIsDangerous = random.nextBoolean();
		
		if (Constants.Animal.Insect.MOSQUITO.equals(type)) {    
			return new Mosquito(randomCanFly, randomIsDangerous, super.getRandomName() + " Mosquito", super.getRandomNrOfLegs(), super.getRandomMaintenanceCost(), 0.2);   
		} else if (Constants.Animal.Insect.SPIDER.equals(type)) {    
			return new Spider(randomCanFly, randomIsDangerous, super.getRandomName() + " Spider", super.getRandomNrOfLegs(), super.getRandomMaintenanceCost(), 0.4);  
		} else if (Constants.Animal.Insect.BUTTERFLY.equals(type)) {
			return new Butterfly(randomCanFly, randomIsDangerous, super.getRandomName() + " Butterfly", super.getRandomNrOfLegs(), super.getRandomMaintenanceCost(), 0.0);
		} else  { 
			throw new Exception("Invalid animal exception!");  
		}
	}
}

