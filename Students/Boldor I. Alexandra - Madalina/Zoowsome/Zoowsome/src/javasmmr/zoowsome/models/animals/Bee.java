package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public class Bee extends Insect {
	public Bee(int nrOfLegs, String name, Boolean canFly, Boolean isDangerous, double maintenanceCost,
			double dangerPerc) {

		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}

	public Bee() {
		this(6, "Albinuta", true, true, 0.3, 0.2);
	}

	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Bee);
	}

	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub

	}

}
