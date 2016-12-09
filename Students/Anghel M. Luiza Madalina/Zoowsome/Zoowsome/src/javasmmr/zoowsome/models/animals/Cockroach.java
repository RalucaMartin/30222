package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Cockroach extends Insect {

	public Cockroach(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}

	public Cockroach() {
		this.setNrOfLegs(4);
		this.setName("Cockroach");
		this.setCanFly(true);
		this.setIsDangerous(false);
		this.setMaintenanceCost(2.1);
		this.setDangerPerc(0.1);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Insects.COCKROACH);
	}
}
