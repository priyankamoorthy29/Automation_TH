package com.ii.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	
		// TODO Auto-generated method stub
		@FindBy(id = "usernameOrEmail")
		public static WebElement Username;
		@FindBy(id = "password")
		public static WebElement Password;
		@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div/div[3]/div/div/span/button")
		public static WebElement LoginButton;

}
