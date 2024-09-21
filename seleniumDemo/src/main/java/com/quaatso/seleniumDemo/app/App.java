package com.quaatso.seleniumDemo.app;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

	public static void main (String[] args) {
		/*
		 * 1. Ask for the browser
		 * 2. Validate user input
		 * 3. Run example
		 * */
		
		/* For finding Elements */
		//ElementFinding examples = new ElementFinding();
		
		/* For IFrame */
		//WebElementPart1 examples = new WebElementPart1();
		//WebElementPart2 examples = new WebElementPart2();
		
		/* For WebTables */
		//WebTables examples = new WebTables();
		
		/* For Waits */
		//WebDriverWaits examples = new WebDriverWaits();
		
		/* For JavaScript */
		JavascriptExamples examples =  new JavascriptExamples();
		
		
		System.out.println("Please enter a browser of your choice \n 1. Chrome \n 2. Firefox \n 2. Edge \n");
        System.out.println("Answer: ");
        // Get User Input
        Scanner scanner = new Scanner(System.in);
        String browser = scanner.next();
        
        if(browser.equalsIgnoreCase("firefox") || browser.equalsIgnoreCase("chrome") || browser.equalsIgnoreCase("edge")) {
        	/* WebElementPart1 */
//        	examples.findElementByName(browser);
//        	examples.findElementById(browser);
//        	examples.findElementByLinkText(browser);
//        	examples.findElementByPartialLinkText(browser);
//        	examples.findElementByXPath(browser);
//        	examples.findElementByCSS(browser);
//        	examples.handleIframe(browser);
//        	examples.handleCheckbox(browser);
//        	examples.handleRadioButton(browser);
//        	examples.handleAlert(browser);
//        	examples.handleDropdown(browser);
        	/* WebElementPart2 */
//        	examples.openWebPageUsingNavigation(browser);
//        	examples.handleBackwardNavigation(browser);
//        	examples.handleForwardNavigation(browser);
//        	examples.handleBackForwardNavigation(browser);
//        	examples.handlePageRefresh(browser);
//        	examples.handleMultipleWindows(browser);
        	/* WebTables */
//        	examples.getSingleElementFromWebTable(browser);
//        	examples.getAllElementsFromWebTable(browser);
        	/* Waits */
//        	examples.fluentWait(browser);
//        	examples.webDriverWait(browser);
        	/* JavaScript */
//        	examples.invokeAlert(browser);
//        	examples.sendTextToAnElement(browser);
//        	examples.refreshBrowser(browser);
//        	examples.getTitleOfWebPage(browser);
        	examples.verticalScroll(browser);
        	
        	
        	
        } else
        	System.out.println("Browser " + browser + " is not supported");

	}
}
