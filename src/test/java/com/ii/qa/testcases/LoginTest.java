package com.ii.qa.testcases;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ii.qa.base.Driverinitialization;
import com.ii.qa.pages.LoginPage;


public class LoginTest extends Driverinitialization {
	
	LoginPage loginpg = new LoginPage();
	
	@Test
	public void Login() throws InterruptedException, IOException  {
		
		PageFactory.initElements(driver, loginpg);
		
		Thread.sleep(2000);
        FileInputStream file = new FileInputStream("C:\\Users\\Priyanka\\Documents\\PRIYANKA-AUTOMATION\\Automation_TH\\src\\test\\java\\com\\ii\\qa\\excel\\New Microsoft Excel Worksheet.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
	    XSSFSheet sheet = workbook.getSheet("Login");
		
	    int rowcount = sheet.getLastRowNum();
	    for(int i=0; i<=rowcount;i++) {		
      XSSFRow row = sheet.getRow(i);	
    
			String uName = (String)row.getCell(0).getStringCellValue();
			String pWord = (String)row.getCell(1).getStringCellValue();
			
			
			//if(driver.getCurrentUrl().contains(URL)) {
		
			LoginPage.Username.sendKeys(uName);
			LoginPage.Password.sendKeys(pWord);
			LoginPage.LoginButton.click();
			Thread.sleep(2500);
			driver.navigate().refresh();
			Thread.sleep(2500);
			
//			if (driver.getCurrentUrl().contains(expect)) {
//				System.out.println(uName + pWord +"22222222");
//			}
//			else {
//				System.out.println(uName + pWord +"33333333");
//			}
			
		}
		
		
		
	}
	
}

	
	

