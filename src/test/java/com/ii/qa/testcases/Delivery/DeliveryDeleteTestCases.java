package com.ii.qa.testcases.Delivery;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ii.qa.base.Driverinitialization;
import com.ii.qa.pages.DeliveryPage;

public class DeliveryDeleteTestCases extends Driverinitialization{
	
	DeliveryPage Deletepg = new DeliveryPage();
	@Test
	public void Deletepg() throws InterruptedException 
	{
		PageFactory.initElements(driver,Deletepg);
		
		Thread.sleep(2000);
		DeliveryPage.Master.click();
		
		Thread.sleep(2000);
		DeliveryPage.Customer.click();
		
		Thread.sleep(2000);
		DeliveryPage.Delivery.click();
		
		Thread.sleep(2000);
		DeliveryPage.DeliveryDelete.click();
		
		Thread.sleep(2000);
		DeliveryPage.Ok.click();
	}

}
