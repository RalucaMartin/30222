package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class ReptileFactory extends SpeciesFactory {
	
	public Animal getAnimal(String type) throws Exception{
		 			if(Constants.Animals.Reptiles.LIZARD.equals (type) ) {
		 				return new Lizard();
		 			} 
		 			else if(Constants.Animals.Reptiles.CHAMELEON.equals (type) ) {
						return new Chameleon();
		 			} 
		 			else if(Constants.Animals.Reptiles.CROCODILE.equals (type) ) {
		 					return new Crocodile();
		 				} 
		 			else {
		 					throw new Exception ("Invalid animal expectiona!") ;
		 				 }
		 		}

}