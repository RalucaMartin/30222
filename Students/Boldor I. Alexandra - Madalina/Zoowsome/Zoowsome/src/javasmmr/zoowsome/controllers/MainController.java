package javasmmr.zoowsome.controllers;

import java.util.Random;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.*;

public class MainController {
	public static void main(String[] args) throws Exception {
		int counter,i=0;
		int nbOfAnimals=15;
		
		Animal a[]=new Animal[nbOfAnimals+1];
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		SpeciesFactory speciesFactory3 = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
		SpeciesFactory speciesFactory4 = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
		SpeciesFactory speciesFactory5 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		
		System.out.println("WELCOME TO THE ZOO!");
		Random random = new Random();
		
		while( i < nbOfAnimals ) {
			counter = random.nextInt(nbOfAnimals);
			switch( counter ) {
				case 1:
					i++;
					a[i] = speciesFactory1.getAnimal(Constants.Animals.Mammals.Monkey);
					System.out.println("********************************************************");
					System.out.println("New animal in the ZOO : "+a[i].getName());
					System.out.println(a[i].getName()+" has "+a[i].getNrOfLegs()+" legs");
					System.out.println("Its body temperature is : " +( (Mammal)a[i] ).getNormalBodyTemp() );
					System.out.println( ( (Mammal)a[i] ).getPercBodyHair() +" % of its body is covered with hair");
					System.out.println("*******************************************************");
					break;
				case 2:
					i++;
					a[i]= speciesFactory1.getAnimal(Constants.Animals.Mammals.Squirrel);
					System.out.println("********************************************************");
					System.out.println("New animal in the ZOO : "+a[i].getName());
					System.out.println(a[i].getName()+" has "+a[i].getNrOfLegs()+" legs");
					System.out.println("Its body temperature is : " +((Mammal)a[i]).getNormalBodyTemp() );
					System.out.println( ((Mammal)a[i]).getPercBodyHair() +" % of its body is covered with hair");
					System.out.println("*******************************************************");
					break;
				case 3:
					i++;
					a[i]= speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger);
					System.out.println("********************************************************");
					System.out.println("New animal in the ZOO : "+a[i].getName());
					System.out.println(a[i].getName()+" has "+a[i].getNrOfLegs()+" legs");
					System.out.println("Its body temperature is : " +((Mammal)a[i]).getNormalBodyTemp() );
					System.out.println( ((Mammal)a[i]).getPercBodyHair() +" % of its body is covered with hair");
					System.out.println("*******************************************************");
					break;
				case 4:
					i++;
					a[i] = speciesFactory2.getAnimal(Constants.Animals.Birds.Stork);
					System.out.println("********************************************************");
					System.out.println("New animal in the ZOO : "+a[i].getName());
					System.out.println(a[i].getName()+" has "+a[i].getNrOfLegs()+" legs");
					if(  ((Bird)a[i]).isMigrating() ) {
						System.out.println(a[i].getName()+" migrates");
					} else {
						System.out.println(a[i].getName()+" doesn't migrate");
					}
					System.out.println("Its average flight altitude is "+ ((Bird)a[i]).getAvgFlightAltitude()+ " meters" );
					System.out.println("*******************************************************");
					break;
				case 5:
					i++;
					a[i] = speciesFactory2.getAnimal(Constants.Animals.Birds.Parrot);
					System.out.println("********************************************************");
					System.out.println("New animal in the ZOO : "+a[i].getName());
					System.out.println(a[i].getName()+" has "+a[i].getNrOfLegs()+" legs");
					if(  ((Bird)a[i]).isMigrating() ) {
						System.out.println(a[i].getName()+" migrates");
					} else {
						System.out.println(a[i].getName()+" doesn't migrate");
					}
					System.out.println("Its average flight altitude is "+ ((Bird)a[i]).getAvgFlightAltitude()+ " meters" );
					System.out.println("*******************************************************");
					break;
				case 6:
					i++;
					a[i] = speciesFactory2.getAnimal(Constants.Animals.Birds.Hawk);
					System.out.println("********************************************************");
					System.out.println("New animal in the ZOO : "+a[i].getName());
					System.out.println(a[i].getName()+" has "+a[i].getNrOfLegs()+" legs");
					if(  ((Bird)a[i]).isMigrating() ) {
						System.out.println(a[i].getName()+" migrates");
					} else {
						System.out.println(a[i].getName()+" doesn't migrate");
					}
					System.out.println("Its average flight altitude is "+ ((Bird)a[i]).getAvgFlightAltitude()+ " meters" );
					System.out.println("*******************************************************");
					break;
				case 7:
					i++;
					a[i] = speciesFactory3.getAnimal(Constants.Animals.Insects.Bee);
					System.out.println("********************************************************");
					System.out.println("New animal in the ZOO : "+a[i].getName());
					System.out.println(a[i].getName()+" has "+a[i].getNrOfLegs()+" legs");
					if ( ((Insect)a[i]).isFlying() ) {
						System.out.println(a[i].getName()+" can fly");
					} else {
						System.out.println(a[i].getName()+" can't fly");
					}
					if ( ((Insect)a[i]).getIsDangerous() ) {
						System.out.println("It's a dangerous insect! (sometimes)");
					} else {
						System.out.println("Don't worry!It isn't a dangerous insect!");
					}
					System.out.println("*******************************************************");
					break;
				case 8:
					i++;
					a[i] = speciesFactory3.getAnimal(Constants.Animals.Insects.Butterfly);
					System.out.println("********************************************************");
					System.out.println("New animal in the ZOO : "+a[i].getName());
					System.out.println(a[i].getName()+" has "+a[i].getNrOfLegs()+" legs");
					if ( ((Insect)a[i]).isFlying() ) {
						System.out.println(a[i].getName()+" can fly");
					} else {
						System.out.println(a[i].getName()+" can't fly");
					}
					if ( ((Insect)a[i]).getIsDangerous() ) {
						System.out.println("It's a dangerous insect!");
					} else {
						System.out.println("Don't worry!It isn't a dangerous insect!");
					}
					System.out.println("*******************************************************");
					break;
				case 9:
					i++;
					a[i] = speciesFactory3.getAnimal(Constants.Animals.Insects.Spider);
					System.out.println("********************************************************");
					System.out.println("New animal in the ZOO : "+a[i].getName());
					System.out.println(a[i].getName()+" has "+a[i].getNrOfLegs()+" legs");
					if ( ((Insect)a[i]).isFlying() ) {
						System.out.println(a[i].getName()+" can fly");
					} else {
						System.out.println(a[i].getName()+" can't fly");
					}
					if ( ((Insect)a[i]).getIsDangerous() ) {
						System.out.println("It's a dangerous insect!");
					} else {
						System.out.println("Don't worry!It isn't a dangerous insect!");
					}
					System.out.println("*******************************************************");
					break;
				case 10:
					i++;
					a[i] = speciesFactory4.getAnimal(Constants.Animals.Reptiles.Crocodile);
					System.out.println("********************************************************");
					System.out.println("New animal in the ZOO : "+a[i].getName());
					System.out.println(a[i].getName()+" has "+a[i].getNrOfLegs()+" legs");
					if ( ((Reptile)a[i]).isLayingEggs() ) {
						System.out.println(a[i].getName()+" lays eggs");
					}
					System.out.println("*******************************************************");
					break;
				case 11:
					i++;
					a[i] = speciesFactory4.getAnimal(Constants.Animals.Reptiles.Snake);
					System.out.println("********************************************************");
					System.out.println("New animal in the ZOO : "+a[i].getName());
					System.out.println(a[i].getName()+" has "+a[i].getNrOfLegs()+" legs");
					if ( ((Reptile)a[i]).isLayingEggs() ) {
						System.out.println(a[i].getName()+" lays eggs");
					}
					System.out.println("*******************************************************");
					break;
				case 12:
					i++;
					a[i] = speciesFactory4.getAnimal(Constants.Animals.Reptiles.Turtle);
					System.out.println("********************************************************");
					System.out.println("New animal in the ZOO : "+a[i].getName());
					System.out.println(a[i].getName()+" has "+a[i].getNrOfLegs()+" legs");
					if ( ((Reptile)a[i]).isLayingEggs() ) {
						System.out.println(a[i].getName()+" lays eggs");
					}
					System.out.println("*******************************************************");
					break;
				case 13:
					i++;
					a[i] = speciesFactory5.getAnimal(Constants.Animals.Aquatics.Jellyfish);
					System.out.println("********************************************************");
					System.out.println("New animal in the ZOO : "+a[i].getName());
					System.out.println(a[i].getName()+" has "+a[i].getNrOfLegs()+" tentacles");
					System.out.println(a[i].getName()+" preferes "+ ((Aquatic)a[i]).getWaterType());
					System.out.println("Its average swim depth is "+ ((Aquatic)a[i]).getAvgSwimDepth() + " meters" );
					System.out.println("*******************************************************");
					break;	
				case 14:
					i++;
					a[i] = speciesFactory5.getAnimal(Constants.Animals.Aquatics.Octopus);
					System.out.println("********************************************************");
					System.out.println("New animal in the ZOO : "+a[i].getName());
					System.out.println(a[i].getName()+" has "+a[i].getNrOfLegs()+" tentacles");
					System.out.println(a[i].getName()+" preferes "+ ((Aquatic)a[i]).getWaterType());
					System.out.println("Its average swim depth is "+ ((Aquatic)a[i]).getAvgSwimDepth() + " meters" );
					System.out.println("*******************************************************");
					break;	
				case 15:
					i++;
					a[i] = speciesFactory5.getAnimal(Constants.Animals.Aquatics.Carp);
					System.out.println("********************************************************");
					System.out.println("New animal in the ZOO : "+a[i].getName());
					System.out.println(a[i].getName()+" has "+a[i].getNrOfLegs()+" tentacles");
					System.out.println(a[i].getName()+" preferes "+ ((Aquatic)a[i]).getWaterType());
					System.out.println("Its average swim depth is "+ ((Aquatic)a[i]).getAvgSwimDepth() + " meters" );
					System.out.println("*******************************************************");
					break;	
				default: System.out.println("The generated number is 0");
						
			}
		}
	}
}

