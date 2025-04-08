package harshitha;

import org.testng.annotations.Test;

public class Multitestenable {
	@Test()
	public void smoke() {
		System.out.println("Smoke");
	}
	@Test(enabled = false)
	public void fun() {
		System.out.println("FT");
	}
	@Test()
	public void integration(){
		System.out.println("IT");
	}

}
