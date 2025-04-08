package harshitha;

import org.testng.annotations.Test;

public class Multitest {
	@Test(priority = 0, invocationCount = 2)
	public void smoke() {
		System.out.println("Smoke");
	}
	@Test(priority = 1, invocationCount = 2)
	public void fun() {
		System.out.println("FT");
	}
	@Test(priority = 2, invocationCount = 2)
	public void integration(){
		System.out.println("IT");
	}
}
