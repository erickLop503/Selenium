package com.Class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utils.CommonMethods;

public class Task extends CommonMethods{

	
	
		
//		TC 1: Upload file and Take Screenshot
//
//		Navigate to “http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload”
//		Upload file
//		Verify file got successfully uploaded and take screenshot
		
		
		static String expected="File uploaded!";
		
		public static void main(String[] args) {
			String url="http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload";
			setUpDriver("chrome",url);
	        
			takeScreenshot("WebTool", "Login");
			
			String filePath="/Users/ericklopez/‎⁨iCloud Drive⁩ ▸ ⁨Desktop⁩ ▸ ⁨folderToCreate⁩.jpg";
			driver.findElement(By.cssSelector("input.gwt-FileUpload")).sendKeys(filePath);
			
			takeScreenshot("WebTool", "Upload1");
			
	        driver.findElement(By.cssSelector("button.gwt-Button")).click();
	        
	        String textActual=getAlertText();
	        
	        if (textActual.equals(expected)) {
	        	System.out.println("File is uploaded");
	        }else {
	        	System.out.println("File is NOT uploaded");
	        }
	        
	        acceptAlert();
	        
	        TakesScreenshot ts=(TakesScreenshot)driver;
	        File scr=ts.getScreenshotAs(OutputType.FILE);
	        
	        try {
				FileUtils.copyFile(scr, new File("ScreenShot/WebTool/Upload.png"));
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Unable to take screesnhot");
			}
	        
	        //driver.quit();
	}
}
