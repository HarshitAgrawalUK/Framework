package simple;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PracticeXcelData {

	public XSSFWorkbook wb;
	public WebDriver driver;

	public PracticeXcelData() throws IOException {

		File src = new File("./TestData/Data.xlsx");

		FileInputStream fis = new FileInputStream(src);

		wb = new XSSFWorkbook(fis);

	}

	public String getStringData(int sheetIndex, int row, int column) {
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
	}


	public String getStringData(String sheetName, int row, int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}

	public double getNumericData(String sheetName, int row, int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}

	@Test
	public void Login() throws IOException {

		//PracticeXcelData xc = new PracticeXcelData();
		//String Uname = xc.getStringData("login", 0, 0);
		//String pwd = xc.getStringData("login", 0, 1);

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.name("user-name")).sendKeys(getStringData(0, 0, 0));
		driver.findElement(By.name("password")).sendKeys(getStringData("login", 0, 1));
		driver.findElement(By.xpath("//input[@name='login-button']")).click();

	}

}
