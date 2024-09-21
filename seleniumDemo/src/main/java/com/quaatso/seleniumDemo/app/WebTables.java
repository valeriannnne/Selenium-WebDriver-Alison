package com.quaatso.seleniumDemo.app;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTables {
	
	public void getSingleElementFromWebTable (String browser){
		WebDriver driver = Browser.getBrowser(browser);
		// open web page
		driver.get("https://www.timeanddate.com/worldclock/");
		// get id element
		String elementText = driver.findElement(By.id("p86")).getText();
		// print
		System.out.println("text from web table: " + elementText);		
	}
	
	public void getAllElementsFromWebTable (String browser){
		WebDriver driver = Browser.getBrowser(browser);
		// open web page
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_table_intro");
		// switch to iframe
		driver.switchTo().frame("iframeResult");
		// get table elements	
		WebElement table = driver.findElement(By.tagName("table"));
		// raw elements
		List<WebElement> rowList = table.findElements(By.tagName("tr"));
		// retrieve data each row
		for(WebElement row:rowList) {
			// get all data elements
			List<WebElement> dataList = row.findElements(By.tagName("td"));
			// print all data
			for(WebElement data:dataList) {
				System.out.print(data.getText() + "\t");
			}	
			System.out.println();
		}
	}

}
