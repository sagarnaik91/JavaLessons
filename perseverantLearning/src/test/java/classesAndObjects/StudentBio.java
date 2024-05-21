package classesAndObjects;

public class StudentBio {

	int rollNum;
	String name;

	void insertRecord(int r, String n) {
		rollNum = r;
		name = n;

	}

	void displaybio() {
		System.out.println(rollNum + "-----" + name);
	}

}
