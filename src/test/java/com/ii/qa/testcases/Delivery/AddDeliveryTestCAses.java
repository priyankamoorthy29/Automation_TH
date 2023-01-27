package com.ii.qa.testcases.Delivery;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import javax.xml.xpath.XPath;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ii.qa.base.Driverinitialization;
import com.ii.qa.pages.DeliveryPage;
import com.ii.qa.pages.LoginPage;
//import com.ii.qa.pages.SbuPage;


public class AddDeliveryTestCAses extends Driverinitialization {

	DeliveryPage Delivery = new DeliveryPage();
	
	@Test
	public void Delivery() throws IOException, InterruptedException {
		
		PageFactory.initElements(driver, Delivery);
		
		Thread.sleep(2000);
		DeliveryPage.Master.click();
		Thread.sleep(2000);
		DeliveryPage.Customer.click();
		Thread.sleep(2000);
		DeliveryPage.Delivery.click();
		Thread.sleep(2000);
		DeliveryPage.AddDelivery.click();
		
		
		
		FileInputStream file = new FileInputStream("C:\\QDMS-GITHUB\\Automation_TH\\src\\test\\java\\com\\ii\\qa\\excel\\New Microsoft Excel Worksheet.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet Sheet = workbook.getSheet("Delivery");
		
	    int rowcount= Sheet.getLastRowNum();
		for(int i=0; i<=rowcount; i++) 
		{
			XSSFRow row = Sheet.getRow(i);
			
			
		String EnterDelivery = (String)row.getCell(0).getStringCellValue();
		String EnterProject = (String)row.getCell(1).getStringCellValue();
		String EnterDescription = (String)row.getCell(2).getStringCellValue();
		
		
		
        
		Thread.sleep(2000);
		DeliveryPage.EnterDeliveryCycle.sendKeys(EnterDelivery);
		
		Thread.sleep(2000);
        DeliveryPage.SelectProject.sendKeys(EnterProject);
        
        Thread.sleep(Duration.ofSeconds(2));
        DeliveryPage.SelectProject.sendKeys(Keys.ENTER);
	    DeliveryPage.EnterDescription.sendKeys(EnterDescription);
		
	    Thread.sleep(Duration.ofSeconds(2));
		DeliveryPage.Save.click();
		
		}
	}

		
	}

