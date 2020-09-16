package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jbk.Login;

public class LoginTest {
	Login log = new Login();
	
	@Test
	public void test01()
	{
		String title = log.login();
		Assert.assertEquals(title, "JavaByKiran | Dashboard");
	}

}
