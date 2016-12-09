package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Bird extends Animal {
	private Boolean migrates;
	private int avgFlightAltitude;

	public Bird(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}

	public Boolean isMigrating() {
		return this.migrates;
	}

	public void setMigrates(Boolean migrates) {
		this.migrates = migrates;
	}

	public float getAvgFlightAltitude() {
		return this.avgFlightAltitude;
	}

	public void getAvgFlightAltitude(int avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}

	public void getDetails() {
		System.out.println("********************************************************");
		System.out.println("New animal in the ZOO : " + getName());
		System.out.println(getName() + " has " + getNrOfLegs() + " legs");
		if (isMigrating()) {
			System.out.println(getName() + " migrates");
		} else {
			System.out.println(getName() + " doesn't migrate");
		}
		System.out.println("Its average flight altitude is " + getAvgFlightAltitude() + " meters");
		System.out.println("*******************************************************");
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "migrates", String.valueOf(isMigrating()));
		createNode(eventWriter, "avgFlightAltitude", String.valueOf(getAvgFlightAltitude()));
	}

	public void decodeFromXml(Element element) {
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("migrates").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("avgFlightAltitude").item(0).getTextContent()));
	}

}
