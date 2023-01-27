package com.ii.qa.testcases.Delivery;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ii.qa.base.Driverinitialization;
import com.ii.qa.pages.DeliveryPage;
import com.ii.qa.pages.LoginPage;
import com.ii.qa.pages.SbuPage;

public class DeliveryEditTestCases extends Driverinitialization {

	DeliveryPage EditDelivery = new DeliveryPage();                                  

	
	@Test

public void EditDelivery() throws IOException, InterruptedException {
		
		PageFactory.initElements(driver, EditDelivery);
		
		Thread.sleep(2000);
		DeliveryPage.Master.click();
		Thread.sleep(2000);
		DeliveryPage.Customer.click();
		Thread.sleep(2000);
		DeliveryPage.Delivery.click();
		Thread.sleep(2000);
		DeliveryPage.DeliveryEditButton.click();
		
		
		
		FileInputStream file = new FileInputStream("C:\\QDMS-GITHUB\\Automation_TH\\src\\test\\java\\com\\ii\\qa\\excel\\New Microsoft Excel Worksheet.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet Sheet = workbook.getSheet("Delivery_Edit");
		
	    int rowcount= Sheet.getLastRowNum();
		for(int i=0; i<=rowcount; i++) 
		{
			XSSFRow row = Sheet.getRow(i);
			
			
		String EditEnterDelivery = (String)row.getCell(0).getStringCellValue();
		String EditEnterProject = (String)row.getCell(1).getStringCellValue();
		String EditEnterDescription = (String)row.getCell(2).getStringCellValue();
		
        
		Thread.sleep(2000);
		DeliveryPage.EditDelivery.sendKeys(Keys.CONTROL + "a");
		DeliveryPage.EditDelivery.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		DeliveryPage.EditDelivery.sendKeys(EditEnterDelivery);
		
		
		Thread.sleep(2000);
		 DeliveryPage.EditProject.click();
	
		 DeliveryPage.EditProjectValue.sendKeys(EditEnterProject);
		 Thread.sleep(2000);
		
		 
		 driver.findElement(By.xpath("//span[normalize-space()= '" + EditEnterProject + "']")).click();
//		 DeliveryPage.EditProjectValue.sendKeys(Keys.ARROW_DOWN);
//		 Thread.sleep(2000);
		 DeliveryPage.EditProjectValue.sendKeys(Keys.ENTER);
        Thread.sleep(Duration.ofSeconds(5));
        //DeliveryPage.EditProject.sendKeys(Keys.ENTER);
        
       // Thread.sleep(Duration.ofSeconds(2));
//        DeliveryPage.EditProject.sendKeys(Keys.CONTROL +"a");
//        DeliveryPage.EditProject.sendKeys(Keys.DELETE);
//        Thread.sleep(Duration.ofSeconds(2));
//        DeliveryPage.EditProject.sendKeys(EditEnterProject);
//        DeliveryPage.EditProject.sendKeys(Keys.ENTER);
        
	    DeliveryPage.EditDescription.clear();
	    DeliveryPage.EditDescription.sendKeys(Keys.CONTROL + "a");
	    DeliveryPage.EditDescription.sendKeys(Keys.DELETE);
        DeliveryPage.EditDescription.sendKeys(EditEnterDescription);
		
	    Thread.sleep(Duration.ofSeconds(2));
		DeliveryPage.EditSave.click();
		}
}
}

//Thread.sleep(2000);
//DeliveryPage.EditProject.sendKeys(Keys.CONTROL + "a");
//DeliveryPage.EditProject.sendKeys(Keys.DELETE);


//DeliveryPage.EditProjectValue.sendKeys(EditEnterProject);
	//Thread.sleep(Duration.ofSeconds(5));
	 //DeliveryPage.EditProjectValue.clear();