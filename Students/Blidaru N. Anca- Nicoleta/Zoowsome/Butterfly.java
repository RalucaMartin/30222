package javasmmr.zoowsome.models.animals;

import java.time.LocalDateTime;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class Butterfly extends Insect {

	public Butterfly(int nrOfLegs, String name, boolean canFly, boolean isDangerous, double maintenanceCost, double dangerPerc) {
		
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}

	public Butterfly() {
		this(4, "Butterfly", true, false, 1, 0.1);
	}

	@Override
	public double getPredisposition() {

		LocalDateTime now = LocalDateTime.now();
		int month = now.getMonthValue();

		if (month > 9 && month < 12) {
			return 0.1;
		}
		return 0.0;

	}

	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.BUTTERFLY);

	}

	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub

	}

}
