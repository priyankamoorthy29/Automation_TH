package com.ii.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SupplierPage {

	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[2]")
	public static WebElement clickSuppliersub;

	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div[1]/div/div/div[6]/div/button")
	public static WebElement addSupplierBtn;
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div/div[1]/div[1]/div/div[1]")
	public static WebElement clickSupplierCategory;
	@FindBy(id = "supplier_category")
	public static WebElement inputSupplierCategory;
	@FindBy(xpath = "//*[@class='rc-virtual-list-holder-inner']")
	public static List<WebElement> SelectdynamicList;
	@FindBy(xpath = "//*[@id=\"supplier_name\"]")
	public static WebElement supplier;
	@FindBy(xpath = "//*[@name='supplier_plant']")
	public static WebElement clickPlant;
	@FindBy(xpath = "//*[@id='supplier_plant']")
	public static WebElement inputPlant;
	@FindBy(xpath = "//*[@class='rc-virtual-list-holder-inner']")
	public static List<WebElement> SelectPlantdynamicList;
	@FindBy(xpath = "//*[@id='supplier_contactno']")
	public static WebElement ContactNo;
	@FindBy(xpath = "//input[@id='supplier_email']")
	public static WebElement Email;
	@FindBy(xpath = "//input[@id='supplier_address']")
	public static WebElement Address;
	@FindBy(xpath = "//button[@type='button'][@class='ant-btn sc-gZMcBi dMdnOw'][@style='background: rgb(0, 19, 40); color: white; border: none;']")
	public static WebElement clickSaveBtn;

	@FindBy(css = "#root > div > section > section > main > div > div > div.ant-col.ant-col-21 > div > div > div > div > div.ant-table-container > div.ant-table-body > table > tbody > tr:nth-child(2) > td:nth-child(8) > span > a:nth-child(3) > a > span")
	public static WebElement DeleteBtn;
	@FindBy(xpath = "//*[@type='button'][@class='ant-btn ant-btn-primary ant-btn-sm']")
	public static WebElement DeleteConfirmBtn;
	
	
	@FindBy(xpath = "//div[@class='ant-col ant-col-4']")
	public static WebElement checkSupplierPage;

}
