package com.ii.qa.testcases.Delivery.EquipmentTestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;import javax.xml.xpath.XPath;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.ii.qa.base.Driverinitialization;
import com.ii.qa.pages.EquipmentPage;

public class EditEquipmentTestCases extends Driverinitialization{
	EquipmentPage Edit = new EquipmentPage();
	
	@Test
	public void Edit () throws InterruptedException, IOException {
		
		PageFactory.initElements(driver, Edit);
		
		
		Thread.sleep(2000);
		EquipmentPage.Master.click();
		Thread.sleep(2000);
		EquipmentPage.Equipment.click();
		Thread.sleep(2000);
		EquipmentPage.SubEquipment.click();
		Thread.sleep(2000);
		EquipmentPage.EditButton.click();
		
		FileInputStream file = new FileInputStream("C:\\QDMS-GITHUB\\Automation_TH\\src\\test\\java\\com\\ii\\qa\\excel\\New Microsoft Excel Worksheet.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet Sheet = workbook.getSheet("Edit_Equipment");
		
	    int rowcount= Sheet.getLastRowNum();
		for(int i=0; i<=rowcount; i++) 
		{
			XSSFRow row = Sheet.getRow(i);
			
		String Equipment = (String)row.getCell(0).getStringCellValue();
		String Type = (String)row.getCell(1).getStringCellValue();
		String Description = (String)row.getCell(2).getStringCellValue();
		

		Thread.sleep(2000);
		EquipmentPage.EnterEquipmentName.sendKeys(Keys.CONTROL + "a");
		EquipmentPage.EnterEquipmentName.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		EquipmentPage.EnterEquipmentName.sendKeys(Equipment);
		

		EquipmentPage.EditType.click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='" + Type + "']")).click();

		Thread.sleep(2000);
		EquipmentPage.EnterDescription.clear();
		EquipmentPage.EnterDescription.sendKeys(Description);
		
		Thread.sleep(2000);
		EquipmentPage.UpdateButton.click();	
		
		
	}

}}
