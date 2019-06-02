package com.Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class TaskTwo extends CommonMethods{

	public static void main(String[] args) {
//		TC 1: Table headers and rows verification
//		Open chrome browser
//		Go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
//		Login to the application
//		Verify customer “Susan McLaren” is present in the table
//		Click on customer details
//		Update customers last name
//		Verify updated customers name is displayed in table
//		Close browser
		
		String browser="chrome";
		String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
		
		setUpDriver(browser, url);
		//login to the application
				sendText(driver.findElement(By.cssSelector("input[id$='username']")), "Tester");
				sendText(driver.findElement(By.cssSelector("input[id*='password']")), "test");
				driver.findElement(By.cssSelector("input[value='Login']")).click();
				
				WebElement el=driver.findElement(By.xpath("//td[text()='Susan McLaren']"));
				
				if(el.isDisplayed()) {
					System.out.println("Name is displayed");
				} else {
					System.out.println("Name is NOT displayed");
				}

	}

}
