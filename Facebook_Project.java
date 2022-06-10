package com.practice.SeleniumProjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Project {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("rosanmohanty07@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("RosanFacebook@5678");
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		driver.switchTo().alert().dismiss();
		//((Object) driver).Actions().sendKeys(Keys.ESCAPE).build().perform();
		// browser.keys("Escape");
		//driver. getWindowHandle();

	}

}
