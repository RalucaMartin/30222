package javasmmr.zoowsome.services.factories;

import java.util.Random;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Mosquito;
import javasmmr.zoowsome.models.animals.Spider;

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
		
		if (Constants.Animal.Insect.Mosquito.equals(type)) {    
			return new Mosquito(randomCanFly, randomIsDangerous, super.getRandomName(), super.getRandomNrOfLegs());   
		} else if (Constants.Animal.Insect.Spider.equals(type)) {    
			return new Spider(randomCanFly, randomIsDangerous, super.getRandomName(), super.getRandomNrOfLegs());  
		} else if (Constants.Animal.Insect.Butterfly.equals(type)) {
			return new Butterfly(randomCanFly, randomIsDangerous, super.getRandomName(), super.getRandomNrOfLegs());
		} else  { 
			throw new Exception("Invalid animal exception!");  
		}
	}
}

