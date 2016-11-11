package avasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory {
	public Animal getAnimal(String type) throws Exception{
		if (Constants.Animals.Aquatics.Fish.equals(type)) {
			return new Fish();
		} 
		else if (Constants.Animals.Aquatics.Delphin.equals(type)) {
			return new Delphin();
		} 
		else {
			throw new Exception("Invalid animal exception!");
		}
	}

}
