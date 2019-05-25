package com.Class5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeWork1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/ericklopez/Documents/JARfiles/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.facebook.com/");

		WebElement monthsDD = driver.findElement(By.id("month"));

		Select obj = new Select(monthsDD);
		List<WebElement> allOptions = obj.getOptions();
		System.out.println(allOptions.size());
		

		WebElement daysDD = driver.findElement(By.id("day"));

		Select obj1 = new Select(daysDD);
		List<WebElement> allOptions1 = obj1.getOptions();
		System.out.println(allOptions1.size());

		WebElement yearsDD = driver.findElement(By.id("year"));

		Select obj2 = new Select(yearsDD);
		List<WebElement> allOptions2 = obj2.getOptions();
		System.out.println(allOptions2.size());
		
		Select obj3 = new Select(monthsDD);
		Thread.sleep(2000);
		obj3.selectByIndex(12);
		Select obj4 = new Select(daysDD);
		Thread.sleep(2000);
		obj4.selectByIndex(6);
		Select obj5 = new Select(yearsDD);
		Thread.sleep(2000);
		obj5.selectByIndex(34);

		driver.quit();

	}
}
