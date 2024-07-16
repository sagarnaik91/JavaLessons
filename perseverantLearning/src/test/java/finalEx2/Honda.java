package finalEx2;

public class Honda extends Bike {

	void run() {
		super.run();
		System.out.println("Honda runs smoothly");
	}

	public static void main(String[] args) {
		Honda hn = new Honda();
		hn.run();
	}

}
