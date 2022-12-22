package com.ii.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SupplierCategoryPage {

	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/header/ul/li[5]")
	public static WebElement SupplierNavigateBtn;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[1]/div[1]")
	public static WebElement SupplierCategoryBtn;
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div[1]/div/div[1]")
	public static WebElement visibleSuplierCatogary;
	
	@FindBy(xpath = "//*[@type='button'][@class='ant-btn sc-gZMcBi dMdnOw']")
	public static WebElement addSupplierCategoryBtn;
	@FindBy(xpath = "//*[@id=\"supplier_category\"]")
	public static WebElement supplierCategoryName;
	@FindBy(xpath = "//*[@id=\"supplierCategory_description\"]")
	public static WebElement supplierCategoryDescreption;
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]")
	public static WebElement supplierCategorySaveBtn;
	
	@FindBy(xpath = "/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div/div/div/div[2]/div[2]/table/tbody/tr[2]/td[3]/span/a[2]/a/span")
	public static WebElement deleteSupplierCategoryBtn;
	@FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div[2]/button[2]/span")
	public static WebElement confirmDeleteBtn;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div[2]/div[2]/table/tbody/tr[2]/td[3]/span/a[1]/span")
	public static WebElement editSupplierCategoryBtn;
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div[3]/button[2]")
	public static WebElement updateSupplierCategoryBtn;
}
