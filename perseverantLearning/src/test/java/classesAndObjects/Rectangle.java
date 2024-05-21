package classesAndObjects;

public class Rectangle {
	int l;
	int b;

	void getDimension(int length, int breadth) {
		l = length;
		b = breadth;
	}

	void getArea() {
		System.out.println("area is " + l * b);

	}

}
