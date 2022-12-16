package com.ii.qa.testcases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ii.qa.base.Driverinitialization;
import com.ii.qa.pages.SbuPage;

public class SbuTest extends Driverinitialization{
	
	
	SbuPage AddSub =new SbuPage();
	
	@Test
public void AddSub() throws InterruptedException, IOException {
		
		PageFactory.initElements(driver, AddSub);
		
		 Thread.sleep(4500);
         SbuPage.Master.click();
         
         Thread.sleep(2000);
         SbuPage.SubBusinessUnit.click();
         
         Thread.sleep(2000);
         SbuPage.AddSubBusinessUnit.click();
		
		 FileInputStream file = new FileInputStream("C:\\Users\\Priyanka\\Documents\\PRIYANKA-AUTOMATION\\Automation_TH\\src\\test\\java\\com\\ii\\qa\\excel\\New Microsoft Excel Worksheet.xlsx");
         XSSFWorkbook workbook = new XSSFWorkbook(file);
         XSSFSheet sheet = workbook.getSheet("SBU");
         
         int rowcount = sheet.getLastRowNum();
         for(int i=0; i<=rowcount;i++) {        
       XSSFRow row = sheet.getRow(i);    
     
             String EnterSUB = (String)row.getCell(0).getStringCellValue();
             String EnterDiscription = (String)row.getCell(1).getStringCellValue();
		
		Thread.sleep(2000);
		
		SbuPage.EnterSubBusinessUnit.sendKeys(EnterSUB);
		SbuPage.EnterDescription.sendKeys(EnterDiscription);
		Thread.sleep(2000);
		SbuPage.Save.click();
		
}
	}


}
