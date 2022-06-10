package com.practice.SeleniumProjects;

import java.sql.Driver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.DriverSessions;

import graphql.PublicApi;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Various_Ways_To_Lunch_Drivers {

	public static void main(String[] args) {
		
		//=========================== LUNCH DRIVERS MANUALLY=======================================
		
// Chrome Browser	
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\INTEL\\Pictures\\chromedriver_win32\\chromedriver.exe");
		 * 
		 * ChromeDriver driver = new ChromeDriver(); // We can also write this:
		 * WebDriver driver = new ChromeDriver();
		 */		 

// FIREFOX BROWSER	============================================================	
		  
		/*System.setProperty("webdriver.gecko.driver",
				  "C:\\Users\\Public\\Desktop\\geckodriver.exe");      // NOT DONE
				  
		WebDriver driver = new FirefoxDriver(); // We can also write this:  WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");*/
		
		
// ENTERNET EXPLOREER BROWSER ==================================================			
		/*
		 * System.setProperty("webdriver.edge.driver",
		 * "C:\\Users\\INTEL\\Downloads\\edgedriver_win64\\msedgedriver.exe");      // NOT DONE
		 * 
		 * WebDriver driver = new EdgeDriver(); // We can also write this: WebDriver
		 * driver = new ChromeDriver(); driver.get("https://www.facebook.com/");
		 */
		
		
		//=========================== LUNCH DRIVERS AUTOMATICALLY=======================================
		
	/*	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/")*/
		
		/*WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/"); 
		
		System.out.println("Title of the webpage: " + driver.getTitle());
		System.out.println("Source code of the webpage: " + driver.getText());
		System.out.println("Current URL of the webpage: " + driver.getCurrentUrl());*/
		
		

		 	
		
		
	}

}