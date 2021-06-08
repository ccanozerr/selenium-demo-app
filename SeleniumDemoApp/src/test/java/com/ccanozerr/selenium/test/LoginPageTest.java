package com.ccanozerr.selenium.test;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.ccanozerr.selenium.Driver;

public class LoginPageTest {
	
	private static Logger logger = Logger.getLogger(LoginPageTest.class);
	private static String url = "https://www.gittigidiyor.com/";
	private static String redirectUrl = "https://www.gittigidiyor.com/uye-girisi";
	
	@Test
	public void loginPageTest() {
		
		//id ve password ile giriþ testi
		logger.info("Running loginPageTest.");
		Driver driver = new Driver();
		driver.setupDriver(url);
		driver.redirectUrl(redirectUrl);
		driver.setKeyById("L-UserNameField", "username");
		driver.setKeyById("L-PasswordField", "password");
		//driver.clickByXPath("//*[@id=\"gg-login-enter\"]");
		driver.clickById("gg-login-enter");
		
	}

}
