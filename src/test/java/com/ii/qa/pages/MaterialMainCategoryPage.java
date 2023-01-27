package com.ii.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MaterialMainCategoryPage {  

	@FindBy(xpath = "//a[@class='sc-bdVaJa ieeiNp'][@href=\"#/master/plantlevel\"]")
	public static WebElement Master;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/header/ul/li[3]/span/a")
	public static WebElement Material;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[1]/div[1]")
	public static WebElement MaterialMainCategoryButton;
	
	@FindBy(xpath = "/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[3]/button/span")
	public static WebElement AddMaterialMainCategoryButton; 
	//
	

}
