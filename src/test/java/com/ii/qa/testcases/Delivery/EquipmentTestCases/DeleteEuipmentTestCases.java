package com.ii.qa.testcases.Delivery.EquipmentTestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ii.qa.base.Driverinitialization;
import com.ii.qa.pages.EquipmentPage;

public class DeleteEuipmentTestCases extends Driverinitialization{
EquipmentPage Delete = new EquipmentPage();
	
	@Test
	public void Delete () throws InterruptedException  {
		PageFactory.initElements(driver, Delete);
		
		Thread.sleep(2000);
		EquipmentPage.Master.click();
		Thread.sleep(2000);
		EquipmentPage.Equipment.click();
		Thread.sleep(2000);
		EquipmentPage.SubEquipment.click();
		Thread.sleep(2000);
		EquipmentPage.DeleteButton.click();
		Thread.sleep(2000);
		EquipmentPage.OkButton.click();

}}
