package staticExample;

public class Student {

	int id;
	String name;
	static String colName = "ITS";

	Student(int i, String n) {
		this.id = i;
		this.name = n;
	}

	void display() {
		System.out.println(id + " " + name + " " + colName);
	}

}
