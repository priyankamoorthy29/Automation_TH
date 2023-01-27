package com.ii.qa.testcases;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.xpath.XPath;

import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ii.qa.base.Driverinitialization;
import com.ii.qa.pages.LoginPage;
import com.ii.qa.pages.SbuPage;

public class SbuTest extends Driverinitialization {

	SbuPage AddSub = new SbuPage();
	LoginPage loginpg = new LoginPage();

	@BeforeTest
	public void log() throws InterruptedException {
		PageFactory.initElements(driver, loginpg);
		LoginPage.Username.sendKeys("admin");
		Thread.sleep(2000);
		LoginPage.Password.sendKeys("tokyo@admin");
		LoginPage.LoginButton.click();
	}

	@Test(priority = 0)

	public void AddSub() throws InterruptedException, IOException {

		PageFactory.initElements(driver, AddSub);

		Thread.sleep(2000);
		SbuPage.Master.click();

		Thread.sleep(2000);
		SbuPage.SubBusinessUnit.click();
	

	    Thread.sleep(2000);
		SbuPage.AddSubBusinessUnit.click();

		FileInputStream file = new FileInputStream(
				"C:\\QDMS-GITHUB\\Automation_TH\\src\\test\\java\\com\\ii\\qa\\excel\\New Microsoft Excel Worksheet.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("SBU");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);

			String EnterSUB = (String) row.getCell(0).getStringCellValue();
			String EnterDiscription = (String) row.getCell(1).getStringCellValue();

			Thread.sleep(2000);

			SbuPage.EnterSubBusinessUnit.sendKeys(EnterSUB);
			SbuPage.EnterDescription.sendKeys(EnterDiscription);

			SbuPage.Save.click();

		}
	}
 //SubEdit Option;

	@Test(priority = 1)
	public void SbuEdit() throws InterruptedException, IOException {
		PageFactory.initElements(driver, AddSub);

		Thread.sleep(2000);
		SbuPage.SbuEdit.click();
		FileInputStream file = new FileInputStream(
				"C:\\QDMS-GITHUB\\Automation_TH\\src\\test\\java\\com\\ii\\qa\\excel\\New Microsoft Excel Worksheet.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sbu_EditPage");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);

			String EnterEditSUB = (String) row.getCell(0).getStringCellValue();
			String EnterEditDiscription = (String) row.getCell(1).getStringCellValue();

			Thread.sleep(2000);
			SbuPage.EnterSubBusinessUnit.clear();
			SbuPage.EnterSubBusinessUnit.sendKeys(EnterEditSUB);
			SbuPage.EnterDescription.clear();
			SbuPage.EnterDescription.sendKeys(EnterEditDiscription);

			SbuPage.Update.click();
		}

	}

	@Test(priority = 2)

	public void SubDelete() throws InterruptedException {
		System.out.println("this is delet-1 ");
		
		SbuPage.SbuDelete.click();
		System.out.println("this is delete-2");
		Thread.sleep(2000);
		SbuPage.Ok.click();
		System.out.println("this is delete-3 ");
		

	}

}
