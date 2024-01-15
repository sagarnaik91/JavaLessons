package cucumbergr.cucumberar;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class Hooks {
	@Before("@prod")
	public void setUp() {
		System.out.println("Before hooks --Launching browser ");
	}

	@Before
	public void setUp1() {
		System.out.println("Before hooks --Launching browser1");
	}

	@After("@prod")
	public void tearDown() {
		System.out.println("After hooks-- Quitting browser");
	}

	@After
	public void tearDown1() {
		System.out.println("After hooks-- Quitting browser1");
	}

	/**
	 * @BeforeAll public static void before_all() { System.out.println("Establishing
	 *            DB conn"); }
	 * 
	 * @AfterAll public static void after_all() { System.out.println("Closing DB
	 *           conn"); }
	 * 
	 * @BeforeStep public void before_step() { System.out.println("Adding log"); }
	 * 
	 * @AfterStep public void after_step() { System.out.println("Deleting log"); }
	 **/

}
