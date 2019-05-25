package com.Class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaseCase {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/ericklopez/Documents/JARfiles/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		String title=driver.getTitle();

		if(title.equalsIgnoreCase("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
			System.out.println("This is the rigth title");
		} else {
			System.out.println("This is not the right title");
		}
		
	}

}
