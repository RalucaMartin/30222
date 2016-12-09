package javasmmr.zoowsome.models.employees;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.math.BigDecimal;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employee implements Caretaker_I {
	
	 public Double workingHours;
	
	public Double getWorkingHours(){
		return this.workingHours;	
	}
	
	public void setWorkingHours(Double workingHours) {
		this.workingHours = workingHours;
	}
	
	public Caretaker(String name, BigDecimal salary, boolean isDead, double workingHours) {
		this.setName(name);
		this.setId();
		this.setSalary(salary);
		this.setIsDead(isDead);
		this.setWorkingHours(workingHours);
	}
	
	public Caretaker(){
		this.setName("Employee");
		this.setId();
		this.setSalary(BigDecimal.ZERO);
		this.setIsDead(false);
		this.setWorkingHours(10.0);		
	}
	
	 public String takeCareOf(Animal animal) {  
		 
		 if (animal.kill()) {    
			 return Constants.Employees.Caretakers.TCO_KILLED;   
			 }
		 
		 if (this.workingHours < animal.getMaintenanceCost()){    
			 return Constants.Employees.Caretakers.TCO_NO_TIME;   
			 }   
		 
		 animal.setTakenCareOf(true);
		 this.workingHours = this.workingHours - animal.getMaintenanceCost();
		 
		 return Constants.Employees.Caretakers.TCO_SUCCESS;     }
	 
	 public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {  	 	
			super.encodeToXml(eventWriter); 
		 	createNode(eventWriter, "workingHours", String.valueOf(getWorkingHours()));  	 	
		} 
		
		public void decodeFromXml(Element element) {  	
			setIsDead(Boolean.valueOf(element.getElementsByTagName("workingHours").item(0).getTextContent()));  
			}  
}
