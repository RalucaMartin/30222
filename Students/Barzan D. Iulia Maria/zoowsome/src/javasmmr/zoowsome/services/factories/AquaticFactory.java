package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory {
	public Animal getAnimal(String type) throws Exception {
		 
		 		if (Constants.Animals.Aquatics.WHALE.equals(type)) {
		 			return new Whale(); // leave empty constructor, for now!
		 		} 
		 		else if (Constants.Animals.Aquatics.CRUSTACEAN.equals(type)) {
		 			return new Crustacean();
		 		} 
		 		else if (Constants.Animals.Aquatics.FISH.equals(type)) {
		 			return new Fish();
		 		} 
		 		else {
		 				throw new Exception("Invalid animal exception!");
		 			 }
}
}
