package javasmmr.zoowsome.models.animals;

import java.util.Random;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode; 

public abstract class Animal implements Killer_I, XML_Parsable{
	private Integer nrOfLegs;
	private String name;
	private double maintenanceCost;
	private double dangerPerc;
	private boolean  takenCareOf ;
	
	
	public Integer getNrOfLegs(){
		return this.nrOfLegs;	
	}
	
	public void setNrOfLegs(Integer nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}

	public String getName(){
		return this.name;	
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public final double getMaintenanceCost(){
		return this.maintenanceCost;
	}
	
	public final void setMaintenanceCost(double maintenanceCost){
		this.maintenanceCost = maintenanceCost;
	}
	
	public final double getDangerPerc(){
		return this.dangerPerc;
	}
	
	public final void setDangerPerc(double dangerPerc){
		this.dangerPerc = dangerPerc;
	}
	
	public boolean getTakenCareOf(){
		return this.takenCareOf;
	}
	
	public void setTakenCareOf(boolean takenCareOf){
		this.takenCareOf = takenCareOf;
	}
	
	
	public boolean kill() {
		Random random = new Random();
		Double Result = random.nextDouble();
		if(Result < dangerPerc)
			return true;
		return false;
	}
	

 	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {  	 	
 		createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));  	 	
 		createNode(eventWriter, "name", String.valueOf(this.name)); 
 	 	createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));  	 	
 	 	createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));  	 	
 	 	createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf)); 
 	}
 	
 	public void decodeFromXml(Element element) { 
 	 	setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent()));  	
 	 	setName(element.getElementsByTagName("name").item(0).getTextContent()); 
 	 	setMaintenanceCost(Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()));  	
 	 	setDangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));  	
 	 	setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent())); 
 	 }

}