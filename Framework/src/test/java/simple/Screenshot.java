package simple;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Screenshot {

	WebDriver driver;

	@Test
	public void screenshot() throws IOException

	{

		TakesScreenshot ts = (TakesScreenshot) driver;
		File fs = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fs, new File("./Screenshots/Test"+PracDateFormat.getCurrentDate()+".png"));

	}
	
	
	

}
