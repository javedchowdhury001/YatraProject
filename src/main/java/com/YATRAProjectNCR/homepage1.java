package com.YATRAProjectNCR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage1 {
	@FindBy(xpath ="//a[contains(text(),'My Account')]")
	private WebElement Myaccount;

	@FindBy(xpath ="//a[@id='signInBtn']")
	private WebElement Login;
	
	public homepage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void myaccountname() {
		Myaccount.click();
		Login.click();
	}
}
