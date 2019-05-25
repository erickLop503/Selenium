package com.Class7;

import utils.CommonMethods;

public class WindowsHandles extends CommonMethods {

	public static void main(String[] args) {

		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
		String parent = driver.getTitle();
		String parentId = driver.getWindowHandle();
		System.out.println("title: " + parent + " " + " ID: " + parentId);

	}
}
