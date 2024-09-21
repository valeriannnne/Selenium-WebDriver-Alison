package com.quaatso.seleniumDemo.app;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebElementPart1 {
	public void handleIframe(String browser) {
		WebDriver driver = Browser.getBrowser(browser);
		// open iframe page
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		
		/* 
		 * (1) Switch to IFrame first
		 * 		switch method - this method Returns the target locator. In our case
		 * 		this target locator is frame
		 * */
		
		// parent frame
		driver.switchTo().frame("iframeResult");
		//find child frame
		WebElement childIframe = driver.findElement(By.tagName("iframe"));
		// switch to the child frame
		driver.switchTo().frame(childIframe);
		// click on html link
		driver.findElement(By.linkText("Learn HTML")).click();
		
		//switch to parent frame
		driver.switchTo().parentFrame();
		//switch to default content
		driver.switchTo().defaultContent();
	}

	public void handleCheckbox(String browser) {
		WebDriver driver = Browser.getBrowser(browser);
		// open checkbox page
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");
		
		// parent frame
		driver.switchTo().frame("iframeResult");
		//find first checkbox (select)
		driver.findElement(By.name("vehicle1")).click();
		//sleep for 3 seconds
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//find first checkbox (select)
		driver.findElement(By.name("vehicle1")).click();
	}
	
	public void handleRadioButton(String browser) {
		WebDriver driver = Browser.getBrowser(browser);
		// open radiobutton page
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_radio");
		
		// parent frame
		driver.switchTo().frame("iframeResult");
		//find first radio button (select)
		driver.findElement(By.cssSelector("input[value='HTML']")).click();
		//sleep for 3 seconds
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//find LAST radio button (select)
		driver.findElement(By.cssSelector("input[value='JavaScript']")).click();
	}
	
	public void handleAlert(String browser) {
		WebDriver driver = Browser.getBrowser(browser);
		// open alert page
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
		// parent frame
		driver.switchTo().frame("iframeResult");
		//find button
		driver.findElement(By.tagName("button")).click();
		//switch to alert and extract text
		Alert alert = driver.switchTo().alert();
		//print alert text
		System.out.println("Alert text is" + alert.getText());
		//accept alert
		alert.accept();		
	}

	public void handleDropdown(String browser) {
		WebDriver driver = Browser.getBrowser(browser);
		// open alert page
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
		
		// parent frame
		driver.switchTo().frame("iframeResult");
		// find select element
		WebElement select = driver.findElement(By.tagName("select"));
		// initialize select object
		Select dropdown = new Select(select);
		dropdown.selectByVisibleText("Opel");
	}
	
}
