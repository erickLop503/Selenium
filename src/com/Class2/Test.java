package com.Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/ericklopez/Documents/JARfiles/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@class='button']")).click();
	
		String title=driver.getTitle();
		
		if(title.equalsIgnoreCase("Orange hrm")) {
			System.out.println("Right");
		} else {
			System.out.println("No the right one");
		}
	
	
	
	
	
	}

}
