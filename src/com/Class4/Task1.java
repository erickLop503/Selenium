package com.Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {

		/*
		 * TC 1: Mercury Tours Registration: Open chrome browser Go to
		 * “http://newtours.demoaut.com/” Click on Register Link Fill out all required
		 * info Click Submit User successfully registered
		 */
		
		System.setProperty("webdriver.chrome.driver", "/Users/ericklopez/Documents/JARfiles/chromedriver");

		WebDriver driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		driver.findElement(By.cssSelector("input[name^=first]")).sendKeys("Erick");
		driver.findElement(By.cssSelector("input[name*=last]")).sendKeys("Lopez");
		driver.findElement(By.cssSelector("input#email")).sendKeys("test");
		driver.findElement(By.cssSelector("input[name^='pass']")).sendKeys("123");
		driver.findElement(By.cssSelector("input[name$='Password']")).sendKeys("123");
		driver.findElement(By.cssSelector("input[name='register']")).click();
		
		//driver.quit();
	}
}
