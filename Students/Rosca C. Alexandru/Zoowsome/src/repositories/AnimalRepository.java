package repositories;

import java.io.*;
import java.util.ArrayList;
import javax.lang.model.element.Element;
import javax.xml.parsers.*;
import javax.xml.soap.Node;
import javax.xml.stream.*;
import javax.xml.stream.events.*;
import javax.xml.stream.XMLEventFactory;

import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import interfaces.XML_Parsable;
import models.animals.*;
import services.factories.Constants;

public class AnimalRepository {
	
	public static final String XML_FILENAME = "Animals.xml";
	private org.w3c.dom.Document doc;
	
	public AnimalRepository(){};
	
	public void save(ArrayList<Animal> animals) throws FileNotFoundException, XMLStreamException { 
 	 	XMLOutputFactory outputFactory = XMLOutputFactory.newInstance(); 
 	 	// Create XMLEventWriter 
 	 	XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(XML_FILENAME)); 
 	 	// Create a EventFactory 
 	 	XMLEventFactory eventFactory = XMLEventFactory.newInstance(); 
 	 	XMLEvent end = eventFactory.createDTD("\n"); 
 	 	// Create and write Start Tag 
 	 	StartDocument startDocument = eventFactory.createStartDocument(); 
 	 	eventWriter.add(startDocument); 
 	 	// Create content open tag 
 	 	StartElement configStartElement = eventFactory.createStartElement("", "", "content");  	 	eventWriter.add(configStartElement);  	 	eventWriter.add(end); 
 
 	 	for (XML_Parsable animal : animals) { 
 	 	 	StartElement sElement = eventFactory.createStartElement("", "", Constants.XML_TAGS.ANIMAL);  	 	 	eventWriter.add(sElement); 
 	 	 	eventWriter.add(end); 
 
 	 	 	animal.encodeToXml(eventWriter); 
 
 	 	 	EndElement eElement = eventFactory.createEndElement("", "", Constants.XML_TAGS.ANIMAL); 
 	 	 	eventWriter.add(eElement); 
 	 	 	eventWriter.add(end); 
 	 	} 
 
