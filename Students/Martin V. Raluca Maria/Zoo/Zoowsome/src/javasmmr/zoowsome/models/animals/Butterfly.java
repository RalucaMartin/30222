package javasmmr.zoowsome.models.animals;
import java.util.Random;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.services.factories.Constants;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
public class Butterfly extends Insect {
	public Butterfly(Boolean canFly, Boolean isDangerous, String name, int nrOfLegs, Double maintenanceCost, Double dangerPerc) {
		super(dangerPerc, dangerPerc);
		this.setCanFly(canFly);
		this.setIsDangerous(isDangerous);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
	}

	public Butterfly() {
		this(true, true, "Zimi", 8, 0.5, 0.0);
	}
	
	public boolean kill() {
		Random ran = new Random();
		int survive = ran.nextInt(10);
		if( (survive/10) < dangerPerc ) {
			return true;
		} 
		else {
			return false;
		}
		
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Butterfly);
	}

	}
	
	
	

		


