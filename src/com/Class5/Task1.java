package com.Class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		
		String userName="standard_user";
		String password="secret_sauce";
		
		System.setProperty("webdriver.chrome.driver", "/Users/ericklopez/Documents/JARfiles/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.cssSelector("input[id=user-name]")).sendKeys(userName);
		driver.findElement(By.cssSelector("input[id=password]")).sendKeys(password);
		driver.findElement(By.cssSelector("input[type=submit]")).click();
	    boolean robot=driver.findElement(By.cssSelector("div.peek")).isDisplayed();
		
	    if(robot) {
	    	System.out.println("Robot is displayed");
	    } else {
	    	System.out.println("Robot is Not displayed");
	    }
	    
	    //
	   WebElement product= driver.findElement(By.cssSelector("div.product_label"));
	   boolean displaydProduct=product.isDisplayed();
	   String productText=product.getText();
	   
	   String expectedText="Products";
	   if(displaydProduct && productText.equals(expectedText)) {
		   System.out.println("Element is displayed"+expectedText);
	   } else {
		   System.out.println("Element is NOT displayed"+expectedText);
	   }
	   
	   driver.quit();
	}
}
