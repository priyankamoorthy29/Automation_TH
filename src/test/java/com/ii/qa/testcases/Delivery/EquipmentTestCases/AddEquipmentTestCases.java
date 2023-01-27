package com.ii.qa.testcases.Delivery.EquipmentTestCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ii.qa.base.Driverinitialization;
import com.ii.qa.pages.DeliveryPage;
import com.ii.qa.pages.EquipmentPage;

public class AddEquipmentTestCases extends Driverinitialization{
	EquipmentPage Equipment = new EquipmentPage();
	
	@Test
	public void Equipment() throws InterruptedException, IOException {
	
		PageFactory.initElements(driver, Equipment);
		
		Thread.sleep(2000);
		EquipmentPage.Master.click();
		Thread.sleep(2000);
		EquipmentPage.Equipment.click();
		Thread.sleep(2000);
		EquipmentPage.AddEquipment.click();
		
		FileInputStream file = new FileInputStream("C:\\QDMS-GITHUB\\Automation_TH\\src\\test\\java\\com\\ii\\qa\\excel\\New Microsoft Excel Worksheet.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet Sheet = workbook.getSheet("Add_Equipment");
		
	    int rowcount= Sheet.getLastRowNum();
		for(int i=0; i<=rowcount; i++) 
		{
			XSSFRow row = Sheet.getRow(i);
			
		String Equipment = (String)row.getCell(0).getStringCellValue();
		String Type = (String)row.getCell(1).getStringCellValue();
		String Description = (String)row.getCell(2).getStringCellValue();
		
		Thread.sleep(2000);
		EquipmentPage.EnterEquipmentName.sendKeys(Equipment);
		
		Thread.sleep(2000);
		EquipmentPage.SelectEquipmentType.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		EquipmentPage.SelectEquipmentType.sendKeys(Type);
		Thread.sleep(2000);
		EquipmentPage.SelectEquipmentType.sendKeys(Keys.ARROW_DOWN);
		
		Thread.sleep(2000);
		EquipmentPage.SelectEquipmentType.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		EquipmentPage.EnterDescription.sendKeys(Description);
		
		Thread.sleep(2000);
		EquipmentPage.Save.click();	

}
}
}