package com.ii.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextPage {
	
	@FindBy(xpath = "(//h1[normalize-space()='MASTER'])[1]")
	public static WebElement master1;
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[1]")
	public static WebElement PlantText;
//	@FindBy(xpath = "//*[@id=\\\"root\\\"]/div/section/section/main/div/div/div/div[1]/a/div/div")
//	public static WebElement Master;
//	@FindBy(xpath = "//div[@class='ant-typography'][normalize-space()='Plant']")
//	public static WebElement PlantText;
}