 	 	eventWriter.add(eventFactory.createEndElement("", "", "content"));  	 	
 	 	eventWriter.add(eventFactory.createEndDocument());  	 	
 	 	eventWriter.close(); 
 	} 
	
	public static void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException { 
 	 	XMLEventFactory eventFactory = XMLEventFactory.newInstance(); 
 	 	XMLEvent end = eventFactory.createDTD("\n"); 
 	 	XMLEvent tab = eventFactory.createDTD("\t"); 
 	 	// Create Start node 
 	 	StartElement sElement = eventFactory.createStartElement("", "", name);
 	 	eventWriter.add(tab);  	 	
 	 	eventWriter.add(sElement); 
 	 	// Create Content 
 	 	Characters characters = eventFactory.createCharacters(value); 
 	 	eventWriter.add(characters); 
 	 	// Create End node 
 	 	EndElement eElement = eventFactory.createEndElement("", "", name); 
 	 	eventWriter.add(eElement); 
 	 	eventWriter.add(end); 
 	} 


	public ArrayList<Animal> load() throws ParserConfigurationException, SAXException, IOException { 
 	 	ArrayList<Animal> animals = new ArrayList<Animal>();  
 	 	File fXmlFile = new File(XML_FILENAME); 
 	 	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance(); 
 	 	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder(); 
 	 	org.w3c.dom.Document doc = dBuilder.parse(fXmlFile); 
 	 	((org.w3c.dom.Document) doc).getDocumentElement().normalize(); 
 
 	 	NodeList nodeList = ((org.w3c.dom.Document) doc).getElementsByTagName(Constants.XML_TAGS.ANIMAL); 
 
 	 	for (int i = 0; i < nodeList.getLength(); i++) { 
 	 	 	org.w3c.dom.Node node = nodeList.item(i);  	 	 	
 	 	 	if (node.getNodeType() == Node.ELEMENT_NODE) { 
 	 	 	 	Element element = (Element) node; 
 	 	 	 	String discriminant = ((org.w3c.dom.Document) element).getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0) .getTextContent(); 
 	 	 	 switch (discriminant) {  	
 	 	 	 
 	 	 	 	case Constants.Animals.Insects.MOSQUITO:  	 	 	 	 	
 	 	 	 		Animal mosquito = new Mosquito();  	 	 	 	 
 	 	 	 		mosquito.decodeFromXml(element);  	 	 	 	 	
 	 	 	 		animals.add(mosquito);
 	 	 	 		
 	 	 	 	case Constants.Animals.Insects.ANT:  	 	 	 	 	
 	 	 	 		Animal ant = new Ant();  	 	 	 	 
 	 	 	 		ant.decodeFromXml(element);  	 	 	 	 	
 	 	 	 		animals.add(ant);
 	 	 	 		
 	 	 	 	case Constants.Animals.Insects.FLY:  	 	 	 	 	
	 	 	 		Animal fly = new Fly();  	 	 	 	 
	 	 	 		fly.decodeFromXml(element);  	 	 	 	 	
	 	 	 		animals.add(fly);
	 	 	 		
 	 	 	 	case Constants.Animals.Mammals.LION:  	 	 	 	 	
	 	 	 		Animal lion = new Lion();  	 	 	 	 
	 	 	 		lion.decodeFromXml(element);  	 	 	 	 	
	 	 	 		animals.add(lion);
	 	 	 		
 	 	 	 	case Constants.Animals.Mammals.COW:  	 	 	 	 	
	 	 	 		Animal cow = new Cow();  	 	 	 	 
	 	 	 		cow.decodeFromXml(element);  	 	 	 	 	
	 	 	 		animals.add(cow);
	 	 	 		
 	 	 	 	case Constants.Animals.Mammals.HORSE:  	 	 	 	 	
	 	 	 		Animal horse = new Horse();  	 	 	 	 
	 	 	 		horse.decodeFromXml(element);  	 	 	 	 	
	 	 	 		animals.add(horse);
	 	 	 		
 	 	 	 	case Constants.Animals.Birds.CROW:  	 	 	 	 	
	 	 	 		Animal crow = new Crow();  	 	 	 	 
	 	 	 		crow.decodeFromXml(element);  	 	 	 	 	
	 	 	 		animals.add(crow);
	 	 	 		
	 	 	 	case Constants.Animals.Birds.EAGLE:  	 	 	 	 	
	 	 	 		Animal eagle = new Eagle();  	 	 	 	 
	 	 	 		eagle.decodeFromXml(element);  	 	 	 	 	
	 	 	 		animals.add(eagle);
	 	 	 		
	 	 	 	case Constants.Animals.Birds.WOODPECKR:  	 	 	 	 	
	 	 	 		Animal woodpecker = new Woodpecker();  	 	 	 	 
	 	 	 		woodpecker.decodeFromXml(element);  	 	 	 	 	
	 	 	 		animals.add(woodpecker);
	 	 	 		
	 	 	 	case Constants.Animals.Aquatics.FROG:  	 	 	 	 	
	 	 	 		Animal frog = new Frog();  	 	 	 	 
	 	 	 		frog.decodeFromXml(element);  	 	 	 	 	
	 	 	 		animals.add(frog);
	 	 	 		
	 	 	 	case Constants.Animals.Aquatics.SOMON:  	 	 	 	 	
	 	 	 		Animal somon = new Somon();  	 	 	 	 
	 	 	 		somon.decodeFromXml(element);  	 	 	 	 	
	 	 	 		animals.add(somon);
	 	 	 		
	 	 	 	case Constants.Animals.Aquatics.TUNA:  	 	 	 	 	
	 	 	 		Animal tuna = new Tuna();  	 	 	 	 
	 	 	 		tuna.decodeFromXml(element);  	 	 	 	 	
	 	 	 		animals.add(tuna);
	 	 	 		
	 	 	 	case Constants.Animals.Reptiles.CROCODILE:  	 	 	 	 	
 	 	 	 		Animal crocodile = new Crocodile();  	 	 	 	 
 	 	 	 		crocodile.decodeFromXml(element);  	 	 	 	 	
 	 	 	 		animals.add(crocodile);
 	 	 	 		
 	 	 	 	case Constants.Animals.Reptiles.LIZZARD:  	 	 	 	 	
 	 	 	 		Animal lizzard = new Lizzard();  	 	 	 	 
 	 	 	 		lizzard.decodeFromXml(element);  	 	 	 	 	
 	 	 	 		animals.add(lizzard);
 	 	 	 		
 	 	 	 	case Constants.Animals.Reptiles.SNAKE:  	 	 	 	 	
	 	 	 		Animal snake = new Snake();  	 	 	 	 
	 	 	 		snake.decodeFromXml(element);  	 	 	 	 	
	 	 	 		animals.add(snake);
	 	 	 		
	 	 	 	default:  break; 
	 	 	 	} 
	 	 	} 
	 	} 
	 	return animals; 
	} 

	
}
