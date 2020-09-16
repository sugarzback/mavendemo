package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public String login(){
		System.setProperty("webdriver.chrome.driver", "chromedriver84.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/sugarzback/Desktop/Sagar/Course/Offline%20website/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
		
		return driver.getTitle();
	}
}
