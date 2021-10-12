package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class SearchBox extends Base{
	
	//pagefactory
		@FindBy(xpath = "//span[@id='4']")
		WebElement searchBar;
		
		public SearchBox() {
			PageFactory.initElements(driver, this);
		}
		
		public void search() {
			searchBar.click();
		}
		
		public void search(String search) {
			
			Actions action = new Actions(driver);
			action.moveToElement(searchBar).sendKeys(search).sendKeys(Keys.ENTER);
						
		}

}
