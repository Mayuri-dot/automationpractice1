package com.automationpractise.Scripts;

import org.testng.annotations.Test;

import com.automationpractise.generics.BaseTest;
import com.automationpractise.pages.LoginPage;

public class TestLogin extends BaseTest {
	
	@Test
	public void TC_01()
	{
	LoginPage lp = new LoginPage(driver);
	lp.clicksignin();
	}
	

}
