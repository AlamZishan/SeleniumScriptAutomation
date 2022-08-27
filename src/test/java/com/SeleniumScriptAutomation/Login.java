package com.SeleniumScriptAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

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
		
		driver.findElement(By.xpath("//*[@id=\"scroll\"]/div/div/div/div/div[2]/form/div[7]/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("alamzishan709@gmail.com");
		driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("Qwerty321@");
		driver.findElement(By.xpath("//input[@value='LOG IN']")).click();
	}

}
