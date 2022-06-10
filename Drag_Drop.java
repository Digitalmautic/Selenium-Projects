package com.practice.SeleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		
		driver.findElement(By.xpath("//a[@xpath = \"1\"]")).click();
		driver.findElement(By.tagName("iframe")).click();
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		

	}

}
