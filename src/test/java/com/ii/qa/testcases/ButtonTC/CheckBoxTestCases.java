package com.ii.qa.testcases.ButtonTC;

import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.ii.qa.base.Driverinitialization;
import com.ii.qa.pages.CheckBoxPage;
import com.ii.qa.pages.TextPage;

public class CheckBoxTestCases extends Driverinitialization{
	CheckBoxPage checkbox = new CheckBoxPage(); 

	@Test
	public void checkbox() throws InterruptedException { 

		PageFactory.initElements(driver, checkbox);

		Thread.sleep(2000); 
		CheckBoxPage.testConfiguration.click();
		Thread.sleep(2000);
		CheckBoxPage.ConfigGroupTest.click();
		Thread.sleep(2000);
		
		//WebElement box = Checkbox_test.checkboxvisible;

		//System.out.println("Element found");
		try {
		boolean ActualElement = CheckBoxPage.checkboxvisible.isDisplayed();
		boolean ExpectedElement = true;
		
		boolean elementvisible = true;
		testCase = extent.createTest("1.Element-visible");
		try {
			AssertJUnit.assertEquals(ActualElement, ExpectedElement);
		} catch (AssertionError e) {
			elementvisible = false;
		}
		if (elementvisible) {
			testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.INFO, "Element Available");
			testCase.log(Status.PASS, "Correct element");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
			testCase.log(Status.INFO, "Element not available");
			testCase.log(Status.FAIL, "No Element");
		}
		
		}
		catch(Exception e){
		
			//boolean elementvisible = true;
			testCase = extent.createTest("1.Element-visible");
			testCase.log(Status.FAIL, "No Element");
//			try {
//				//AssertJUnit.assertEquals("1", "2");
//			} catch (AssertionError e1) {
//				boolean elementvisible = false;
//			}
//			testCase.log(Status.FAIL, "No Element");
			}

		
		
		Thread.sleep(2000);
		
		
		try {
		boolean Actualelement = CheckBoxPage.checkboxenable.isEnabled();
		boolean expectedelement =true;
		
		boolean elementenabled = true;
		testCase =  extent.createTest("2.Element-enabled");
		
		try {
			AssertJUnit.assertEquals(expectedelement, Actualelement);
		}
		catch (AssertionError e) {
			elementenabled= false;
		}
		if(elementenabled) {
			testCase.log(Status.INFO,"Actual" + Actualelement );
			testCase.log(Status.INFO, "Expected" + expectedelement);
			testCase.log(Status.PASS,"Enabled");
		}
		else {
			testCase.log(Status.INFO,"Actual" + Actualelement );
			testCase.log(Status.INFO, "Expected" + expectedelement);
			testCase.log(Status.FAIL,"Enabled");
		}
		}
		catch(Exception e) {
			testCase = extent.createTest("2.Element-enabled");
			testCase.log(Status.FAIL, "No Element");
		}
		
		Thread.sleep(2000);
		
		
//		Checkbox_test.clicktext.click();
		
//		boolean actualclick = Checkbox_test.checkboxenable.isDisplayed();
//		boolean Expectedclick = true;
//		
//		boolean clcikvisible = true;
//		testCase = extent.createTest("*.tick visible");
//		try {
//			AssertJUnit.assertEquals(actualclick, Expectedclick);
//		} catch (AssertionError e) {
//			clcikvisible = false;
//		}
//		if (clcikvisible) {
//			testCase.log(Status.INFO, "ActualElement :- " + actualclick);
//			testCase.log(Status.INFO, "ExpectedElement :- " + Expectedclick);
//			testCase.log(Status.INFO, "Element Available");
//			testCase.log(Status.PASS, "tick visible");
//		} else {
//			testCase.log(Status.INFO, "ActualElement :- " + actualclick);
//			testCase.log(Status.INFO, "ExpectedElement :- " + Expectedclick);
//			testCase.log(Status.INFO, "Element not available");
//			testCase.log(Status.FAIL, "tick no visible");
//		}
//		Thread.sleep(2000);
		
		
		
		
		try {
		boolean Actualselect = CheckBoxPage.checkboxenable.isSelected();
		
		CheckBoxPage.checkboxenable.click();
		boolean expectedselect =CheckBoxPage.checkboxenable.isSelected();
		testCase = extent.createTest("3.test function");
		if(Actualselect){
			if(!expectedselect) {
				testCase.log(Status.INFO,"Actual" + Actualselect );
				testCase.log(Status.INFO, "Expected" + expectedselect);
				testCase.log(Status.PASS,"Pass");
				
			}
			else {
				testCase.log(Status.INFO,"Actual" + Actualselect );
				testCase.log(Status.INFO, "Expected" + expectedselect);
				testCase.log(Status.FAIL,"Fail");
			}
		}
		else if(!Actualselect){
			if(expectedselect) {
			testCase.log(Status.INFO,"Actual" + Actualselect );
			testCase.log(Status.INFO, "Expected" + expectedselect);
			testCase.log(Status.PASS,"Pass");
			}
			else{
				testCase.log(Status.INFO,"Actual" + Actualselect );
				testCase.log(Status.INFO, "Expected" + expectedselect);
				testCase.log(Status.FAIL,"Fail");
			}
		}
		}
			catch(Exception e) {
				testCase = extent.createTest("3.test function");
				testCase.log(Status.FAIL, "No Element");
			}
		
