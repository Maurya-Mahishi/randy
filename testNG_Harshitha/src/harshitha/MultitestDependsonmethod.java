package harshitha;

import org.testng.annotations.Test;

public class MultitestDependsonmethod {
	
		@Test()
		public void smoke() {
			System.out.println("Smoke");
		}
		@Test(dependsOnMethods = "smoke")
		public void fun() {
			System.out.println("FT");
		}
		@Test(dependsOnMethods = "fun")
		public void integration(){
			System.out.println("IT");
		}

	

}
