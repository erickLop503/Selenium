package com.Class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Task1 extends CommonMethods {

	/*
	 * // Navigate to https://www.toolsqa.com // Hover over the Tutorial menu //
	 * Click on Software Testing Tutorial // Close the browser
	 */
	
	public static void main(String[] args) throws InterruptedException {

		setUpDriver("chrome", "https://www.toolsqa.com");

		WebElement tutorial=driver.findElement(By.xpath("//span[text()='Tutorial']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(tutorial).click().perform();
		driver.findElement(By.xpath("//span[text()='Software Testing Tutorial']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
