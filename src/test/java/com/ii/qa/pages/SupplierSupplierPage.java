package com.ii.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SupplierSupplierPage {
	
	//Add Delivery
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div/div[1]/a/div/div")
	public static WebElement Master;
	
	@FindBy(xpath ="/html/body/div[1]/div/section/section/header/ul/li[5]/span/a")
	public static WebElement Supplier;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[2]")
	public static WebElement SubSupplier;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div[1]/div/div/div[6]/div/button")
	public static WebElement AddSupplier;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div/div[1]/div[1]/div/div[1]")
	public static WebElement EnterSupplierCatogery;
	
	@FindBy(xpath = "//*[@id=\"supplier_name\"]")
	public static WebElement EnterSupplier;
	
	@FindBy(xpath = "//*[@id=\"supplier_plant\"]")
	public static WebElement EnterPlant;
	
	@FindBy(xpath = "//*[@id=\"supplier_contactno\"]")
	public static WebElement EnterContactNo;
	
	@FindBy(xpath = "//*[@id=\"supplier_email\"]")
	public static WebElement EnterEmail;
	
	@FindBy(xpath = "//*[@id=\"supplier_address\"]")
	public static WebElement EnterAddress;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]/span")
	public static WebElement SupplierSave;
	
	//DeleteSupplier
	@FindBy(xpath = "//tbody/tr[2]/td[8]/span[1]/a[2]/a[1]/span[1]//*[name()='svg']")
	public static WebElement DeleteButton;
	
	@FindBy(xpath = "//span[normalize-space()='OK']")
	public static WebElement OkayButton;
	
	//EditSupplier
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div[2]/div[2]/table/tbody/tr[2]/td[8]/span/a[1]/span")
	public static WebElement EditButton;
	
	@FindBy(xpath = "//div[contains(@class,'ant-modal-root')]//button[2]")
	public static WebElement UpdateButton;
	

	
	

}
