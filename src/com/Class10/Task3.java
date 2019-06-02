package com.Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class Task3 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		/**
		 * TC 2: Verify element is clickable1.Open chrome browser2.Go to
		 * “https://the-internet.herokuapp.com/”3.Click on “Click on the “Dynamic
		 * Controls” link4.Select checkbox and click Remove5.Click on Add button and
		 * verify “It's back!” text is displayed6.Close the browser
		 */
		
		String browser="chrome";
		String url="https://the-internet.herokuapp.com/";
		setUpDriver(browser, url);
		
		String text="Dynamic Controls";
		driver.findElement(By.linkText(text)).click();
		
		String buttoXpath="//button[text()='Enable']";
		driver.findElement(By.xpath(buttoXpath)).click();
		
		//1 way
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
		
		String textToEnter="Hello";
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(textToEnter);
		
		String returnedText=driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
		
		if (returnedText.equals(textToEnter)) {
			System.out.println("Text is entered");
		} else {
			System.out.println("Text "+textToEnter+" is Not entered");
		}
		
		
		//2way
				//identify the element and then pass it to the exp conditions
				WebElement el=driver.findElement(By.xpath("//input[@type='text']"));
				
				WebDriverWait wait1=new WebDriverWait(driver, 30);
				wait1.until(ExpectedConditions.elementToBeClickable(el));
				
				String textToEnter1=" Hi";
				el.sendKeys(textToEnter1);
				
				String value=el.getAttribute("value");
				System.out.println(value);
				
				Thread.sleep(5000);
				driver.quit();
	
		
	}
}
