package SupplierSupplier;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

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
import com.ii.qa.pages.SupplierSupplierPage;

public class AddSupplierSupplierTestCases extends Driverinitialization{
	
	 SupplierSupplierPage AddSupplierpg = new SupplierSupplierPage();
	@Test
	public void AddSupplierpg() throws InterruptedException, IOException {
		PageFactory.initElements(driver, AddSupplierpg);
		
		Thread.sleep(2000);
		SupplierSupplierPage.Master.click();
		
		Thread.sleep(2000);
		SupplierSupplierPage.Supplier.click();
		
		Thread.sleep(2000);
		SupplierSupplierPage.SubSupplier.click();
		
		Thread.sleep(2000);
		SupplierSupplierPage.AddSupplier.click();
		
		FileInputStream file = new FileInputStream("C:\\QDMS-GITHUB\\Automation_TH\\src\\test\\java\\com\\ii\\qa\\excel\\New Microsoft Excel Worksheet.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet Sheet = workbook.getSheet("Add_SupplierSupplier");
		
	    int rowcount= Sheet.getLastRowNum();
		for(int i=0; i<=rowcount; i++) 
		{
			XSSFRow row = Sheet.getRow(i);
			
			
		String AddSupplierCatogry = (String)row.getCell(0).getStringCellValue();
		String EnterSupplier= (String)row.getCell(1).getStringCellValue();
		String EnterPlant = (String)row.getCell(2).getStringCellValue();
		//int EnterContactNo = (int)row.getCell(3).getNumericCellValue();
		String EnterContactNo = (String)row.getCell(3).getStringCellValue();
		String EnterEmail = (String)row.getCell(4).getStringCellValue();
		String EnterAddress = (String)row.getCell(5).getStringCellValue();
		
		
		Thread.sleep(Duration.ofSeconds(2));
        SupplierSupplierPage.EnterSupplierCatogery.click();
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(text(),'"+AddSupplierCatogry+"')]")).click();
       // driver.findElement(By.xpath("//div[contains(text(),'"+AddSupplierCatogry+"')]")).click();
       
//        Thread.sleep(1000);
//        SupplierSupplierPage.EnterSupplierCatogery.sendKeys(Keys.ARROW_DOWN);
//        Thread.sleep(1000);
//        SupplierSupplierPage.EnterSupplierCatogery.sendKeys(Keys.ENTER);
        
        Thread.sleep(1000);
        SupplierSupplierPage.EnterSupplier.sendKeys(EnterSupplier);
		
		Thread.sleep(2000);
        SupplierSupplierPage.EnterPlant.click();
        driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div/div[2]/div[1]/div/div[1]/span"));
		SupplierSupplierPage.EnterPlant.sendKeys(Keys.ARROW_DOWN+EnterPlant);
		SupplierSupplierPage.EnterPlant.sendKeys(Keys.ENTER);
		
		
		SupplierSupplierPage.EnterContactNo.sendKeys(String.valueOf(EnterContactNo));
		SupplierSupplierPage.EnterEmail.sendKeys(EnterEmail);
		SupplierSupplierPage.EnterAddress.sendKeys(EnterAddress);	
		SupplierSupplierPage.SupplierSave.click();
        //SupplierSupplierPage.EnterSupplierCatogery.sendKeys("Cement Supplier" + Keys.ARROW_DOWN, Keys.ENTER);
//        WebElement AddSup = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/form/div/div[1]/div[1]/div/div[1]/div/div"));
//        Select Addsupplier = new Select(AddSup);
//        System.out.println("Clicked1");
//        Addsupplier.selectByVisibleText("Cement Supplier");
//        System.out.println("Clicked2");
        //Addsupplier.selectByIndex(5);
       
        
        //SupplierSupplierPage.EnterSupplierCatogery.sendKeys(EnterSupplierCatogry);
       //SupplierSupplierPage.EnterSupplierCatogery.sendKeys(Keys.ENTER);
  //      //Thread.sleep(Duration.ofSeconds(2));
//        SupplierSupplierPage.EnterSupplierCatogery.sendKeys(EnterSupplierCatogry);
//        Thread.sleep(1000);
//        SupplierSupplierPage.EnterSupplierCatogery.sendKeys(Keys.TAB);
        
//        System.out.println(EnterSupplierCatogry);
//        SupplierSupplierPage.EnterSupplierCatogery.sendKeys("Innovation");
        
      
        
		//SupplierSupplierPage.EnterSupplierCatogery.sendKeys("Innovation",Keys.AinRROW_DOWN,Keys.RETURN);
//        
//		
		
	//	SupplierSupplierPage.SupplierSave.click();
		
		
		
	}		
	}

}

//        SupplierPage.inputSupplierCategory.sendKeys(Keys.TAB);
//        SupplierPage.supplier.sendKeys(SName);
//        SupplierPage.clickPlant.click();
//        SupplierPage.inputPlant.sendKeys(Plant);
//
//        for (int k = 0; k < SupplierPage.SelectdynamicList.size(); k++) {
//            String text = SupplierPage.SelectdynamicList.get(k).getText();
//            if (text.contains(Plant)) {
//                SupplierPage.SelectdynamicList.get(k).click();
//                break;
//            }
//        }
//        SupplierPage.inputPlant.sendKeys(Keys.TAB);
//        SupplierPage.ContactNo.sendKeys(String.valueOf(PhoneNo20));
//        SupplierPage.Email.sendKeys(Email);
//        SupplierPage.Address.sendKeys(Address);
//        SupplierPage.clickSaveBtn.click();
//
//    }
//}
