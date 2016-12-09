package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory{
	public Animal getAnimal(String type) throws Exception{
		 			if(Constants.Animals.Birds.PARROT.equals (type) ) {
		 				return new Parrot();
		 			} 
		 			else if(Constants.Animals.Birds.HAWK.equals (type) ) {
		 				return new Hawk();
		 			} 
		 			else if(Constants.Animals.Birds.SWALLOW.equals (type) ) {
		 				return new Swallow();
		 			} 
		 			else {
		 					throw new Exception("Invalid animal expectiona!");
		 				 }

}
}
