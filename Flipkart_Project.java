package com.practice.SeleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Project {

	public static void main(String[] args) throws InterruptedException {
		
		// Flipkart ============================================================================
		
		
		
		  System.setProperty("webdriver.chrome.driver",
		  "C:\\Users\\INTEL\\Pictures\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.flipkart.com/");
		  
		  
		  driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("7008216679");
		  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rosan@1992");
		  
		  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		                                // HOW TO SEARCH AN ITEM THEN PROCESS TO CHECKOUT?
		  
		  //driver.findElement(By.xpath("//div[contains(text(),'My Account')]"))
		  
		  driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"))
		  .sendKeys("mobiles");
		  
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  Thread.sleep(2000);
		  
		  
		  
		  
	
		
		 
		  
			/*
			 * By search = By.name("iphone 13"); By ram =
			 * By.xpath("//div[@title='1GB and Below']//div[@class='_24_Dny']"); By image =
			 * By.xpath("//img[@alt='APPLE iPhone 13 (Blue, 128 GB)']");
			 * 
			 * //private static void search() {
			 * 
			 * driver.findElement(search).sendKeys("iphone 13");
			 * driver.findElement(search).sendKeys(Keys.ENTER);
			 * 
			 * driver.findElement(ram).click(); driver.findElement(image).click();
			 */		 
		

	}

}
