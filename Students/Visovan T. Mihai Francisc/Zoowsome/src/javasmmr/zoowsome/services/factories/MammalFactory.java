package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.models.animals.*;

public class MammalFactory extends SpeciesFactory {  
	 @Override  
	 public Animal getAnimal(String type) {   
		 if (Constants.Animals.Mammals.TIGER.equals(type)) {   
			 return new Tiger(); }
		 else if (Constants.Animals.Mammals.COW.equals(type)) {   
				 return new Cow();   } 
		 else if(Constants.Animals.Mammals.MONKEY.equals(type)){
			 return new Monkey();	}
		 else {
			 return null;
		 }
			 //throw new Exception("Invalid animal exception!");   }  }  
		 }
}
	 
	
