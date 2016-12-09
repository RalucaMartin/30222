package javasmmr.zoowsome.controllers;

import java.util.Random;

import avasmmr.zoowsome.services.factories.AnimalFactory;
import avasmmr.zoowsome.services.factories.Constants;
import avasmmr.zoowsome.services.factories.SpeciesFactory;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;

public class MainController {
	
	public static void main(String[] args) throws Exception {
		
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Monkey);
		System.out.printf("We have an animal with %s name!\n", a1.getName());
		
		SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		Animal a2 = speciesFactory2.getAnimal(Constants.Animals.Aquatics.Fish);
		System.out.printf("We have an animal with %d legs!\n", a2.getNrOfLegs());
		
		SpeciesFactory speciesFactory3 = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		Animal a3 = speciesFactory3.getAnimal(Constants.Animals.Birds.Parrot);
		System.out.printf("We have an animal with %s name!\n", a3.getName());
		
		SpeciesFactory speciesFactoryMammals = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		SpeciesFactory speciesFactoryAquatics = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		SpeciesFactory speciesFactoryInsects = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
		SpeciesFactory speciesFactoryReptiles = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
		SpeciesFactory speciesFactoryBirds = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		
		Animal a[] = new Animal[15];
		Random random = new Random();
		
		for(int i = 0; i < a.length; i++){
			int randomAnimal = random.nextInt(15);
			switch(randomAnimal){
			case 0:
				a[i] = speciesFactoryMammals.getAnimal(Constants.Animals.Mammals.Monkey);
				break;
			case 1:
				a[i] = speciesFactoryMammals.getAnimal(Constants.Animals.Mammals.Tiger);
				break;
			case 2:
				a[i] = speciesFactoryMammals.getAnimal(Constants.Animals.Mammals.Cow);
				break;
			case 3:
				a[i] = speciesFactoryAquatics.getAnimal(Constants.Animals.Aquatics.Fish);
				break;
			case 4:
				a[i] = speciesFactoryAquatics.getAnimal(Constants.Animals.Aquatics.SeaHorse);
				break;
			case 5:
				a[i] = speciesFactoryAquatics.getAnimal(Constants.Animals.Aquatics.Delphin);
				break;
			case 6:
				a[i] = speciesFactoryInsects.getAnimal(Constants.Animals.Insects.Cockroach);
				break;
			case 7:
				a[i] = speciesFactoryInsects.getAnimal(Constants.Animals.Insects.Butterfly);
				break;
			case 8:
				a[i] = speciesFactoryInsects.getAnimal(Constants.Animals.Insects.Spider);
				break;
			case 9:
				a[i] = speciesFactoryReptiles.getAnimal(Constants.Animals.Reptiles.Crocodile);
				break;
			case 10:
				a[i] = speciesFactoryReptiles.getAnimal(Constants.Animals.Reptiles.Snake);
				break;
			case 11:
				a[i] = speciesFactoryReptiles.getAnimal(Constants.Animals.Reptiles.Chameleon);
				break;
			case 12:
				a[i] = speciesFactoryBirds.getAnimal(Constants.Animals.Birds.Parrot);
				break;
			case 13:
				a[i] = speciesFactoryBirds.getAnimal(Constants.Animals.Birds.Swallow);
				break;
			case 14:
				a[i] = speciesFactoryBirds.getAnimal(Constants.Animals.Birds.Crow);
				break;
			}
			
		}
		Employee[] angajat = new Employee[10];
		
		for (Employee c: angajat) {
			for(Animal an : a)
			if(c.isDead || an.getTakenCareOf()){
			 String result = ((Caretaker) c).takeCareOf(an);
			if(result.equals(Constants.Employees.Caretakers.TCO_KILLED)){
				c.setIsDead(true);
			}
			else if(result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)){
				continue;
			}
			else {
				an.setTakenCareOf(true);
			}
			}
			int i = 0;
		for(Animal animal : a){
			System.out.println("Animal " +  i++  + " "+ animal.getName() + "maintenance cost: " +  animal.getMaintenanceCost() + "taken care of:" + animal.getTakenCareOf());
			
		  }
		}
	}
}
		
		
		
		
	


