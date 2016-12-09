package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;


public class Chameleon extends Reptile{
	
	public Chameleon(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}
	
	public Chameleon(){
		this.setNrOfLegs(4);
		this.setName("Chameleon");
		this.setLaysEggs(true);
		this.setMaintenanceCost(0.1);
		this.setDangerPerc(0.3);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException { 
 	 	super.encodeToXml(eventWriter);  	 	
 	 	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Reptiles.CHAMELEON); 
 	}
}