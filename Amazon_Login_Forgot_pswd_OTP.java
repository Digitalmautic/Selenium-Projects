package com.practice.SeleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Login_Forgot_pswd_OTP {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		// driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		driver.findElement(By.xpath("//div[@id='nav-signin-tooltip']//span[@class='nav-action-inner'][normalize-space()='Sign in']")).click();
		driver.findElement(By.name("email")).sendKeys("rosanmohanty07@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Rosan@5678");
		driver.findElement(By.id("signInSubmit")).click();
		
		// Forgot Password
		/*
		 * driver.switchTo().activeElement().click(); // Switch to forgot password
		 * button link. driver.findElement(By.id("auth-fpp-link-bottom")).click();
		 * driver.findElement(By.id("ap_email")).getCssValue("rosanmohanty07@gmail.com")
		 * ; driver.findElement(By.id("continue")).click();
		 */
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile under 100000");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Samsung']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Over ₹20,000')]")).click();
		
		driver.findElement(By.xpath("//div[contains(@class,'rush-component s-featured-result-item')]"
				+ "//span[@class='a-size-medium a-color-base a-text-normal']"
				+ "[contains(text(),'Samsung Galaxy M53 5G (Mystique Green, 8GB, 128GB ')]")).click();
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-checkout-button-announce']")).click();
		driver.findElement(By.xpath("//div[@ class = 'ship-to-this-address a-button a-button-primary a-button-span12 a-spacing-medium']")).click();


		
		//body/div[contains(@class,'checkout checkout-as checkout-as-desktop')]/div[contains(@class,'a-container')]/div[contains(@class,'clearfix')]/form[1]/div[1]/div[1]/div[2]/span[1]/a[1]
	}

}
