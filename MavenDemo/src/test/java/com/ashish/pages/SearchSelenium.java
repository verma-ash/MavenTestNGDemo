package com.ashish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchSelenium {
	
	@FindBy(name = "q") WebElement searchBox;
	@FindBy(name = "btnK") WebElement searchButton;
	
	public void search(WebDriver driver,String textToFind) {
		
		searchBox.sendKeys(textToFind);
		searchButton.click();
		
	}

}
