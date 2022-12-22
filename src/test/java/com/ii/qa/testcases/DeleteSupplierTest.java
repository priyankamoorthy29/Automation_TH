package com.ii.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ii.qa.base.Driverinitialization;
import com.ii.qa.pages.HomePage;
import com.ii.qa.pages.LoginPage;
import com.ii.qa.pages.SupplierCategoryPage;
import com.ii.qa.pages.SupplierPage;

public class DeleteSupplierTest extends Driverinitialization{
	LoginPage loginpg = new LoginPage();
	HomePage home = new HomePage();
	SupplierPage spage1=new SupplierPage();
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
	public void navigateSupplier() {
		PageFactory.initElements(driver, scPage);
		SupplierCategoryPage.SupplierNavigateBtn.click();
	}
	@Test(priority = 2)
	public void DeleteSupplier() throws InterruptedException, IOException {
		PageFactory.initElements(driver, spage1);
		SupplierPage.clickSuppliersub.click();
		Thread.sleep(2000);
		SupplierPage.DeleteBtn.click();
		Thread.sleep(2000);
		SupplierPage.DeleteConfirmBtn.click();
	}
}
