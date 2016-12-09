package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import java.util.Random;
import javasmmr.zoowsome.services.factories.Constants;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Crocodile extends Reptile{
	public Crocodile(Boolean laysEggs, String name, int nrOflegs, Double maintenanceCost, Double dangerPerc) {
		super(dangerPerc, dangerPerc);
		this.setLaysEggs(laysEggs);
		this.setName(name);
		this.setNrOfLegs(nrOflegs);
	}
	
	public Crocodile() {
		this(true, "Crocky", 4, 8.0, 1.0);
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
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Crocodile);
	}


}
