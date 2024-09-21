package com.quaatso.seleniumDemo.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebElementPart2 {
	public void openWebPageUsingNavigation(String browser) {
		WebDriver driver = Browser.getBrowser(browser);
		// navigation class
		driver.navigate().to("https://www.facebook.com/");
	}
	
	public void handleBackwardNavigation(String browser) {
		WebDriver driver = Browser.getBrowser(browser);
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().to("https://www.w3schools.com/");
		// 3 seconds
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// backward navigation
		driver.navigate().back();
	}

	public void handleForwardNavigation(String browser) {
		WebDriver driver = Browser.getBrowser(browser);
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().to("https://www.w3schools.com/");
		// 3 seconds
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// backward navigation
		driver.navigate().back();
		// 3 seconds
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// forward navigation
		driver.navigate().forward();
	}
	
	public void handleBackForwardNavigation(String browser) {
		WebDriver driver = Browser.getBrowser(browser);
		driver.navigate().to("https://www.facebook.com/");
		// open signup page
		driver.findElement(By.linkText("Sign Up")).click();
		// clicking Sign up button
		driver.findElement(By.xpath("//*[@name='websubmit']")).click();
		// return fb
		driver.navigate().back();
		// 3 seconds
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return signup page
		driver.navigate().forward();
		// 3 seconds
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return fb
		driver.navigate().back();
		// 3 seconds
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return signup page
		driver.navigate().forward();
	}
	
	public void handlePageRefresh(String browser) {
		WebDriver driver = Browser.getBrowser(browser);
		driver.navigate().to("https://www.facebook.com/");
		// refresh page
		driver.navigate().refresh();
	}
	
	public void handleMultipleWindows (String browser) {
		WebDriver driver = Browser.getBrowser(browser);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
		// print title of page
		System.out.println("Parent title is " + driver.getTitle());
		//switch to iframe
		driver.switchTo().frame("iframeResult");
		// capture window id
		String parentWindowId = driver.getWindowHandle();		
		System.out.println("Parent window id is " + parentWindowId);
		// click over the button
		driver.findElement(By.tagName("button")).click();
		// get all windows id
		Set<String> windIdsSet = driver.getWindowHandles();
		// convert to list
		List<String> windIdsList = new ArrayList<String>(windIdsSet);
		// switch to the child window
		driver.switchTo().window(windIdsList.get(1));
		//print title of the child page
		System.out.println("Child title is " + driver.getTitle());
		// switch to parent p
		driver.switchTo().window(parentWindowId);
		System.out.println("Parent title is " + driver.getTitle());
		// maximizing window
		driver.manage().window().maximize();
		
		
		
	}
	
}
