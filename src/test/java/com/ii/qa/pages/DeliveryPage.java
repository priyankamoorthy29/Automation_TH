package com.ii.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeliveryPage {
	
//	Add Delivery
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div/div[1]/a/div/div")
	public static WebElement Master;
	
	@FindBy(xpath = "//a[@href='#/master/customerlevel']")
	public static WebElement Customer;
	
	@FindBy(xpath = "//div[@class='sc-dnqmqq hnktPT'][normalize-space()='Delivery']")
	public static WebElement Delivery;
	
	@FindBy(xpath = "/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/button/span")
	public static WebElement AddDelivery;
	
	@FindBy(xpath ="//*[@id=\"pour_name\"]")
	public static WebElement EnterDeliveryCycle;
	
	@FindBy(id = "project")
	public static WebElement SelectProject;
	
	@FindBy(xpath = "//*[@id=\"description\"]")
	public static WebElement EnterDescription;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]/span")
	public static WebElement Save;
	
	
	
	
	//Edit Delivery
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div[2]/div[2]/table/tbody/tr[2]/td[5]/span/a[1]/span")
	public static WebElement DeliveryEditButton;	
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[1]/div/input")
	public static WebElement EditDelivery;
	
	//@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[2]/div/div[1]")
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[2]/div/div[1]/div/span[2]")
	public static WebElement EditProject;
	
	//@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[2]/div/div[1]/div/span[1]")
	//@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[2]/div/div[1]/div/span[2]")
	@FindBy(xpath="//*[@id=\"project\"]")
	public static WebElement EditProjectValue;
	
	
	@FindBy(xpath = "//*[@id=\"description\"]")
	public static WebElement EditDescription;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]")
	public static WebElement EditSave;

	
	
	// Delivery DeletePage
	@FindBy(xpath= "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div[2]/div[2]/table/tbody/tr[2]/td[5]/span/a[2]/a/span")
	public static WebElement DeliveryDelete;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div/div[2]/div/div[2]/button[2]/span")
	public static WebElement Ok;
}
