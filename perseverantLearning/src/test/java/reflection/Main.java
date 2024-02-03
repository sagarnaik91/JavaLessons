package reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Main {

	public static void main(String[] args) {

		Test t = new Test();
		Class clazz = t.getClass();
		Method[] arrayOfMethods = clazz.getDeclaredMethods();
		System.out.println(arrayOfMethods.length);
		for (Method m : arrayOfMethods) {
			System.out.println(m.getName());
		}

	}

}
