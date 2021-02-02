package com.automationpractise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractise.generics.FWUtils;

public class LoginPage extends FWUtils {
	
	@FindBy(xpath="//*[@class='login']")
	private WebElement  signin;
	
	
//	@FindBy(id="email")
//	private WebElement username;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clicksignin()
	{
		signin.click();
	}
	
//	public void SetUsername(String un)
//	{
//		
//	username.sendKeys(un);
//	
	
}
