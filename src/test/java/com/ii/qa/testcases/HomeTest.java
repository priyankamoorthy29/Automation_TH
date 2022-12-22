package com.ii.qa.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ii.qa.base.Driverinitialization;
import com.ii.qa.pages.HomePage;
import com.ii.qa.pages.LoginPage;

public class HomeTest extends Driverinitialization {
	HomePage home = new HomePage();

	LoginPage lpa=new LoginPage();

	@Test
	public void Home() throws InterruptedException {
	PageFactory.initElements(driver, home);
	Thread.sleep(2000);
	HomePage.ClickMasterBtn.click();
	
	if (driver.getCurrentUrl().contains("http://qdms-phase-3.s3-website.ap-south-1.amazonaws.com/#/master/plantlevel11111")) {
		System.out.println("successfully navigate to master");
	}
	else {
		System.out.println("Unable to navigate to master");
	}
}
}