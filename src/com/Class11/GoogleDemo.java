package com.Class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utils.CommonMethods;

public class GoogleDemo extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "http://ebay.com");
		Thread.sleep(2000);
		TakesScreenshot camera=(TakesScreenshot)driver;
		File selfie =camera.getScreenshotAs(OutputType.FILE);
		

		try {
			FileUtils.copyFile(selfie, new File("ScreenShot/Google/GoogePage.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("selfie not taken");
		}
		
		driver.quit();
	}
}
