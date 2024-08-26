package jsonWork;

import java.util.Properties;

public class PropertiesEx2 {

	public static void main(String[] args) {
		Properties props = new Properties();
		props.setProperty("username", "xyz@test.com");
		System.out.println(props.getProperty("username"));

	}

}
