package com.automationpractise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWithid {
	
	@FindBy(xpath="//input[@id='email']")
    private WebElement Email;
	
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement Password;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	private WebElement signinbtn;
	
	public LoginWithid(WebDriver driver) {
		PageFactory.initElements(driver,this);
 
	}
	
	public void Emailid(String id)
	{
		Email.sendKeys(id);
	}
	
	public void passwordtbx(String psw)
	{
		Password.sendKeys(psw);
	}
	
	public void submitbtm()
	{
		signinbtn.click();;
	}
}
