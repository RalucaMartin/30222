package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Pinguin extends Bird {
	
	public Pinguin(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Pinguin(){
		this.setNrOfLegs(2);
		this.setName("Butterfly");
		this.setMigrates(false);
		this.setAvgFlightAltitude(0);
		this.setMaintenanceCost(2.5);
		this.setDangerPerc(0.2);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException { 
 	 	super.encodeToXml(eventWriter);  	 	
 	 	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Birds.PINGUIN); 
 	}
}
