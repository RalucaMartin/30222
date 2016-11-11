package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import java.util.Random;
import javasmmr.zoowsome.services.factories.Constants;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Monkey extends Mammal {
	public Monkey(float normalBodyTemp, float percBodyHair, String name, int nrOfLegs, Double maintenanceCost, Double dangerPerc) {
		super(dangerPerc, dangerPerc);
		this.setName(name);
		this.setNormalBodyTemp(normalBodyTemp);
		this.setNrOfLegs(nrOfLegs);;
		this.setPercBodyHair(percBodyHair);
	}
	
	public Monkey() {
		this(15, 80, "Monkyy", 4, 7.5, 0.4);
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
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animal.Mammal.Monkey);
	}


}
