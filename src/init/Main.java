package init;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import eMProject.Chat;
import eMProject.Chien;
import eMProject.EMProjectFactory;
import eMProject.Enclos;
import eMProject.Soigneur;
import eMProject.Zoo;

public class Main {
	
	public static void main(String[] args) {
		
		/*JSONParser jsonParser = new JSONParser();
	      try {
	         //Parsing the contents of the JSON file
	         JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("C:\\Users\\Maxence Bouet\\Desktop\\S9\\EMProject\\src\\init\\configuration.json"));
	         String zoo = (String) jsonObject.get("zoo").toString();
	         System.out.println(zoo);
	         
	      } catch (FileNotFoundException e) {
	            e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      } catch (ParseException e) {
	         e.printStackTrace();
	      }*/
		Zoo zoo = EMProjectFactory.eINSTANCE.createZoo();
		zoo.setId(1);
		Enclos enclos = EMProjectFactory.eINSTANCE.createEnclos();
		enclos.setId(1);
		Enclos enclos2 = EMProjectFactory.eINSTANCE.createEnclos();
		enclos2.setId(2);
		Soigneur soigneur = EMProjectFactory.eINSTANCE.createSoigneur();
		soigneur.setId(1);
		soigneur.setName("John");
		Soigneur soigneur2 = EMProjectFactory.eINSTANCE.createSoigneur();
		soigneur2.setId(2);
		soigneur2.setName("Jack");
		Soigneur soigneur3 = EMProjectFactory.eINSTANCE.createSoigneur();
		soigneur3.setId(3);
		soigneur3.setName("Edward");
		Chat chat = EMProjectFactory.eINSTANCE.createChat();
		chat.setId(1);
		chat.setName("Felix");
		Chat chat2 = EMProjectFactory.eINSTANCE.createChat();
		chat2.setId(2);
		chat2.setName("Litchi");
		Chien chien = EMProjectFactory.eINSTANCE.createChien();
		chien.setId(3);
		chien.setName("Rantanplan");
		enclos.getAnimal().add(chien);
		enclos2.getAnimal().add(chat);
		enclos2.getAnimal().add(chat2);
		enclos.getSoigneur().add(soigneur);
		enclos2.getSoigneur().add(soigneur2);
		enclos2.getSoigneur().add(soigneur3);
		zoo.getSoigneur().add(soigneur);
		zoo.getSoigneur().add(soigneur2);
		zoo.getSoigneur().add(soigneur3);
		zoo.getEnclos().add(enclos);
		zoo.getEnclos().add(enclos2);
		HTMLGeneration html = new HTMLGeneration();
		html.generateHTMLFromZoo(zoo);
		
	}
	
}
