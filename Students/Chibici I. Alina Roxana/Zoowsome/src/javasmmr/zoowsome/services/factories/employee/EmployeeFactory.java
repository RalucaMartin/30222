package javasmmr.zoowsome.services.factories.employee;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javasmmr.zoowsome.models.employees.Employee;

public abstract class EmployeeFactory {
	
	public abstract Employee getEmployee(String type) throws Exception;
	
	public String getRandomName(){
		Random random = new Random ();
		Boolean randomNameGetter = random.nextBoolean();
		String randomName = "-";
		if (randomNameGetter){
			randomName = "female";
		}
		else {
			randomName = "male";
		}
		return randomName;
	}
	
	public long getRandomId(){
		return ThreadLocalRandom.current().nextLong(1000000000000L, 10000000000000L); // genereaza un nr random m <= x < n
	}
}
