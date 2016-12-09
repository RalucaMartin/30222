package models.animals;

import interfaces.*;
import java.util.*;
import org.w3c.dom.Document;
import static repositories.AnimalRepository.createNode;

import javax.lang.model.element.Element;
import javax.xml.stream.*;

public abstract class Animal implements Killer, XML_Parsable{

	protected int nrOfLegs;
	protected String name;
	protected  double maintenanceCost;		// final
	protected  double dangerPerc;
	Random random = new Random();
	private boolean takenCareOf = false;
	
	
	public Animal (double maintenaceCost, double dangerPerc){
		this.maintenanceCost = maintenaceCost;
		this.dangerPerc = dangerPerc;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {  	 	
		createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));  	 	
		createNode(eventWriter, "name", String.valueOf(this.name)); 
	 	createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));  	 	
	 	createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));  	 	
	 	createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf)); 
	} 
	
	public void decodeFromXml(Element element) { 
	 	setNrOfLegs(Integer.valueOf(((Document) element).getElementsByTagName("nrOfLegs").item(0).getTextContent()));  	
	 	setName(((Document) element).getElementsByTagName("name").item(0).getTextContent()); 
	 	setMaintenanceCost(Double.valueOf(((Document) element).getElementsByTagName("maintenanceCost").item(0).getTextContent()));  
	 	setDangerPerc(Double.valueOf(((Document) element).getElementsByTagName("dangerPerc").item(0).getTextContent()));  	
	 	setTakenCareOf(Boolean.valueOf(((Document) element).getElementsByTagName("takenCareOf").item(0).getTextContent())); 
	 	} 

	
	

	private void setDangerPerc(Double danger) {
		// TODO Auto-generated method stub
		this.dangerPerc = danger;
		
	}

	private void setMaintenanceCost(Double maint) {
		// TODO Auto-generated method stub
		this.maintenanceCost = maint;
		
	}

	public double getPredisposition(){
		return 0;
	}
	
	
	public boolean kill(){
		double var = random.nextDouble();
		if (var < (dangerPerc + this.getPredisposition()))
			return true;
		else 
			return false;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNrOfLegs() {
		return nrOfLegs;
	}
	public void setNrOfLegs(int nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}


	public boolean isTakenCareOf() {
		return takenCareOf;
	}


	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}


	public double getMaintenanceCost() {
		return maintenanceCost;
	}
	
}
