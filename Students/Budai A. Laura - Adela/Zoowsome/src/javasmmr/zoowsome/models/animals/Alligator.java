package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;


public class Alligator extends Reptile {
	
	public Alligator(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Alligator(){
		this.setNrOfLegs(4);
		this.setName("Alligator");
		this.setLaysEggs(true);
		this.setMaintenanceCost(0.1);
		this.setDangerPerc(6.5);
		}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException { 
 	 	super.encodeToXml(eventWriter);  	 	
 	 	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Reptiles.ALLIGATOR); 
 	}
}
