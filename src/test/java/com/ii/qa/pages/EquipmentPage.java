package com.ii.qa.pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EquipmentPage {

		//Add Equipment
		@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div/div[1]/a/div/div/h1")
		public static WebElement Master;
		
		@FindBy(xpath = "/html/body/div[1]/div/section/section/header/ul/li[2]/span/a")
		public static WebElement Equipment;
		
		@FindBy(xpath = "/html/body/div[1]/div/section/section/main/div/div/div[1]/div/div[1]")
		public static WebElement SubEquipment;
		
		@FindBy(xpath = "/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div/div/div/div[1]/div/div[3]/button/span")
		public static WebElement AddEquipment;
		
		@FindBy(xpath = "//*[@id=\"equipment_name\"]")
		public static WebElement EnterEquipmentName;
		
		@FindBy(id="type")
		public static WebElement SelectEquipmentType;
		
		@FindBy(xpath = "//*[@id=\"equipment_description\"]")
		public static WebElement EnterDescription;
		
		@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]")
		public static WebElement Save;
		
		
		//Delete Equipment
		@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div[2]/div[2]/table/tbody/tr[2]/td[4]/span/a[2]/a/span")
		public static WebElement DeleteButton;
		
		@FindBy(xpath = "/html/body/div[3]/div/div/div/div[2]/div/div[2]/button[2]/span")
		public static WebElement OkButton;
		
		
		//Edit Equipment
		@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div[2]/div[2]/table/tbody/tr[2]/td[4]/span/a[1]/span")
		public static WebElement EditButton;
		
		@FindBy(name ="type")
		public static WebElement EditType;
		
		@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[3]/button[2]")
		public static WebElement UpdateButton;
		
	}


