package com.practice.SeleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail_Send_An_Email_Logout {

	public static void main(String[] args) {


		// Open Gmail
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
				driver.get("https://accounts.google.com/servicelogin");
				
				driver.findElement(By.id("identifierId")).sendKeys("rosanmohanty07@gmail.com");
				driver.findElement(By.className("Next")).click();
				driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("Rosan@7008");
				driver.findElement(By.name("VfPpkd-vQzf8d")).click();

	}
}
