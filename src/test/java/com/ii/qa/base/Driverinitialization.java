package com.ii.qa.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;




public class Driverinitialization {

	public static WebDriver driver;
	public static String URL = "http://qdms-phase-3.s3-website.ap-south-1.amazonaws.com/";
	 
@BeforeSuite
	public  void main() {
		
		//Setting system properties of ChromeDriver
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\Priyanka\\Downloads\\geckodriver-v0.32.0-win32 (1)\\geckodriver.exe");

        driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get(URL);
	 
	}
      

}
