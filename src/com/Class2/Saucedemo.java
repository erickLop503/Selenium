package com.Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saucedemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/ericklopez/Documents/JARfiles/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com");
		
		driver.findElement(By.xpath("//input[@data-test='username']")).sendKeys("problem_user");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='btn_action']")).click();
		driver.close();
		
	}
}
