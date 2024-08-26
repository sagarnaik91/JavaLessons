package jsonWork;

import java.util.Properties;

public class PropertiesEx1 {

	public static void main(String[] args) {
		Properties props = new Properties();
		props.setProperty("username", "test@qwerty.com");
		props.setProperty("password", "qwerty");
		System.out.println(props.getProperty("username"));
		System.out.println(props.getProperty("password"));

	}

}
