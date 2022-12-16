package com.ii.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SbuPage {
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div/div[1]/a/div/div/h1")
	public static WebElement Master;
    @FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[1]/div[1]")
	public static WebElement SubBusinessUnit;
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button/span")
	public static WebElement AddSubBusinessUnit;
	@FindBy(xpath = "//*[@id=\"sub_business_unit\"]")
	public static WebElement EnterSubBusinessUnit;
	@FindBy(xpath = "//*[@id=\"description\"]")
	public static WebElement EnterDescription;
	@FindBy(xpath= "/html/body/div[2]/div/div[2]/div/div[2]/div[3]/div/button[2]")
	public static WebElement Save;

}
