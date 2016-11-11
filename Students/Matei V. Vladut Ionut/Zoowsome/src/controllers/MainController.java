package controllers;

import services.factories.animal.AnimalFactory;
import services.factories.animal.SpeciesFactory;
import services.factories.employee.CaretakerFactory;

import java.util.Random;

import models.animals.*;
import models.employees.*;


public class MainController {
	
	 public static final int SIZE_OF_ZOO = 50;
	 public static final int NR_CARETAKERS = 10;

	public static void main(String[] args) throws Exception {
		
		
        AnimalFactory abstractFactory = new AnimalFactory();
        /*
        SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.MAMMALS);
        Animal animal = speciesFactory1.getAnimal(Constants.Animals.Mammals.MONKEY);
        System.out.printf("We have an animal with %d legs!\n", animal.getNrOfLegs());
        */
		

        SpeciesFactory speciesFactoryMammals = abstractFactory.getSpeciesFactory(Constants.Species.MAMMALS);
        SpeciesFactory speciesFactoryReptiles = abstractFactory.getSpeciesFactory(Constants.Species.REPTILES);
        SpeciesFactory speciesFactoryInsects = abstractFactory.getSpeciesFactory(Constants.Species.INSECTS);
        SpeciesFactory speciesFactoryBirds = abstractFactory.getSpeciesFactory(Constants.Species.BIRDS);
        SpeciesFactory speciesFactoryAquatic = abstractFactory.getSpeciesFactory(Constants.Species.AQUATICS);

        Random random = new Random();
        Animal[] zoo = new Animal[SIZE_OF_ZOO];
        int randomIntAnimal;

        for(int i = 0; i < SIZE_OF_ZOO; i++){
            randomIntAnimal = random.nextInt(12);
            switch (randomIntAnimal){
                case 0:
                    zoo[i] = speciesFactoryMammals.getAnimal(Constants.Animals.Mammals.MONKEY);
                    break;
                case 1:
                    zoo[i] = speciesFactoryMammals.getAnimal(Constants.Animals.Mammals.COW);
                    break;
                case 2:
                    zoo[i] = speciesFactoryMammals.getAnimal(Constants.Animals.Mammals.TIGER);
                    break;
                case 3:
                    zoo[i] = speciesFactoryReptiles.getAnimal(Constants.Animals.Reptiles.CROCODILE);
                    break;
                case 4:
                    zoo[i] = speciesFactoryReptiles.getAnimal(Constants.Animals.Reptiles.LIZZARD);
                    break;
                case 5:
                    zoo[i] = speciesFactoryReptiles.getAnimal(Constants.Animals.Reptiles.TURTLE);
                    break;
                case 6:
                    zoo[i] = speciesFactoryInsects.getAnimal(Constants.Animals.Insects.BUTTERFLY);
                    break;
                case 7:
                    zoo[i] = speciesFactoryInsects.getAnimal(Constants.Animals.Insects.COCKROACH);
                    break;
                case 8:
                    zoo[i] = speciesFactoryInsects.getAnimal(Constants.Animals.Insects.SPIDER);
                    break;
                case 9:
                    zoo[i] = speciesFactoryAquatic.getAnimal(Constants.Animals.Aquatics.WHALE);
                    break;
                case 10:
                    zoo[i] = speciesFactoryAquatic.getAnimal(Constants.Animals.Aquatics.SHARK);
                    break;
                case 11:
                    zoo[i] = speciesFactoryAquatic.getAnimal(Constants.Animals.Aquatics.SALMON);
                    break;
                case 12:
                    zoo[i] = speciesFactoryBirds.getAnimal(Constants.Animals.Birds.EAGLE);
                    break;
                case 13:
                    zoo[i] = speciesFactoryBirds.getAnimal(Constants.Animals.Birds.WAXWING);
                    break;
                case 14:
                    zoo[i] = speciesFactoryBirds.getAnimal(Constants.Animals.Birds.CHICKEN);
                    break;
            }
        }
        /*for (int i = 0; i < SIZE_OF_ZOO; i++){
            System.out.printf("We have an %s with %d legs!\n", zoo[i].getName(), zoo[i].getNrOfLegs());
        }*/
        
        CaretakerFactory CareTakerFactory = new CaretakerFactory();
        Employee[] caretakerTeam = new Employee[NR_CARETAKERS];
        
        for(int i = 0; i < NR_CARETAKERS; i++){
        	caretakerTeam[i] = CareTakerFactory.getEmployeeFactory(Constants.Employees.CARETAKER);
        }
        
        for(Employee c: caretakerTeam){
        	for(Animal a: zoo){
        		if ( !(c.isDead()) || a.isTakenCareOf()){
        			String result = ((Caretaker)c).takeCareOf(a);
        			if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)){
        			 	c.setDead(true);
        			}
        			else if( result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)){
        				continue;
        			}
        			else if (result.equals(Constants.Employees.Caretakers.TCO_SUCCESS)){
        				a.setTakenCareOf(true);
        			}
        		}
        	}
       }
	
        int i = 0;
        for(Animal a: zoo){
        	System.out.println("Animal #" + i++ + " " + a.getName() + ":\t maintenanceCost = " + a.getMaintenanceCost() + " hours/week;\t takenCareOf = " + a.isTakenCareOf());
        	}
        for(Employee e: caretakerTeam){
        	System.out.println(e.getName() + " id: " + e.getId() + " " + ((Caretaker)e).getWorkingHours() + "hours dead = " + e.isDead());
        }
	}
}
	
