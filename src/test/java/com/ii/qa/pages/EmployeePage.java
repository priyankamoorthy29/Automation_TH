package com.ii.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ii.qa.base.Driverinitialization;

public class EmployeePage {
	 
	//Add Employee
	@FindBy(xpath = "//div[@class='sc-htpNat bEzDga']//div[@class='flex-card-home']")
	public static WebElement Master;
	
	@FindBy(xpath = "//a[@href='#/master/employeelevel']")
	public static WebElement Employee;
	
	@FindBy(xpath = "/html/body/div[1]/div/section/section/main/div/div/div[1]/div/div[3]/div[1]")
	public static WebElement SubEmployee;
	
	@FindBy(xpath = "/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div/div[6]/div/button")
	public static WebElement AddEmployee;
	
	@FindBy(xpath = "//*[@id=\"first_name\"]")
	public static WebElement EnterFirstName;
	@FindBy(xpath = "//*[@id=\"last_name\"]")
	public static WebElement EnterLastName;
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[1]/div/div[1]/div")
	public static WebElement EnterPlant;
	@FindBy(xpath = "//*[@id=\"desigination\"]")
	public static WebElement EnterDesignation;
	@FindBy(xpath = "//*[@id=\"address\"]")
	public static WebElement EnterAddress;
	@FindBy(xpath = "//*[@id=\"phoneno\"]")
	public static WebElement EnterContactNumber;
	@FindBy(xpath = "//*[@id=\"email\"]")
	public static WebElement EnterEmail;
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div[3]/button[2]")
	public static WebElement Save;
	
	
	
	//Delete Employee
	
	@FindBy(xpath = "/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[2]/td[10]/span/a[2]/a/span/svg")
	public static WebElement DeleteButton;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div/div[2]/div/div[2]/button[2]/span")
	public static WebElement OkayButton;
	
	
	

}
