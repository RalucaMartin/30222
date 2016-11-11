package avasmmr.zoowsome.controllers;

import java.util.Random;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

public class MainController {
	public static void main(String[] args) throws Exception {

		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
		SpeciesFactory speciesFactory3 = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		SpeciesFactory speciesFactory4 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		SpeciesFactory speciesFactory5 = abstractFactory.getSpeciesFactory(Constants.Species.Insects);

		/*
		 * Animal a1 =
		 * speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger);
		 * System.out.printf("We have an animal with %d legs!\n",
		 * a1.getNrOfLegs());
		 */

		// twist1

		int newAnimal;
		Animal[] animal = new Animal[Constants.ZOO_DIMENSION + 1];
		Random random = new Random();

		for (int i = 1; i <= Constants.ZOO_DIMENSION; i++) {

			newAnimal = random.nextInt(Constants.NR_OF_ANIMALS);
			
			switch (newAnimal) {

			case 1:
				animal[i] = speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs\n",
						animal[i].getNrOfLegs());
				break;

			case 2:
				animal[i] = speciesFactory1.getAnimal(Constants.Animals.Mammals.Monkey);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;
			case 3:
				animal[i] = speciesFactory1.getAnimal(Constants.Animals.Mammals.Cow);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;
			case 4:
				animal[i] = speciesFactory2.getAnimal(Constants.Animals.Reptiles.Lizzard);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;
			case 5:
				animal[i] = speciesFactory2.getAnimal(Constants.Animals.Reptiles.KomodoDragon);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;
			case 6:
				animal[i] = speciesFactory2.getAnimal(Constants.Animals.Reptiles.Snake);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;
			case 7:
				animal[i] = speciesFactory3.getAnimal(Constants.Animals.Birds.Vulture);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;
			case 8:
				animal[i] = speciesFactory3.getAnimal(Constants.Animals.Birds.Swan);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;
			case 9:
				animal[i] = speciesFactory3.getAnimal(Constants.Animals.Birds.Owl);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;
			case 10:
				animal[i] = speciesFactory4.getAnimal(Constants.Animals.Aquatics.Shark);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;
			case 11:
				animal[i] = speciesFactory4.getAnimal(Constants.Animals.Aquatics.Octopus);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;
			case 12:
				animal[i] = speciesFactory4.getAnimal(Constants.Animals.Aquatics.Fish);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;
			case 13:
				animal[i] = speciesFactory5.getAnimal(Constants.Animals.Insects.Butterfly);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;
			case 14:
				animal[i] = speciesFactory5.getAnimal(Constants.Animals.Insects.Cockroach);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;
			case 15:
				animal[i] = speciesFactory5.getAnimal(Constants.Animals.Insects.Spider);
				System.out.printf("We have a new " + animal[i].getName() + " in the Zoo with %d legs!\n",
						animal[i].getNrOfLegs());
				break;

			}
		}

	}
}
