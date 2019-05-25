package com.Class5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	/*
	 * Check all Years of Experience radio buttons are clickable
	 * ----------------------------------------------- Check all Automation Tools
	 * checkboxes are clickable and keep “Selenium WebDriver” option as selected
	 */
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/ericklopez/Documents/JARfiles/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		List<WebElement> listExp=driver.findElements(By.name("exp"));
		
		for(WebElement radio:listExp) {
			
			if(radio.isEnabled()) {
				radio.click();
				Thread.sleep(2000);
				
			}
		}
		
		driver.quit();
	}

}
