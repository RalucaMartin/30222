package javasmmr.zoowsome.services.factories;

import java.util.Random;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Giraffe;
import javasmmr.zoowsome.models.animals.Lion;
import javasmmr.zoowsome.models.animals.Tiger;

public class MammalFactory extends SpeciesFactory{
	@Override  
	public Animal getAnimal(String type) throws Exception { 
		/*
		if (Constants.Animal.Mammal.Giraffe.equals(type)) {    
			return new Giraffe();    
		} else if (Constants.Animal.Mammal.Tiger.equals(type)) {    
			return new Tiger();  
		} else if (Constants.Animal.Mammal.Lion.equals(type)) {
			return new Lion();
		} else  { 
			throw new Exception("Invalid animal exception!");  
		}
		*/
		
		//twist2
		Random random = new Random ();
		float randomBodyTemp = random.nextFloat() +  (float) (random.nextInt(30) + 20);
		float randomPercBodyHair = random.nextFloat() +  (float)random.nextInt(100);
		
		if (Constants.Animal.Mammal.Giraffe.equals(type)) {    
			return new Giraffe(randomBodyTemp, randomPercBodyHair, super.getRandomName(), super.getRandomNrOfLegs());    
		} else if (Constants.Animal.Mammal.Tiger.equals(type)) {    
			return new Tiger(randomBodyTemp, randomPercBodyHair, super.getRandomName(), super.getRandomNrOfLegs()); 
		} else if (Constants.Animal.Mammal.Lion.equals(type)) {
			return new Lion(randomBodyTemp, randomPercBodyHair, super.getRandomName(), super.getRandomNrOfLegs());
		} else  { 
			throw new Exception("Invalid animal exception!");  
		}	
	}  
}
	