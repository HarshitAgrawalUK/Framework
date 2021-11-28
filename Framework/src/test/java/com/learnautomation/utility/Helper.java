package com.learnautomation.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {

	public static String captureScreeshot(WebDriver driver) {

		String screenshotPath = System.getProperty("user.dir") + "/Screenshots/SwagTest_" + getCurrentDateTime()
				+ ".png";

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src, new File(screenshotPath));

			System.out.println("screenshot captured");

		} catch (IOException e) {

			System.out.println("unable to capture screenshot " + e.getMessage());
		}

		return screenshotPath;

	}

	public static String getCurrentDateTime() {

		DateFormat customFormat = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");

		Date currentDate = new Date();

		return customFormat.format(currentDate);

	}

}