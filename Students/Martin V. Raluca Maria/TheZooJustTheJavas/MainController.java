package javasmmr.zoowsome.controllers;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.*;
import java.util.Random;

public class MainController {
	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory = new AnimalFactory();
		/*SpeciesFactory speciesFactory1 = 
				abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Cow);
		System.out.printf("We have an animal with %d legs!!\n", a1.getNrOfLegs());
		
		
		Animal a2 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger);
		System.out.printf("We have an animal with %d legs!!\n", a2.getNrOfLegs());
		
		
		Animal a3 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Monkey);
		System.out.printf("We have an animal with %d legs!!\n", a3.getNrOfLegs());
		
		SpeciesFactory speciesFactory2 = 
				abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
		Animal a4 = speciesFactory2.getAnimal(Constants.Animals.Reptiles.Snake);
		System.out.printf("We have an animal with %d legs!!\n", a4.getNrOfLegs());
		
		
		Animal a5 = speciesFactory2.getAnimal(Constants.Animals.Reptiles.Lizzard);
		System.out.printf("We have an animal with %d legs!!\n", a5.getNrOfLegs());
		
		Animal a6 = speciesFactory2.getAnimal(Constants.Animals.Reptiles.Crocodile);
		System.out.printf("We have an animal with %d legs!!\n", a6.getNrOfLegs());
		
		SpeciesFactory speciesFactory3 = 
				abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		Animal a7 = speciesFactory3.getAnimal(Constants.Animals.Birds.Turacos);
		System.out.printf("We have an animal with %d legs!!\n", a7.getNrOfLegs());
		
		Animal a8 = speciesFactory3.getAnimal(Constants.Animals.Birds.Flamingo);
		System.out.printf("We have an animal with %d legs!!\n", a8.getNrOfLegs());
		
		Animal a9 = speciesFactory3.getAnimal(Constants.Animals.Birds.Gull);
		System.out.printf("We have an animal with %d legs!!\n", a9.getNrOfLegs());
		
		SpeciesFactory speciesFactory4 = 
				abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		Animal a10 = speciesFactory4.getAnimal(Constants.Animals.Aquatics.Dolphin);
		System.out.printf("We have an animal with %d legs!!\n", a10.getNrOfLegs());
		
		Animal a11 = speciesFactory4.getAnimal(Constants.Animals.Aquatics.Shark);
		System.out.printf("We have an animal with %d legs!!\n", a11.getNrOfLegs());
		
		Animal a12 = speciesFactory4.getAnimal(Constants.Animals.Aquatics.Octopus);
		System.out.printf("We have an animal with %d legs!!\n", a12.getNrOfLegs());
		
		SpeciesFactory speciesFactory5 = 
				abstractFactory.getSpeciesFactory(Constants.Species.Insects);
		Animal a13 = speciesFactory5.getAnimal(Constants.Animals.Insects.Spider);
		System.out.printf("We have an animal with %d legs!!\n", a13.getNrOfLegs());
		
		Animal a14 = speciesFactory5.getAnimal(Constants.Animals.Insects.Cockroach);
		System.out.printf("We have an animal with %d legs!!\n", a14.getNrOfLegs());
		
		Animal a15 = speciesFactory5.getAnimal(Constants.Animals.Insects.Butterfly);
		System.out.printf("We have an animal with %d legs!!\n", a15.getNrOfLegs());
		*/
		//twist 1
		
		
		Animal animalss[] = new Animal[50];
		for ( int i = 0; i < 49; i++) {
			Random ran = new Random();
			int num = ran.nextInt(4);
			switch(num) {
				case 0 : SpeciesFactory speciesFactory1 = 
						 abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
						 num = ran.nextInt(2);
						 switch(num) {
						 case 0 : animalss[i] = speciesFactory1.getAnimal(Constants.Animals.Mammals.Cow);
						 		  break;
						 case 1 : animalss[i] = speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger);		  
						 		  break;
						 case 2 : animalss[i] = speciesFactory1.getAnimal(Constants.Animals.Mammals.Monkey);
						          break;	 
						 }
						 break;
				case 1 : SpeciesFactory speciesFactory2 = 
						 abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
						 num = ran.nextInt(2);
						 switch(num) {
						 case 0 : animalss[i] = speciesFactory2.getAnimal(Constants.Animals.Reptiles.Snake);
						 		  break;
						 case 1 : animalss[i] = speciesFactory2.getAnimal(Constants.Animals.Reptiles.Lizzard);	  
						 		  break;
						 case 2 : animalss[i] = speciesFactory2.getAnimal(Constants.Animals.Reptiles.Crocodile);
						          break;	 
						 }	
						 break;
				case 2 : SpeciesFactory speciesFactory3 = 
						 abstractFactory.getSpeciesFactory(Constants.Species.Birds);	 
						 num = ran.nextInt(2);
						 switch(num) {
						 case 0 : animalss[i] = speciesFactory3.getAnimal(Constants.Animals.Birds.Turacos);
				 		  		  break;
						 case 1 : animalss[i] = speciesFactory3.getAnimal(Constants.Animals.Birds.Flamingo);
				 		 		  break;
						 case 2 : animalss[i] = speciesFactory3.getAnimal(Constants.Animals.Birds.Gull);
				          		  break;	 
						 }
						 break;
				case 3 : SpeciesFactory speciesFactory4 = 
						 abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);	 
						 num = ran.nextInt(2);
						 switch(num) {
						 case 0 : animalss[i] = speciesFactory4.getAnimal(Constants.Animals.Aquatics.Dolphin);
				 		  		  break;
						 case 1 : animalss[i] = speciesFactory4.getAnimal(Constants.Animals.Aquatics.Shark);
				 		 		  break;
						 case 2 : animalss[i] = speciesFactory4.getAnimal(Constants.Animals.Aquatics.Octopus);
				          		  break;	 
						 }
						 break;	
				case 4 : SpeciesFactory speciesFactory5 = 
						 abstractFactory.getSpeciesFactory(Constants.Species.Insects); 
						 num = ran.nextInt(2);
						 switch(num) {
						 case 0 : animalss[i] = speciesFactory5.getAnimal(Constants.Animals.Insects.Spider);
				 		  		  break;
						 case 1 : animalss[i] = speciesFactory5.getAnimal(Constants.Animals.Insects.Cockroach);
				 		 		  break;
						 case 2 : animalss[i] = speciesFactory5.getAnimal(Constants.Animals.Insects.Butterfly);
				          		  break;	 
						 }
						 break;	 	
			}		 
					 
		
		}
		for ( int i = 0; i<49; i++) {
			System.out.println(animalss[i]);
		}
		
	}
}


