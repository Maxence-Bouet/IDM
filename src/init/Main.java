package init;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {
	
	public static void main(String[] args) {
		
		JSONParser jsonParser = new JSONParser();
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
	      }
		
		
	}
	
}
