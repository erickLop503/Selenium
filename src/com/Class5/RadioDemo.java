package com.Class5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/ericklopez/Documents/JARfiles/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		WebElement maleRadio = driver.findElement(By.id("sex-0"));
		System.out.println(maleRadio.isDisplayed());// true
		System.out.println(maleRadio.isEnabled());// true
		System.out.println(maleRadio.isSelected());// false
		// 1 way of clicking on the element
		maleRadio.click();
		System.out.println(maleRadio.isSelected());// true
		Thread.sleep(2000);

		// 2 way- prefered way
		String valueToSelect = "Automation Tester";

		List<WebElement> profesionList = driver.findElements(By.name("profession"));
		System.out.println(profesionList.size());

		for (WebElement profession : profesionList) {

			if (profession.isEnabled()) {
				String value = profession.getAttribute("value");
				System.out.println(value);

				if (value.equals(valueToSelect)) {
					profession.click();
				}
			}
		}
		Thread.sleep(3000);
		//driver.quit();
	}

}