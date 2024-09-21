package com.quaatso.seleniumDemo.app;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptExamples {
	
	public void invokeAlert(String browser) {
		// driver object
		WebDriver driver = Browser.getBrowser(browser);
		//open facebook
		driver.get("https://www.facebook.com/");
		// create object fof Javascript executor
		JavascriptExecutor executer = (JavascriptExecutor)driver;
		//execute alert() function
		executer.executeScript("alert('This alert is injected by webdriver');");		
	}
	
	public void sendTextToAnElement(String browser) {
		// driver object
		WebDriver driver = Browser.getBrowser(browser);
		//open facebook
		driver.get("https://www.facebook.com/login/");
		// create object for Javascript executor
		JavascriptExecutor executer = (JavascriptExecutor)driver;
		//enter email
		executer.executeScript("document.getElementById('email').value='sample@gmail.com';");
		//enter password
		executer.executeScript("document.getElementById('pass').value='pass';");
		//click login button //executer.executeScript("document.getElementByName('login').click();");
		WebElement loginButton = driver.findElement(By.name("login"));
	    executer.executeScript("arguments[0].click();", loginButton);
	}
	
	public void refreshBrowser(String browser) {
		// driver object
		WebDriver driver = Browser.getBrowser(browser);
		//open facebook
		driver.get("https://www.facebook.com/login/");
		// create object for Javascript executor
		JavascriptExecutor executer = (JavascriptExecutor)driver;
		//refresh the page
		executer.executeScript("history.go(0);");
	}
	
	public void getTitleOfWebPage(String browser) {
		// driver object
		WebDriver driver = Browser.getBrowser(browser);
		//open facebook
		driver.get("https://www.facebook.com/login/");
		// create object for Javascript executor
		JavascriptExecutor executer = (JavascriptExecutor)driver;
		//get title
		String pageTitle = executer.executeScript("return document.title").toString();
		System.out.println("page title is " + pageTitle);
	}

	public void verticalScroll(String browser) {
		// driver object
		WebDriver driver = Browser.getBrowser(browser);
		//open facebook
		driver.get("https://www.w3schools.com/");
		// create object for Javascript executor
		JavascriptExecutor executer = (JavascriptExecutor)driver;
		//vertical scroll (negative value for scrolling up)
		executer.executeScript("window.scrollBy(0, 1150);");
	}

}
