package com.qa.cucpara;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
	
	@FindBy(id = "sb_form_q")
	private WebElement searching;
	
	public void searchElement(String arg1) {
		searching.sendKeys(arg1);
		searching.submit();
	}

}
