package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.models.animals.*;

public class InsectFactory extends SpeciesFactory {  
	 //@Override  
	 public Animal getAnimal(String type) {   
		 if (Constants.Animals.Insects.ANT.equals(type)) {   
			 return new Ant(); }
		 else if (Constants.Animals.Insects.BUTTERFLY.equals(type)) {   
				 return new Butterfly();   } 
		 else if (Constants.Animals.Insects.SPIDER.equals(type)){
			 return new Spider();	}
		 else {
			 return null;
		 }
			// throw new Exception("Invalid animal exception!");   } 
		 }  
	}
	 
