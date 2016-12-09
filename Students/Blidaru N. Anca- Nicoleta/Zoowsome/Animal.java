package javasmmr.zoowsome.models.animals;

import java.time.LocalDateTime;
import java.util.Random;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import interfaces.Killer_I;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;

public abstract class Animal implements Killer_I, XML_Parsable {

	private int nrOfLegs;
	private String name;
	private double maintenanceCost;      //this should be final
 	private double dangerPerc;           //final
	private boolean takenCareOf = false;

	public Animal(double maintenanceCost, double dangerPerc) {
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	}

	public int getNrOfLegs() {
		return nrOfLegs;
	}

	public void setNrOfLegs(int nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getTakenCareOf() {
		return takenCareOf;
	}

	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}

	public double getMaintenanceCost() {
		return maintenanceCost;
	}
	
	public void setMaintenanceCost(double maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
	}

	public double getDangerPerc() {
		return dangerPerc;
	}
	
	public void setDangerPerc(double dangerPerc) {
		this.dangerPerc = dangerPerc;
	}

	public boolean kill() {
		double randomNb;
		Random random = new Random();
		randomNb = random.nextDouble(); // random nr between 0 and 1

		if (randomNb < (dangerPerc + getPredisposition()))
			return true;
		return false;
	}

	public double getPredisposition() {

		LocalDateTime now = LocalDateTime.now();
		int year = now.getYear();
		int month = now.getMonthValue();
		int day = now.getDayOfMonth();
		int hour = now.getHour();

		return 0;
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
