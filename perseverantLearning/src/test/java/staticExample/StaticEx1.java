package staticExample;

public class StaticEx1 {

	public static void main(String[] args) {
		int cube = StaticEx1.cube(5);
		System.out.println(cube);
	}

	static int cube(int i) {
		return i * i * i;
	}

}
