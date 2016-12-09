package javasmmr.zoowsome.services.factories.animal;

import java.util.Random;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Aquatic.typesOfWater;
import javasmmr.zoowsome.models.animals.Clownfish;
import javasmmr.zoowsome.models.animals.Piranha;
import javasmmr.zoowsome.models.animals.Tuna;
import javasmmr.zoowsome.services.factories.Constants;

public class AquaticFactory extends SpeciesFactory{
	
	@Override  
	public Animal getAnimal(String type) throws Exception {
		
		/*
		if (Constants.Animal.Aquatic.Clownfish.equals(type)) {    
			return new Clownfish();   
		} else if (Constants.Animal.Aquatic.Piranha.equals(type)) {    
			return new Piranha();  
		} else if (Constants.Animal.Aquatic.Tuna.equals(type)) {
			return new Tuna();
		} else  { 
			throw new Exception("Invalid animal exception!");  
		}
		*/
		
		//twist 2
		Random random = new Random ();
		int randomAvgSwimDepth = random.nextInt(10000);
		int randomWaterTypeGetter = random.nextInt(2);
		typesOfWater randomWaterType = typesOfWater.SALTWATER;
		switch(randomWaterTypeGetter){
			case 0:
				randomWaterType = typesOfWater.FRESHWATER;
			case 1: 
				randomWaterType = typesOfWater.SALTWATER;
		}
		
		if (Constants.Animal.Aquatic.CLOWNFISH.equals(type)) {    
			return new Clownfish(randomAvgSwimDepth, randomWaterType, super.getRandomName() + " Clownfish", super.getRandomNrOfLegs(),super.getRandomMaintenanceCost(),0.0);    
		} else if (Constants.Animal.Aquatic.PIRANHA.equals(type)) {    
			return new Piranha(randomAvgSwimDepth, randomWaterType, super.getRandomName() + " Piranha", super.getRandomNrOfLegs(), super.getRandomMaintenanceCost(),0.9);  
		} else if (Constants.Animal.Aquatic.TUNA.equals(type)) {
			return new Tuna(randomAvgSwimDepth, randomWaterType, super.getRandomName() + " Tuna", super.getRandomNrOfLegs(), super.getRandomMaintenanceCost(), 0.0);
		} else  { 
			throw new Exception("Invalid animal exception!");  
		}
	}
}

