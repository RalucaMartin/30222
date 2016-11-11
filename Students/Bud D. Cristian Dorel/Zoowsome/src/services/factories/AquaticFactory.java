package services.factories;

import models.animals.Animal;
import models.animals.Fish;
import models.animals.Dolphin;
import models.animals.Whale;

public class AquaticFactory extends SpeciesFactory{
	
	public Animal getAnimal(String type) throws Exception{
		if(Constants.Animals.Aquatic.DOLPHIN.equals(type)){
			return new Dolphin();
		} else if(Constants.Animals.Aquatic.WHALE.equals(type)){
			return new Whale();
		} else if(Constants.Animals.Aquatic.FISH.equals(type)){
			return new Fish();
		} else {
			throw new Exception("Invalid animal expectiona!");
		}
	} 
}
