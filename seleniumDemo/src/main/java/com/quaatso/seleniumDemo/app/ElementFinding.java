package com.quaatso.seleniumDemo.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementFinding {
	
	/*
	 * 1. Get webdriver object as per browser name
	 * 2. Open Facebook
	 * 3. Find email element
	 * */
	
	public void findElementByName(String browser) {
		WebDriver driver = Browser.getBrowser(browser);
		//Open Facebook
		driver.get("https://www.facebook.com");
		//Find Email WebElement
		WebElement emailElement = driver.findElement(By.name("email"));
		//Send testing email
		emailElement.sendKeys("autho@quaatso.com");		
	}
	
	public void findElementById(String browser) {
		WebDriver driver = Browser.getBrowser(browser);		
		//Open Facebook
		driver.get("https://www.facebook.com");
		//Find Password WebElement
		WebElement emailElement = driver.findElement(By.id("pass"));
		//Send testing password
		emailElement.sendKeys("password");		
	}
	
	public void findElementByLinkText (String browser) {
		WebDriver driver = Browser.getBrowser(browser);		
		//Open Facebook
		driver.get("https://www.facebook.com");
		//Find Password WebElement
		WebElement emailElement = driver.findElement(By.linkText("Forgot password?"));
		//Clicking the element
		emailElement.click();		
	}

	public void findElementByPartialLinkText (String browser) {
		WebDriver driver = Browser.getBrowser(browser);		
		//Open Facebook
		driver.get("https://www.facebook.com");
		//Find Password WebElement
		WebElement emailElement = driver.findElement(By.partialLinkText("Fund"));
		//Clicking the element
		emailElement.click();		
	}
	
	public void findElementByXPath (String browser) {
		WebDriver driver = Browser.getBrowser(browser);		
		//Open Facebook
		driver.get("https://www.facebook.com");
		//Find Password WebElement
		WebElement emailElement = driver.findElement(By.xpath("//*[@name='email']"));
		//Clicking the element
		emailElement.sendKeys("author@quaatso.com");
	}

	public void findElementByCSS (String browser) {
		WebDriver driver = Browser.getBrowser(browser);		
		//Open Facebook
		driver.get("https://www.facebook.com");
		//Find Password WebElement
		WebElement emailElement = driver.findElement(By.cssSelector("input[id='pass']"));
		//Clicking the element
		emailElement.sendKeys("author@quaatso.com");
	}
}
