package javasmmr.zoowesome.models.animals;
import java.util.Random;


import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import interfaces.Killer_I;
import interfaces.XML_Parsable;

import javasmmr.zoowesome.repositories.*;

public abstract class Animal implements Killer_I, XML_Parsable {
	private Integer nrOfLegs = 0;
	private String name ;
	private Double maintenanceCost; //  How can I restrict this
										  // between 0.1 and 8.0 ?
	private Double dangerPerc;	  //  Also this between 0 and 1?
	private Boolean takenCareOf;
	
	Random random = new Random();
	
	public boolean kill() {
		if(random.nextDouble() >= dangerPerc) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public void encodeToXML (XMLEventWriter eventWriter) throws XMLStreamException {
		AnimalRepository.createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));
		AnimalRepository.createNode(eventWriter, "name", String.valueOf(this.name));
		AnimalRepository.createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));
		AnimalRepository.createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));
		AnimalRepository.createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));
	}
	
	public void decodeFromXML (Element element) {
		setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setMaintenanceCost(Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()));
		setDangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));
	}
	
	public Animal() {
		this.maintenanceCost = 4.8;
		this.dangerPerc = 0.5;
		this.takenCareOf = false;
	}
	
	public Double getMaintenceCost() {
		return maintenanceCost;
	}
	
	public void setMaintenanceCost(Double maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
	}
	
	public void setDangerPerc(Double dangerPerc) {
		this.dangerPerc = dangerPerc;
	}
	
	public Double getDangerPerc() {
		return dangerPerc;
	}
	
	public Animal(Double maintanceCost, Double dangerPerc) {
		this.maintenanceCost = maintanceCost;
		this.dangerPerc = dangerPerc;
	}
	
	public void setNrOfLegs( int nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}
	
	public int getNrOfLegs() {
		return nrOfLegs;
	}
	
	public void setName( String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Boolean getTakenCareOf() {
		return takenCareOf;
	}
	
	public void setTakenCareOf(Boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}
	
}

