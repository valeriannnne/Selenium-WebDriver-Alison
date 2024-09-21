package com.quaatso.seleniumDemo.app;

import java.io.File;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	@SuppressWarnings("deprecation")
	public static WebDriver getBrowser(String browser) {
		WebDriver driver = null;
		//Open Browser
		if(browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if (browser.equalsIgnoreCase("firefox")) {
//			String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "geckodriver.exe";
//			System.setProperty("webdriver.gecko.driver",path);
			driver = new FirefoxDriver();
		}			
		if(browser.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();		
		else 
			System.out.println("Browser not supported " + browser);
		
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
}
