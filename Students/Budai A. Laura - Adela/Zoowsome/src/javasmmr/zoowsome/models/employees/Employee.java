package javasmmr.zoowsome.models.employees;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants.Employees.Caretakers;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Employee {
	public String name;
	public Long id;
	public BigDecimal salary;
	boolean isDead;
	
	public String getName(){
		return this.name;	
	}
	
	public void setName(String name) {
		this.name = name;
	}

	
	public Long getId(){
		return this.id;	
	}
	
	public void setId() {
		long number = (long) Math.floor(Math.random() * 9000000000000L) + 1000000000000L;
		this.id = number;
	}
	
	public BigDecimal getSalary(){
		return this.salary;	
	}
	
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public boolean getIsDead(){
		return this.isDead;	
	}
	
	public void setIsDead(boolean isDead) {
		this.isDead = isDead;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {  	 	
 		createNode(eventWriter, "name", String.valueOf(this.name));  	 	
 		createNode(eventWriter, "id", String.valueOf(this.id)); 
 	 	createNode(eventWriter, "salary", String.valueOf(this.salary));  	 	
 	 	createNode(eventWriter, "isDead", String.valueOf(this.isDead));  	 	
 	}
 	
 	public void decodeFromXml(Element element) { 
 		setName(element.getElementsByTagName("name").item(0).getTextContent()); 
 	 	setId();  	
 	 	setSalary(BigDecimal.valueOf(element.getElementsByTagName("salary").item(0).getTextContent()));  	
 	 	setIsDead(Boolean.valueOf(element.getElementsByTagName("isDead").item(0).getTextContent()));  	 
 	 }
}
