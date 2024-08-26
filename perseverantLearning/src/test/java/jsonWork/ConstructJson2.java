package jsonWork;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ConstructJson2 {

	public static void main(String[] args) {
		JSONObject jo = new JSONObject();
		JSONArray ja = new JSONArray();
		Map<String, Object> m = new HashMap<String, Object>();
		jo.put("firstName", "John");
		jo.put("lastName", "Smith");
		jo.put("age", 25);
		m.put("streetAddress", "21 2nd Street");
		m.put("city", "New York");
		m.put("state","NY");
		m.put("postalCode", "10021");
		jo.put("address", m);
		m = new HashMap<String, Object>();
		m.put("type", "home");
		m.put("number", "212 555-1234");
		ja.add(m);
		m = new HashMap<String, Object>();
		m.put("type", "fax");
		m.put("number", "212 555-1235");
		ja.add(m);
		jo.put("phoneNumbers", ja);
		System.out.println(jo);

	}

}
