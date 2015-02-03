/* Nikita Rau
* Given a .json file, open the file, parse the file, 
* change some values in it, and write and save a new json file. */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonEncodeDemo {
		public static void main(String[] args) {

		try {
			// read the json file
			FileReader reader = new FileReader(args[0]);

			JSONParser jsonParser = new JSONParser();
			JSONObject obj = (JSONObject) jsonParser.parse(reader);
			obj.put("name", "foo");
		    obj.put("num", new Integer(100));
		    obj.put("balance", new Double(1000.21));
		    obj.put("is_vip", new Boolean(true));
			System.out.println(obj);

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ParseException ex) {
			ex.printStackTrace();
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}

	}

}