package com.qa.modification;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
	
	@FindBy (id = "sb_form_q")
	private WebElement searchbox;
	
	public void searchFor(String searchText) {
		searchbox.sendKeys(searchText);
		searchbox.submit();
	}

}
