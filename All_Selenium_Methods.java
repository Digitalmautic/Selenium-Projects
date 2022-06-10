package com.practice.SeleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class All_Selenium_Methods {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
// #1) get(): Open a URL in the current browser.
        driver.get("https://www.javatpoint.com/");


        System.out.println("Title of the webpage: " + driver.getTitle());
       // System.out.println("Source code of the webpage: " + driver.getText());
        
// #2) getCurrentUrl(): gets the current URL in the string format.        
        System.out.println("Current URL of the webpage: " + driver.getCurrentUrl());
        
        
// #3) findElement(By, by) and click():  to Click on any element of the webpage.       
        driver.findElement (By.name("java-tutorial")).click();
	}

}
