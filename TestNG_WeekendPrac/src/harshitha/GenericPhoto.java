package harshitha;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class GenericPhoto {
	public static void getPhoto(WebDriver driver) throws IOException {
		//String ph= "C:\\Users\\DELL\\Pictures\\TestScreenShot";
		//String ph ="C:\\Users\\DELL\\eclipse-workspace\\TestNG_Weekend\\photos\\TC1.jpeg";
		String ph = "./photos1";
		Date d =new Date();
		//System.out.println(d);
		String d2 = d.toString();
		String d1 = d2.replaceAll(":", "-");
		//System.out.println(d1);
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File(ph+d2+".jpeg");
		FileHandler.copy(src, dst);
	}

}
