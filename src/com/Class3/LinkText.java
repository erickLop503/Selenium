package com.Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/ericklopez/Documents/JARfiles/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Jonny");
		driver.findElement(By.name("lastName")).sendKeys("King");
		driver.findElement(By.name("phone")).sendKeys("7238907839");
		driver.findElement(By.id("userName")).sendKeys("king45@yahoo.com");
		driver.findElement(By.name("address1")).sendKeys("9876 king hills");
		driver.findElement(By.name("city")).sendKeys("Arington");
		driver.findElement(By.name("state")).sendKeys("VA");
		driver.findElement(By.name("postalCode")).sendKeys("22206");
		// driver.findElement(By.name("country")).click();
		driver.findElement(By.id("email")).sendKeys("test123");
		driver.findElement(By.name("password")).sendKeys("9876");
		driver.findElement(By.name("confirmPassword")).sendKeys("9876");
		driver.findElement(By.name("register")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
