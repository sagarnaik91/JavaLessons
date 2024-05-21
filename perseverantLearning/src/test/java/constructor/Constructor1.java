//Example of default constructor that displays the default values
package constructor;

public class Constructor1 {
	int id;
	String name;

	public void display() {
		System.out.println(id + "---" + name);
	}

	public static void main(String[] args) {
		Constructor1 c1 = new Constructor1();
		c1.display();

	}

}
