package javasmmr.zoowsome.controllers;

import java.util.Random;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

public class MainController {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		AnimalFactory abstractFactory = new AnimalFactory();

		SpeciesFactory speciesFactory1 = AnimalFactory.getSpeciesFactory(Constants.Species.Mammals);
		//Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Lion);
		//System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());
		//int i;
		Random r1 = new Random();
		for(int i = 0; i < 10; i++){
			int temp = r1.nextInt(9);
			switch(temp){
			case 1:{
				Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Lion);
				System.out.printf("We have an animal %s !\n", a1.getName());
				break;}
			case 2:{
				Animal a2 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Elephant);
				System.out.printf("We have an animal  %s !\n", a2.getName());
				break;
			}
			case 3:{
				Animal a3 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Monkey);
				System.out.printf("We have an animal  %s !\n", a3.getName());
				break;
			}
			case 4:{
				Animal a4 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Bear);
				System.out.printf("We have an animal  %s !\n", a4.getName());
				break;
			}
			case 5:{
				Animal a5 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Wolf);
				System.out.printf("We have an animal  %s !\n", a5.getName());
				break;
			}
			case 6:{
				Animal a6 = speciesFactory1.getAnimal(Constants.Animals.Insects.Butterfly);
				System.out.printf("We have an animal  %s !\n", a6.getName());
				break;
			}
			case 7:{
				Animal a7 = speciesFactory1.getAnimal(Constants.Animals.Insects.Dragonfly);
				System.out.printf("We have an animal  %s !\n", a7.getName());
				break;
			}
			case 8:{
				Animal a8 = speciesFactory1.getAnimal(Constants.Animals.Insects.Spider);
				System.out.printf("We have an animal  %s !\n", a8.getName());
				break;
			}
			case 9:{
				Animal a9 = speciesFactory1.getAnimal(Constants.Animals.Birds.Kiwi);
				System.out.printf("We have an animal  %s !\n", a9.getName());
				break;
			}
			case 10:{
				Animal a10 = speciesFactory1.getAnimal(Constants.Animals.Birds.Flamingo);
				System.out.printf("We have an animal %s !\n", a10.getName());
				break;
			}
			default: System.out.println("Invalid animal");
            break;
		}
		}	
			

	}

}
