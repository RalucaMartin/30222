package javasmmr.zoowsome.models.animals;
import javasmmr.zoowsome.repositories.AnimalRepository;

import javax.swing.text.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;


public abstract class Bird extends Animal {
	
	public Bird(Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		// TODO Auto-generated constructor stub
	}


	private Boolean migrates;
	private int avgFlightAltitude;
	
	public Boolean getMigrates() {
		return this.migrates;
	}
	
	public void setMigrates( Boolean migrates ) {
		this.migrates = migrates;
	}
	
	public int getAvgFlightAltitude() {
		return this.avgFlightAltitude;
	}
	
	public void setAvgFlightAltitude( int avgFlightAltitude ) {
		this.avgFlightAltitude = avgFlightAltitude;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "avgFlightAltitude", String.valueOf(getAvgFlightAltitude()));
		createNode(eventWriter, "migrates", String.valueOf(getMigrates()));
	}
	public void decodeFromXml(Element element) {
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("avgFlightAltitude").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("migrates").item(0).getTextContent()));
		
		
	}

}
