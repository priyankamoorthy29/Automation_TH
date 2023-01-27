package com.ii.qa.testcases;

/* Add Main Material Category Author :     date :27/01/2023*/
/*Button attribute*/

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import com.ii.qa.base.Driverinitialization;
import com.ii.qa.pages.DeliveryPage;
import com.ii.qa.pages.MaterialMainCategoryPage;



public class MaterialMainCategoryButtonTestCases extends Driverinitialization {

MaterialMainCategoryPage MMCPage = new MaterialMainCategoryPage();
	
	@Test
	public void MMCPage() throws InterruptedException, IOException  {
		

		PageFactory.initElements(driver, MMCPage);
		
		Thread.sleep(2000);  
		MaterialMainCategoryPage.Master.click();
		Thread.sleep(5000);
		MaterialMainCategoryPage.Material.click();
		Thread.sleep(2000);
		MaterialMainCategoryPage.MaterialMainCategoryButton.click();
		
		SoftAssert sa  = new SoftAssert();
        WebElement AddMainMaterialCategoryButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[3]/button"));

        // Find Button Position
        Point ActualLocation = AddMainMaterialCategoryButton.getLocation();
        
        int actual_x = ActualLocation.getX(); 
        int actual_y = ActualLocation.getY(); 
        
        System.out.println("X axis: "+actual_x); 
        System.out.println("Y axis: "+actual_y);
        
        Point ExpectedLocation = new Point(845,93);
        boolean position = true;
		 testCase = extent.createTest("1-Position");
			try {
				AssertJUnit.assertEquals(ActualLocation,ExpectedLocation); 
			} catch ( AssertionError e) {
				position=false;
			}
			if (position) {
				testCase.log(Status.INFO,"ActualLocation :- " + ActualLocation);
				testCase.log(Status.INFO,"ExpectedLocation :- " + ExpectedLocation);
				testCase.log(Status.INFO,"Correct Position");
				testCase.log(Status.PASS,"Position correct");
			} else {
				testCase.log(Status.INFO,"ActualLocation :- " + ActualLocation);
				testCase.log(Status.INFO,"ExpectedLocation :- " + ExpectedLocation);
				testCase.log(Status.INFO,"wrong Position");
				testCase.log(Status.FAIL,"Position Wrong");
			}
				Thread.sleep(2000);
        
       //a.assertEquals(ActualLocation,ExpectedLocation);
        
        // check font size
        
                String ActualfontsSize = AddMainMaterialCategoryButton.getCssValue("font-size"); 
                System.out.println("Font Size: "+ActualfontsSize); 
                String ExpectedfontsSize ="14px";
                
              //sa.assertEquals(ActualfontsSize,ExpectedfontsSize);   
                
                boolean fontsize = true;
                testCase = extent.createTest("2-Font Size");
				try {
					AssertJUnit.assertEquals(ActualfontsSize, ExpectedfontsSize);
				} catch (AssertionError e) {
					fontsize=false;
				}
				if (fontsize) {
					testCase.log(Status.INFO,"ActualfontsSize :- " + ActualfontsSize);
					testCase.log(Status.INFO,"ExpectedfontsSize :- " + ExpectedfontsSize);
					testCase.log(Status.INFO,"Correct font-size");
					testCase.log(Status.PASS,"Font-size Correct");
				} else {
					testCase.log(Status.INFO,"ActualfontsSize :- " + ActualfontsSize);
					testCase.log(Status.INFO,"ExpectedfontsSize :- " + ExpectedfontsSize);
					testCase.log(Status.INFO,"Wrong font-size");
					testCase.log(Status.FAIL,"Font-size Wrong");
				}
					Thread.sleep(2000);	
                 
        // Check the size of the button
                
                Dimension ActualSize = AddMainMaterialCategoryButton.getSize();
                System.out.println("Size :"+ActualSize);
                Dimension ExpectedSize = new Dimension(203,32);
                
             // sa.assertEquals(ActualSize,ExpectedSize);
                
                boolean size = true; 
				testCase = extent.createTest("BUTTON-SIZE");
				try {
					Assert.assertEquals(ActualSize,ExpectedSize);
				} catch (Exception e) {
					size=false;
				}
				if (size) {
					testCase.log(Status.INFO,"ActualSize :- " + ActualSize);
					testCase.log(Status.INFO,"ExpectedSize :- " + ExpectedSize);
					testCase.log(Status.INFO,"Correct Size");
					testCase.log(Status.PASS,"Correct Size");
				} else {
					testCase.log(Status.INFO,"ActualSize :- " + ActualSize);
					testCase.log(Status.INFO,"ExpectedSize :- " + ExpectedSize);
					testCase.log(Status.INFO,"wrong Size");
					testCase.log(Status.FAIL,"wrong Size");
				}
					Thread.sleep(2000);	
                 
        //Check test button color
                
                String ActualColour = AddMainMaterialCategoryButton.getCssValue("background-color");
                System.out.println("rgb :"+ActualColour);
                String ExpectedColour = "rgba(0, 19, 40, 1)";
        
                boolean colour = true;
				
				testCase = extent.createTest("3-Button Colour");
				try {
				AssertJUnit.assertEquals(ActualColour, ExpectedColour);
				} catch (AssertionError e) {
					colour=false;
				}
				if (colour) {
					testCase.log(Status.INFO,"ActualColour :- " + ActualColour);
					testCase.log(Status.INFO,"ExpectedColour :- " + ExpectedColour);
					testCase.log(Status.INFO,"Correct Colour");
					testCase.log(Status.PASS,"Correct Colour");
				} else {
					testCase.log(Status.INFO,"ActualColour :- " + ActualColour);
					testCase.log(Status.INFO,"ExpectedColour :- " + ExpectedColour);
					testCase.log(Status.INFO,"wrong Colour");
					testCase.log(Status.FAIL,"wrong Colour");
				} 
					Thread.sleep(2000);	
        
              //sa.assertEquals(ActualColour,ExpectedColour);
             // sa.assertAll();  
	
	}
            }

               

                
			
