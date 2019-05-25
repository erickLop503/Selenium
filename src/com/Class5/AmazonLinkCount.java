package com.Class5;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinkCount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/ericklopez/Documents/JARfiles/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.amazon.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int count = 0;
		
		Iterator<WebElement> linkIt = links.iterator();
		while (linkIt.hasNext()) {
			String linkText = linkIt.next().getText();
			
			if (!linkText.isEmpty()) {
				System.out.println(linkText);
				count++;
			}
		}
		System.out.println("The numbers of links with text "+count);
		driver.quit();
	}

}
