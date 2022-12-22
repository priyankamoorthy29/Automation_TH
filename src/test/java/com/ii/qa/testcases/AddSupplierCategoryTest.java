package com.ii.qa.testcases;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ii.qa.base.Driverinitialization;
import com.ii.qa.pages.HomePage;
import com.ii.qa.pages.LoginPage;
import com.ii.qa.pages.SupplierCategoryPage;

public class AddSupplierCategoryTest extends Driverinitialization{
	SupplierCategoryPage scPage = new SupplierCategoryPage();
	LoginPage loginpg = new LoginPage();
	HomePage home = new HomePage();
	
//	@BeforeTest
//	public void login() {
//		PageFactory.initElements(driver, loginpg);
//		LoginPage.Username.sendKeys("admin");
//		LoginPage.Password.sendKeys("tokyo@admin");
//		LoginPage.LoginButton.click();
//	}
//	
//	@Test(priority = 0)
//	public void ClickHome() throws InterruptedException {
//		PageFactory.initElements(driver, home);
//		Thread.sleep(2000);
//		HomePage.ClickMasterBtn.click();
//	}
	@Test(priority = 0)
	public void navigateSupplier() {
		PageFactory.initElements(driver, scPage);
		SupplierCategoryPage.SupplierNavigateBtn.click();
		if (driver.getCurrentUrl().contains("http://qdms-phase-3.s3-website.ap-south-1.amazonaws.com/#/master/supplierlevel")) {
			System.out.println("successfully navigate to Supplier");
		}
		else {
			System.out.println("Unable to navigate to Supplier");
		}
	}
	
	@Test(priority = 1) 
	public void viewSupplierCategory() {
		PageFactory.initElements(driver, scPage);
		SupplierCategoryPage.SupplierCategoryBtn.click();
		if (SupplierCategoryPage.visibleSuplierCatogary.isDisplayed()==true) {
			System.out.println("successfully navigate to SupplierCategory");
		}
		else {
			System.out.println("Unable to navigate to SupplierCategory");
		}
	}
	
	@Test(priority = 2)
	public void addSupplierCategory() throws  IOException, InterruptedException{
		PageFactory.initElements(driver, scPage);
		FileInputStream file = new FileInputStream("D:\\QDMS\\Automation_TH\\src\\test\\java\\com\\ii\\qa\\excel\\New Microsoft Excel Worksheet.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
	    XSSFSheet sheet = workbook.getSheet("AddSCategory");
		
	    int rowcount = sheet.getLastRowNum();
	    for(int i=0; i<=rowcount;i++) {		
      XSSFRow row = sheet.getRow(i);	
    
      		boolean check = (boolean)row.getCell(0).getBooleanCellValue();
			String sname = (String)row.getCell(1).getStringCellValue();
			String sdes = (String)row.getCell(2).getStringCellValue();
			
			if (check==true) {
				Thread.sleep(5000);
				SupplierCategoryPage.addSupplierCategoryBtn.click();
				SupplierCategoryPage.supplierCategoryName.sendKeys(sname);
				SupplierCategoryPage.supplierCategoryDescreption.sendKeys(sdes);
				SupplierCategoryPage.supplierCategorySaveBtn.click();
				Thread.sleep(2500);
			}
	    }
	}

	 
	@Test(priority = 3)
	public void deleteSupplierCategory() throws InterruptedException {
		PageFactory.initElements(driver, scPage);
		SupplierCategoryPage.deleteSupplierCategoryBtn.click();
		Thread.sleep(1000);
		SupplierCategoryPage.confirmDeleteBtn.click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 4)
	public void editSupplierCategory() throws InterruptedException, IOException {
		PageFactory.initElements(driver, scPage);
		
		FileInputStream file = new FileInputStream("D:\\QDMS\\Automation_TH\\src\\test\\java\\com\\ii\\qa\\excel\\New Microsoft Excel Worksheet.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
	    XSSFSheet sheet = workbook.getSheet("EditSCategory");
		
	    int rowcount = sheet.getLastRowNum();
	    for(int i=0; i<=rowcount;i++) {		
      XSSFRow row = sheet.getRow(i);	
    
			boolean check = (boolean)row.getCell(0).getBooleanCellValue();
			String sname = (String)row.getCell(1).getStringCellValue();
			String sdes = (String)row.getCell(2).getStringCellValue();
			if (check==true) {
				SupplierCategoryPage.editSupplierCategoryBtn.click();
				SupplierCategoryPage.supplierCategoryName.sendKeys(Keys.CONTROL + "a");
				SupplierCategoryPage.supplierCategoryName.sendKeys(Keys.DELETE);
				SupplierCategoryPage.supplierCategoryName.sendKeys(sname);
				SupplierCategoryPage.supplierCategoryDescreption.sendKeys(Keys.CONTROL + "a");
				SupplierCategoryPage.supplierCategoryDescreption.sendKeys(Keys.DELETE);
				SupplierCategoryPage.supplierCategoryDescreption.sendKeys(sdes);
				SupplierCategoryPage.updateSupplierCategoryBtn.click();
			}
	    }
	}
}
