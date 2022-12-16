package com.ii.qa.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverinitialization {

	public static WebDriver driver;
	public static String URL = "http://qdms-phase-3.s3-website.ap-south-1.amazonaws.com/";
	 
@BeforeSuite
	public  void main() {
		
		//Setting system properties of ChromeDriver
	    WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(URL);
	 
	}
      

}
