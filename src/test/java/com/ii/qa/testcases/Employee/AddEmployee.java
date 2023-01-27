package com.ii.qa.testcases.Employee;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.ii.qa.base.Driverinitialization;
import com.ii.qa.pages.EmployeePage;

public class AddEmployee extends Driverinitialization{
	EmployeePage AddEmp =new EmployeePage();
	
	@Test
	public void AddEmp() throws InterruptedException, IOException {
		PageFactory.initElements(driver, AddEmp);
		
		Thread.sleep(2000);
		EmployeePage.Master.click();
		Thread.sleep(2000);
		EmployeePage.Employee.click();
		Thread.sleep(2000);
		EmployeePage.SubEmployee.click();
		Thread.sleep(2000);
		EmployeePage.AddEmployee.click();
		
		FileInputStream file = new FileInputStream("C:\\QDMS-GITHUB\\Automation_TH\\src\\test\\java\\com\\ii\\qa\\excel\\New Microsoft Excel Worksheet.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet Sheet = workbook.getSheet("Add_Employee");
		
	    int rowcount= Sheet.getLastRowNum();
		for(int i=0; i<=rowcount; i++) 
		{
			XSSFRow row = Sheet.getRow(i);
			
		String FirstName = (String)row.getCell(0).getStringCellValue();
		String  LasteName= (String)row.getCell(1).getStringCellValue();
		String Plant = (String)row.getCell(2).getStringCellValue();
		String  Designation= (String)row.getCell(3).getStringCellValue();
		String  ContactNumber= (String)row.getCell(4).getStringCellValue();
		String Address = (String)row.getCell(5).getStringCellValue();
		String Email = (String)row.getCell(6).getStringCellValue();
		
		Thread.sleep(2000);
		EmployeePage.EnterFirstName.sendKeys(FirstName);
		
		EmployeePage.EnterLastName.sendKeys(LasteName);
		
		Thread.sleep(2000);
//	    EmployeePage.EnterPlant.click();
//		EmployeePage.EnterPlant.sendKeys(Keys.ENTER);
//		EmployeePage.EnterPlant.sendKeys(Plant);
//		EmployeePage.EnterPlant.sendKeys(Keys.ARROW_DOWN);
		
//		WebElement plantDropDown = driver.findElement(By.xpath("//span[@title='"+Plant+"']"));  
//		Select dropdown = new Select(plantDropDown);  
////		dropdown.selectByVisibleText("ABZ");  
//		dropdown.selectByIndex(5);  
		driver.findElement(By.id("plant")).click();
	    driver.findElement(By.cssSelector(".ant-select-item-option-active > .ant-select-item-option-content")).click();
	    driver.findElement(By.id("desigination")).click();
	    driver.findElement(By.cssSelector(".ant-select-item-option-active:nth-child(2) > .ant-select-item-option-content")).click();
		
		
//		Thread.sleep(2000);
//		EmployeePage.EnterDesignation.sendKeys(Designation);
		EmployeePage.EnterContactNumber.sendKeys(ContactNumber);
		EmployeePage.EnterAddress.sendKeys(Address);
		EmployeePage.EnterEmail.sendKeys(Email);
		EmployeePage.Save.click();
		
		
		
		
	}
	}
}
