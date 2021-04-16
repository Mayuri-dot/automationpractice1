package com.automationpractise.Scripts;

import org.testng.annotations.Test;

import com.automationpractise.generics.BaseTest;
import com.automationpractise.pages.LoginPage;
import com.automationpractise.pages.LoginWithid;

public class TestLogin extends BaseTest {
	
	@Test
	public void TC_01()
	{
	LoginPage lp = new LoginPage(driver);
	lp.clicksignin();
	LoginWithid lid = new LoginWithid(driver);
	lid.Emailid("sahoomayuri1234@gmail.com");
	lid.passwordtbx("mayuri123");
	lid.submitbtm();
	}
	
	
	

}
