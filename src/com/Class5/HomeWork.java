package com.Class5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {

	public static String firstName = "Andy";
	public static String lastName = "Moran";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/ericklopez/Documents/JARfiles/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.findElement(By.name("firstname")).sendKeys(firstName);
		driver.findElement(By.name("lastname")).sendKeys(lastName);
		driver.findElement(By.id("sex-0")).click();
		List<WebElement> buttons = driver.findElements(By.name("exp"));

		for (WebElement button : buttons) {

			if (button.isEnabled()) {
				button.click();
				System.out.println("Buttons are enabled");
				Thread.sleep(2000);
			} else {
				System.out.println("Buttons are NOT enabled");

			}
		}

		driver.findElement(By.cssSelector("input#datepicker")).sendKeys("December 6 - 1986");

		List<WebElement> profession = driver.findElements(By.name("profession"));

		for (WebElement check : profession) {

			if (check.isEnabled()) {
				check.click();
			}
		}
		
		List<WebElement> tools=driver.findElements(By.name("tool"));
		
		for(WebElement tool:tools) {
			
			if(tool.isEnabled()) {
				tool.click();
			}
		}

		Thread.sleep(4000);
		driver.quit();
	}

}
