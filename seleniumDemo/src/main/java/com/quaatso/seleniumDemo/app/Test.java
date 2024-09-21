package com.quaatso.seleniumDemo.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test {
    public static void main(String[] args) {
        // Open Google in Chrome Browser        
    	WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");
    }
}
