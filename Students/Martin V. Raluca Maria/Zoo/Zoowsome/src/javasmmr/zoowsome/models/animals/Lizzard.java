package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import java.util.Random;
import javasmmr.zoowsome.services.factories.Constants;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Lizzard extends Reptile{
	public Lizzard(Boolean laysEggs, String name, int nrOflegs, Double maintenanceCost, Double dangerPerc) {
		super(dangerPerc, dangerPerc);
		this.setLaysEggs(laysEggs); 
		this.setName(name); 
		this.setNrOfLegs(nrOflegs);
	}
		
	public Lizzard() {
		this(true, "Lizzy", 4, 0.4, 0.2);
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
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Lizzard);
	}

}
