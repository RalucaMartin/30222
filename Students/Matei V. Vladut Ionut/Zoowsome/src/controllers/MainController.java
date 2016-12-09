package controllers;

import services.factories.*;
import services.factories.animal.SpeciesFactory;
import services.factories.employee.CaretakerFactory;

import java.lang.reflect.Field;
import java.util.Random;

import models.animals.*;
import models.employees.*;


public class MainController {
	
	 public static final int SIZE_OF_ZOO = 50;
	 public static final int NR_CARETAKERS = 10;

	public static void main(String[] args) throws Exception {
		
      //  Random random = new Random();
        Animal[] zoo = new Animal[SIZE_OF_ZOO];
        
        for(int i = 0; i <= SIZE_OF_ZOO; i++){
        for(Class clazz: Constants.Animals.class.getClasses()){
        	for (Field field: clazz.getDeclaredFields()){
        		try{
        			zoo[i] =  field.get(clazz);
        			//System.out.println(field.get(clazz));
        		}
        		catch(Exception e){
        			e.printStackTrace();
        		}
        	}
        }
        }
        for (int i = 0; i < SIZE_OF_ZOO; i++){
            System.out.printf("We have an %s with %d legs!\n", zoo[i].getName(), zoo[i].getNrOfLegs());
        }
        
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
	
