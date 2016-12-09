package javasmmr.zoowesome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowesome.units.Constants;
import javasmmr.zoowesome.repositories.AnimalRepository;

public class Butterfly extends Insect {
	
	public Butterfly() {
		setNrOfLegs(6);
		setName("Cici");
		setCanFly(true);
		setIsDangerous(false);
	}
	
	public Butterfly( String name, Boolean canFly, Boolean isDangerous) {
		setNrOfLegs(6);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
	
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXML(eventWriter);
		AnimalRepository.createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.BUTTERFLY);
		}
}
