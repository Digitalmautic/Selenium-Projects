package com.practice.SeleniumProjects;

import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Move_To {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Actions act = new Actions(driver);
		
		WebElement Username = driver.findElement(By.id("email"));
		WebElement Password = driver.findElement(By.id("pass"));
		WebElement Login = driver.findElement(By.name("login"));
		
		int x = log.getLocation().getX();                          // NOT DONE
		int y = log.getLocation().getY();
		
		Username.click();
		act.moveToElement(Username).sendKeys("rosanmohanty07@gmail.com").build().perform();
		act.moveToElement(Password).sendKeys("RosanFacebook@5678").build().perform();
		act.moveByOffset(x, y).click().build().perform();
		
		
	}

}
