package jsonWork;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ConstructJson {

	public static void main(String[] args) {
		Map<String, String> m;
		JSONArray jsonarray = new JSONArray();
		JSONObject jsonobject = new JSONObject();
		jsonobject.put("firstName", "John");
		jsonobject.put("lastName", "Smith");
		jsonobject.put("age", 25);

		m = new HashMap<String, String>();
		m.put("streetAddress", "21 2nd Street");
		m.put("city", "New York");
		m.put("state", "NY");
		m.put("postalCode", "10021");
		jsonobject.put("address", m);

		m = new HashMap<String, String>();
		m.put("type", "home");
		m.put("number", "212 555-1234");
		jsonarray.add(m);

		m = new HashMap<String, String>();
		m.put("type", "fax");
		m.put("number", "212 555-1235");
		jsonarray.add(m);
		jsonobject.put("phoneNumbers", jsonarray);
		System.out.println(jsonobject);

	}

}
