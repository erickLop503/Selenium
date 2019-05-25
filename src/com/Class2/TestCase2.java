package com.Class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ericklopez/Documents/JARfiles/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://www.syntaxtechs.com");
		Thread.sleep(1000);
		driver.navigate().to("http://www.google.com");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().refresh();
		String title=driver.getTitle();
		
		if(title.contains("Syntax")) {
			System.out.println("This is the right url");
		} else {
			System.out.println("Sorry, this not the right url");
		}
		
		driver.close();
	}
}
