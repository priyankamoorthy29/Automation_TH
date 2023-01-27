package SupplierSupplier;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ii.qa.base.Driverinitialization;
import com.ii.qa.pages.EquipmentPage;
import com.ii.qa.pages.SupplierSupplierPage;

public class DeleteSupplierSupplierTestCases extends Driverinitialization {
	SupplierSupplierPage Delete = new SupplierSupplierPage();
	
	@Test
	public void Delete() throws InterruptedException  {
		PageFactory.initElements(driver, Delete);
		
	Thread.sleep(2000);
	SupplierSupplierPage.Master.click();
	
	Thread.sleep(2000);
	SupplierSupplierPage.Supplier.click();
	
	Thread.sleep(2000);
	SupplierSupplierPage.SubSupplier.click();
	
	Thread.sleep(2000);
	SupplierSupplierPage.DeleteButton.click();
	
	Thread.sleep(2000);
	SupplierSupplierPage.OkayButton.click();
	
	}
	
}	


