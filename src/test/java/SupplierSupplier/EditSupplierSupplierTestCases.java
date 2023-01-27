package SupplierSupplier;

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
import com.ii.qa.pages.SupplierSupplierPage;

public class EditSupplierSupplierTestCases extends Driverinitialization{
	
	SupplierSupplierPage EditSupplier =new SupplierSupplierPage();
	
	@Test
	public void EditSupplier() throws IOException, InterruptedException {
		
		PageFactory.initElements(driver, EditSupplier);
		
		Thread.sleep(2000);
		SupplierSupplierPage.Master.click();
		
		Thread.sleep(2000);
		SupplierSupplierPage.Supplier.click();
		
		Thread.sleep(2000);
		SupplierSupplierPage.SubSupplier.click();
		
		Thread.sleep(2000);
		SupplierSupplierPage.EditButton.click();
		
		
		FileInputStream file = new FileInputStream("C:\\QDMS-GITHUB\\Automation_TH\\src\\test\\java\\com\\ii\\qa\\excel\\New Microsoft Excel Worksheet.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet Sheet = workbook.getSheet("Edit_SupplierSupplier");
		
	    int rowcount= Sheet.getLastRowNum();
		for(int i=0; i<=rowcount; i++) 
		{
			XSSFRow row = Sheet.getRow(i);
			
			
		String EditSupplierCatogry = (String)row.getCell(0).getStringCellValue();
		String EditSupplier= (String)row.getCell(1).getStringCellValue();
		String EditPlant = (String)row.getCell(2).getStringCellValue();
		//int EnterContactNo = (int)row.getCell(3).getNumericCellValue();
		String EditContactNo = (String)row.getCell(3).getStringCellValue();
		String EditEmail = (String)row.getCell(4).getStringCellValue();
		String EditAddress = (String)row.getCell(5).getStringCellValue();
		
		
		Thread.sleep(Duration.ofSeconds(2));
        SupplierSupplierPage.EnterSupplierCatogery.click();
//        Thread.sleep(1000);
//        SupplierSupplierPage.EnterSupplierCatogery.sendKeys(Keys.BACK_SPACE);
        
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(text(),'"+EditSupplierCatogry+"')]")).click();

        Thread.sleep(1000);
        SupplierSupplierPage.EnterSupplier.sendKeys(Keys.CONTROL+"a");
        SupplierSupplierPage.EnterSupplier.sendKeys(Keys.DELETE);
        SupplierSupplierPage.EnterSupplier.sendKeys(EditSupplier);
		
		Thread.sleep(2000);
        SupplierSupplierPage.EnterPlant.sendKeys(Keys.TAB);
        driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div/div[2]/div[1]/div/div[1]/span"));
		SupplierSupplierPage.EnterPlant.sendKeys(Keys.ARROW_DOWN+EditPlant);
		SupplierSupplierPage.EnterPlant.sendKeys(Keys.ENTER);
		
		
		SupplierSupplierPage.EnterContactNo.sendKeys(Keys.CONTROL+"a");
		SupplierSupplierPage.EnterContactNo.sendKeys(Keys.DELETE);
		SupplierSupplierPage.EnterContactNo.sendKeys(String.valueOf(EditContactNo));
		SupplierSupplierPage.EnterEmail.sendKeys(Keys.CONTROL+"a");
		SupplierSupplierPage.EnterEmail.sendKeys(Keys.DELETE);
		SupplierSupplierPage.EnterEmail.sendKeys(EditEmail);
		SupplierSupplierPage.EnterAddress.sendKeys(Keys.CONTROL+"a");
		SupplierSupplierPage.EnterAddress.sendKeys(Keys.DELETE);
		SupplierSupplierPage.EnterAddress.sendKeys(EditAddress);
		SupplierSupplierPage.UpdateButton.click();		
    
 		
		
		
	}		
	}



				
	}

