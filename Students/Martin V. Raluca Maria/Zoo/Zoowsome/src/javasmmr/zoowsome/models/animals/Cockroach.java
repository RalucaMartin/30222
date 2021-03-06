package javasmmr.zoowsome.models.animals;
import javasmmr.zoowsome.repositories.AnimalRepository;
import java.util.Random;
import javasmmr.zoowsome.services.factories.Constants;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Cockroach extends Insect {
	public Cockroach(Boolean canFly, Boolean isDangerous, String name, int nrOfLegs, Double maintenanceCost, Double dangerPerc) {
		super(dangerPerc, dangerPerc);
		this.setCanFly(canFly);
		this.setIsDangerous(isDangerous);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
	}

	public Cockroach() {
		this(true, true, "Gandi", 8, 0.2, 0.5);
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
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Cockroach);
	}
}
	