		try {
		Thread.sleep(2000);
		boolean actualtext = CheckBoxPage.checkboxenable.isEnabled();
		boolean expectedtext =true;
		
		boolean textenabled = true;
		testCase =  extent.createTest("4.clickability on text");
		
		try {
			AssertJUnit.assertEquals(actualtext, expectedtext);
		}
		catch (AssertionError e) {
			textenabled= false;
		}
		if(textenabled) {
			testCase.log(Status.INFO,"Actual" + actualtext );
			testCase.log(Status.INFO, "Expected" + expectedtext);
			testCase.log(Status.PASS,"Enabled");
		}
		else {
			testCase.log(Status.INFO,"Actual" + actualtext );
			testCase.log(Status.INFO, "Expected" + expectedtext);
			testCase.log(Status.FAIL,"Enabled");
		}
		}
			catch(Exception e){
				testCase = extent.createTest("4.clickability on text");
				testCase.log(Status.FAIL, "No Element");
			}
		Thread.sleep(2000);
		
		try {
		String text = CheckBoxPage.clicktext.getText();
		//System.out.println(text);
		String text1 = "Report Type";
		boolean txt1 = true;
		testCase = extent.createTest("5.Spelling on text");
		try {
			AssertJUnit.assertEquals(text, text1);
		} catch (AssertionError e) {
			txt1 = false;
		}
			if (txt1) {
				testCase.log(Status.INFO, "ActualElement :- " + text);
				testCase.log(Status.INFO, "ExpectedElement :- " + text1);
				testCase.log(Status.INFO, "correct text");
				testCase.log(Status.PASS, "Correct ");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + text);
				testCase.log(Status.INFO, "ExpectedElement :- " + text1);
				testCase.log(Status.INFO, "wrong text");
				testCase.log(Status.FAIL, "wrong");
			}
		}
		catch(Exception e) {
			testCase = extent.createTest("5.Spelling on text");
			testCase.log(Status.FAIL, "No Element");
		}
		
		Thread.sleep(2000);
		try {
        Dimension size = CheckBoxPage.checkboxenable.getSize();
        int actualWidth = size.getWidth();
        System.out.println("width  = " + actualWidth);
        int expectedSize = 14;
        
        testCase = extent.createTest("6.Checkbox Width");
        boolean width1 = true;
        
        try {
            AssertJUnit.assertEquals(actualWidth, expectedSize);
        } catch (AssertionError find) {
            width1 = false;
        }
        if (width1) {
                testCase.log(Status.INFO, "ActualElement :- " + actualWidth);
                testCase.log(Status.INFO, "ExpectedElement :- " + expectedSize);
                
                testCase.log(Status.PASS, "Correct ");
            } else {
                testCase.log(Status.INFO, "ActualElement :- " + actualWidth);
                testCase.log(Status.INFO, "ExpectedElement :- " + expectedSize);
                
                testCase.log(Status.FAIL, "wrong");
            }
		}
			catch(Exception e) {
				 testCase = extent.createTest("7.Checkbox Width");
				 testCase.log(Status.FAIL, "wrong");
			}
		



        Thread.sleep(2000);
        try {
        Dimension hightsize = CheckBoxPage.checkboxenable.getSize();
        int actualHeight = hightsize.getHeight();
        System.out.println("height = " + actualHeight);
        int expectedHeight = 14;

        boolean height1 = true;
        testCase = extent.createTest("Check box Height");
        try {
            AssertJUnit.assertEquals(actualHeight, expectedHeight);
        } catch (AssertionError find) {
            height1 = false;

        }
        if (height1) {
                testCase.log(Status.INFO, "ActualElement :- " + actualHeight);
                testCase.log(Status.INFO, "ExpectedElement :- " + expectedHeight);
                
                testCase.log(Status.PASS, "Correct ");
            } else {
                testCase.log(Status.INFO, "ActualElement :- " + actualHeight);
                testCase.log(Status.INFO, "ExpectedElement :- " + expectedHeight);
                
                testCase.log(Status.FAIL, "wrong");
            }
        }
        catch(Exception e) {
        	testCase = extent.createTest("Check box Height");
        	testCase.log(Status.FAIL, "wrong");
        }
        
   //position
     
        Point ActulaLocation = CheckBoxPage.checkboxvisible.getLocation();
        int actual_x = ActulaLocation.getX();
        int actual_y = ActulaLocation.getY();
        System.out.println("X axis: " + actual_x);
        System.out.println("Y axis: " + actual_y);

        Point ExpectedLocation = new Point(538, 292);
        boolean Position = true;
        testCase = extent.createTest("CHECKBOX-POSITION");
        try {
            AssertJUnit.assertEquals(ActulaLocation, ExpectedLocation);

        } catch (AssertionError e) {
            Position = false;
        }
        if (Position) {
            testCase.log(Status.INFO, "ActulaLocation :- " + ActulaLocation);
            testCase.log(Status.INFO, "ExpectedLocation :- " + ExpectedLocation);
            testCase.log(Status.PASS, "Correct Location");
        } else {
            testCase.log(Status.INFO, "ActulaLocation :- " + ActulaLocation);
            testCase.log(Status.INFO, "ExpectedLocation :- " + ExpectedLocation);
            testCase.log(Status.FAIL, "Wrong Location");
        }
        
  //Padding
        String ActualTitlepadding = CheckBoxPage.checkboxvisible.getCssValue("padding");
        System.out.println("PADING: "+ActualTitlepadding);
        String ExpectedTitlepadding = "0px";
        testCase = extent.createTest("TEXT PADDING");
        try {
            Assert.assertEquals(ActualTitlepadding, ExpectedTitlepadding);
            testCase.log(Status.INFO, "Actual padding :- " + ActualTitlepadding);
            testCase.log(Status.INFO, "Expected padding :- " + ExpectedTitlepadding);
            testCase.log(Status.PASS, "padding is Correct");
        } catch (AssertionError e) {
            testCase.log(Status.INFO, "Actual padding :- " + ActualTitlepadding);
            testCase.log(Status.INFO, "Expected padding :- " + ExpectedTitlepadding);
            testCase.log(Status.FAIL, "padding is Wrong");
        }
     // check the border color (no border colour)

     			String ActualBorderColor = CheckBoxPage.checkboxvisible.getCssValue("border-colour");
     			System.out.println("rgb :" + ActualBorderColor);

     			String ExpectedBorderColor = "";

     			boolean bordercolor = true;
     			testCase = extent.createTest("010-MAINTYPE-BORDER-COLOR");
     			try {
     				AssertJUnit.assertEquals(ActualBorderColor, ExpectedBorderColor);

     			} catch (AssertionError e) {
     				bordercolor = false;
     			}
     			if (bordercolor) {
     				testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
     				testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
     				testCase.log(Status.PASS, "Correct Border Color");
     			} else {
     				testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
     				testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
     				testCase.log(Status.FAIL, "Wrong Border Color");
     			}
     			Thread.sleep(2000);

     		// CHECK BOX BACKGROUND COLOR(AFTER TICKING)

                String ActualBagroundColor = CheckBoxPage.checkboxvisible.getCssValue("background-color");
                System.out.println("rgb :" + ActualBagroundColor);
                String ExpectedBackgrounColor = "rgba(24, 144, 255, 1)";

                boolean buttoncolor = true;
                testCase = extent.createTest("Background-color");
                try {
                    AssertJUnit.assertEquals(ActualBagroundColor, ExpectedBackgrounColor);

                } catch (AssertionError e) {
                    buttoncolor = false;
                }
                if (buttoncolor) {
                    testCase.log(Status.INFO, "ActualBagroundColor :- " + ActualBagroundColor);
                    testCase.log(Status.INFO, "ExpectedBackgrounColor :- " + ExpectedBackgrounColor);
                    testCase.log(Status.PASS, "Correct Color");
                } else {
                    testCase.log(Status.INFO, "ActualBagroundColor :- " + ActualBagroundColor);
                    testCase.log(Status.INFO, "ExpectedBackgrounColor :- " + ExpectedBackgrounColor);
                    testCase.log(Status.FAIL, "Wrong  Color");
                }
                Thread.sleep(2000);
                
                //Box-Sizing
                
                String ActualBoxSizing = CheckBoxPage.checkboxvisible.getCssValue("box-sizing");
                System.out.println("box-sizing :" + ActualBoxSizing);

                String ExpectedBoxSizing = "border-box";

                boolean boxsizing = true;
                testCase = extent.createTest("010-MAINTYPE-BOX-SIZING");
                try {
                  AssertJUnit.assertEquals(ActualBoxSizing, ExpectedBoxSizing);

                } catch (AssertionError e) {
                  boxsizing = false;
                }
                if (boxsizing) {
                  testCase.log(Status.INFO, "ActualBoxSizing :- " + ActualBoxSizing);
                  testCase.log(Status.INFO, "ExpectedBoxSizing :- " + ExpectedBoxSizing);
                  testCase.log(Status.PASS, "Correct Box Sizing");
                } else {
                  testCase.log(Status.INFO, "ActualBoxSizing :- " + ActualBoxSizing);
                  testCase.log(Status.INFO, "ExpectedBoxSizing :- " + ExpectedBoxSizing);
                  testCase.log(Status.FAIL, "Wrong Box Sizing");
                }
                
                //Cursor
               // try {
                    String actualCursorPoint = CheckBoxPage.checkboxvisible.getCssValue("cursor");
                    String expectedCursorPoint = "pointer";

                    boolean elementCursor = true;
                    testCase = extent.createTest("CHECKBOX-CURSOR-POINTER");
                    try {
                        AssertJUnit.assertEquals(actualCursorPoint, expectedCursorPoint);
                    } catch (AssertionError e) {
                        elementCursor = false;
                    }
                    if (elementCursor) {
                        testCase.log(Status.INFO, "ActualAlignment :- " + actualCursorPoint);
                        testCase.log(Status.INFO, "ExpectedAlignment :- " + expectedCursorPoint);
                        testCase.log(Status.INFO, "Element Available");
                        testCase.log(Status.PASS, "Correct element");
                    } else {
                        testCase.log(Status.INFO, "ActualAlignment :- " + actualCursorPoint);
                        testCase.log(Status.INFO, "ExpectedAlignment :- " + expectedCursorPoint);
                        testCase.log(Status.INFO, "Element not available");
                        testCase.log(Status.FAIL, "No Element");
                    }

//                } catch (Exception e) {
//                    testCase = extent.createTest("CHECKBOX-CURSOR-POINTER");
//                    testCase.log(Status.FAIL, "No Element");
//                }
//                }try {
//                    String actualCursorPoint = CheckBoxNewPage.checkboxvisible.getCssValue("cursor");
//                    String expectedCursorPoint = "pointer";
//
//                    boolean elementCursor = true;
//                    testCase = extent.createTest("CHECKBOX-CURSOR-POINTER");
//                    try {
//                        AssertJUnit.assertEquals(actualCursorPoint, expectedCursorPoint);
//                    } catch (AssertionError e) {
//                        elementCursor = false;
                   

		}
}