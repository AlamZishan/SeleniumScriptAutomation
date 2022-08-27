package com.SeleniumScriptAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","E:\\software\\selenium\\chromedriver.exe" );
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://tide.com/en-us");
		driver.findElement(By.xpath("//span[@class='login-register']")).click();
		driver.findElement(By.xpath("//a[@class='event_internal_link']")).click();
		
		String ParentWindowHandle = driver.getWindowHandle();
		Thread.sleep(3000);
		for(String childTab:driver.getWindowHandles()) {
			
			driver.switchTo().window(childTab);
		}
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Zishan");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("alamzishan709@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Qwerty123@");
		
		driver.findElement(By.xpath("//input[@value=\"CREATE ACCOUNT\"]")).click();
		
		
	}

}
