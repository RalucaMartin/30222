package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import java.util.Random;
import javasmmr.zoowsome.services.factories.Constants;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Gull extends Bird {
	public Gull(Boolean migrates, int avgFlightAltitude, String name, int nrOfLegs, Double maintenanceCost, Double dangerPerc) {
		super(dangerPerc, dangerPerc);
		this.setAvgFlightAltitude(avgFlightAltitude); 
		this.setMigrates(migrates); 
		this.setName(name); 
		this.setNrOfLegs(nrOfLegs);
	}	
	public Gull() {
		this(false, 3000, "Gully", 2, 4.3, 0.1);
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
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animal.Bird.Gull);
	}



}
