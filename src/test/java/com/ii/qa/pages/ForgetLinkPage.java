package com.ii.qa.pages;


	//package Pages;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

		public class ForgetLinkPage {

//		@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div/a/a")
//		public static WebElement forgetlink;
		
		@FindBy(linkText  = "Forgot Password?")
		public static WebElement forgetlink;

//		@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div/div[2]/div/div/span/h4/a")
//		public static WebElement Backtolink;
		
		@FindBy(linkText  = "Back to Login")
		public static WebElement Backtolink;

	}


