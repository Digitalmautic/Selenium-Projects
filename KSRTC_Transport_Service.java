package com.practice.SeleniumProjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KSRTC_Transport_Service {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
		
		Thread.sleep(2000);                                  // Needs time to show pop-up.
		
		String txt = driver.switchTo().alert().getText();
		
		System.out.println(txt);                              // Go to the popup & print hat text BUT NOT SHOWING.
		
		if(txt.contentEquals("Please select start place.")) { // Equals Method      
		
		driver.switchTo().alert().accept();                   // Method to accept the pop-up.
		System.out.println("Correct Alert Appeared...");}
		
		else 
			System.out.println("Invalid Alert...");
		driver.close();                                         // Method to close the driver.
		}		 
}
