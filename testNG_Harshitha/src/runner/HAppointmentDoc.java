package runner;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic.HNewBefore;

public class HAppointmentDoc extends HNewBefore{
   @Test
   public void appoint() {
	   driver.findElement(By.xpath("(//a[@href='#'])[4]")).click();
	   driver.findElement(By.xpath("//a/following-sibling::span")).click();
	   driver.findElement(By.xpath("//button[text()= Add Appointment']")).click();
	   
   }
}
