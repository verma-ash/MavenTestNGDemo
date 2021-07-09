package com.ashish.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.ashish.utility.BrowserFactory;

public class OpenPageGoogle {
	
	private WebDriver driver;

	@Test
	public void test1() {
		driver = BrowserFactory.startApp(driver, "Edge", "https://www.google.com");
		System.out.println(driver.getTitle());
		BrowserFactory.closeApp(driver);
	}

}
