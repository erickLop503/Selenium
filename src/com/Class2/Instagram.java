package com.Class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/ericklopez/Documents/JARfiles/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://instagram.com/");
	}
}
