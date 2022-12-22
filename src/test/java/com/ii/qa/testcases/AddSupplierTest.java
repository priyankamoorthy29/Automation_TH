package com.ii.qa.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ii.qa.base.Driverinitialization;
import com.ii.qa.pages.HomePage;
import com.ii.qa.pages.LoginPage;
import com.ii.qa.pages.SupplierCategoryPage;
import com.ii.qa.pages.SupplierPage;

public class AddSupplierTest extends Driverinitialization {
	LoginPage loginpg = new LoginPage();
	HomePage home = new HomePage();
	SupplierPage spage1 = new SupplierPage();
	SupplierCategoryPage scPage = new SupplierCategoryPage();

	@BeforeTest
	public void login() {
		PageFactory.initElements(driver, loginpg);
		LoginPage.Username.sendKeys("admin");
		LoginPage.Password.sendKeys("tokyo@admin");
		LoginPage.LoginButton.click();
	}

	@Test(priority = 0)
	public void ClickHome() throws InterruptedException {
		PageFactory.initElements(driver, home);
		Thread.sleep(2000);
		HomePage.ClickMasterBtn.click();
	}

	@Test(priority = 1)
	public void navigateSupplier() throws InterruptedException {
		PageFactory.initElements(driver, scPage);
		SupplierCategoryPage.SupplierNavigateBtn.click();
		Thread.sleep(2000);
		if (SupplierPage.addSupplierBtn.isDisplayed()==true) {
			System.out.println("Successfully navigate supplier page");
		}
		else {
			System.out.println("unable to navigate supplier page");
		}
	}

	@Test(priority = 2)
	public void AddSupplier() throws InterruptedException, IOException {
		PageFactory.initElements(driver, spage1);
		FileInputStream file = new FileInputStream(
				"D:\\QDMS\\Automation_TH\\src\\test\\java\\com\\ii\\qa\\excel\\New Microsoft Excel Worksheet.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("AddSupplier");

		int rowcount = sheet.getLastRowNum();
		for (int i = 1; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);

			// boolean check = (boolean)row.getCell(0).getBooleanCellValue();
			String SCName = (String) row.getCell(1).getStringCellValue();
			String SName = (String) row.getCell(3).getStringCellValue();
			String Plant = (String) row.getCell(4).getStringCellValue();
			String PhoneNo20 = (String) row.getCell(5).getStringCellValue();
			String Email = (String) row.getCell(6).getStringCellValue();
			String Address = (String) row.getCell(7).getStringCellValue();
			Thread.sleep(2000);
			SupplierPage.clickSuppliersub.click();
			SupplierPage.addSupplierBtn.click();
			Thread.sleep(1000);
			SupplierPage.clickSupplierCategory.click();
			Thread.sleep(1000);
			SupplierPage.inputSupplierCategory.sendKeys(SCName);
			for (int j = 0; j < SupplierPage.SelectdynamicList.size(); j++) {
				String text = SupplierPage.SelectdynamicList.get(j).getText();
				if (text.contains(SCName)) {
					SupplierPage.SelectdynamicList.get(j).click();
					break;
				}
			}
			SupplierPage.inputSupplierCategory.sendKeys(Keys.TAB);
			SupplierPage.supplier.sendKeys(SName);
			SupplierPage.clickPlant.click();
			SupplierPage.inputPlant.sendKeys(Plant);

			for (int k = 0; k < SupplierPage.SelectdynamicList.size(); k++) {
				String text = SupplierPage.SelectdynamicList.get(k).getText();
				if (text.contains(Plant)) {
					SupplierPage.SelectdynamicList.get(k).click();
					break;
				}
			}
			SupplierPage.inputPlant.sendKeys(Keys.TAB);
			SupplierPage.ContactNo.sendKeys(String.valueOf(PhoneNo20));
			SupplierPage.Email.sendKeys(Email);
			SupplierPage.Address.sendKeys(Address);
			SupplierPage.clickSaveBtn.click();

		}
	}
}
