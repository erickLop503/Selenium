package com.Class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ericklopez/Documents/JARfiles/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		
		if (title.equalsIgnoreCase("google")) {
			System.out.println("This is the the right title");
		} else {
			System.out.println("Sorry this is not the riht title");
		}
		
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		String title2=driver.getTitle();
		
		if (title2.equalsIgnoreCase("facebook - Log In or Sign Up")) {
			System.out.println("This is the the right title");
		} else {
			System.out.println("Sorry this is not the riht title");
		}
		
	}
}
