package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory {  
	 //@Override  
	 public Animal getAnimal(String type) {   
		 if (Constants.Animals.Aquatics.SHARK.equals(type)) {   
			 return new Shark();  } 
		 else if (Constants.Animals.Aquatics.DOLPHIN.equals(type)) {   
				 return new Dolphin();   } 
		 else if(Constants.Animals.Aquatics.WHALE.equals(type)){
			 return new Whale();	}
		 else {   
			 return null;
			 //throw new Exception("Invalid animal exception!");   } 
		 }
		 }  
	}
	 
	 
