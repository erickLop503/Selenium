package com.Class7;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class Task1 extends CommonMethods{

	public static void main(String[] args) {
		/*
		 * TC 1: ToolsQA Frame verification Open chrome browser Go to
		 * “https://www.toolsqa.com/iframe-practice-page/” Click on “Blogs” link inside
		 * first frame Verify element “Interactions” is present in second frame Navigate
		 * to Home Page Quit browser
		 */
		
		CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/iframe-practice-page/");
		driver.findElement(By.name("Blogs")).click();
		
	}
}
