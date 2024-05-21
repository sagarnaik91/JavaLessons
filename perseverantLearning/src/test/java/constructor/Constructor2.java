package constructor;

public class Constructor2 {

	int id;
	String name;

	Constructor2(int i, String n) {
		this.id = i;
		this.name = n;
	}

	void display() {
		System.out.println(id + "--" + name);
	}

	public static void main(String[] args) {
		Constructor2 c2 = new Constructor2(8, "Sagar");
		c2.display();

	}

}
