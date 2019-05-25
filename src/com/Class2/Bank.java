package com.Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bank {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/ericklopez/Documents/JARfiles/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		
		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Erick");
		driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Dominguez");
		driver.findElement(By.xpath("//input[@id='customer.address.street")).sendKeys("9854 Fairfax sq Apt. 218");
		
	}

}
