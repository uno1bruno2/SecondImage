package com.qa.ftse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
	
	@FindBy(className = "stockTable")
	WebElement webelerise;
	
	@FindBy(className = "table-overflow-wrapper")
	WebElement webelefall;
	
	public String maxRiser() {
		WebElement webeleBody = webelerise.findElement(By.tagName("tbody"));
		List<WebElement> webeleList = webeleBody.findElements(By.tagName("tr"));
		WebElement webeleFirst = webeleList.get(0);
		List<WebElement> webeleRowData = webeleFirst.findElements(By.tagName("td"));
		WebElement webeleInnerData = webeleRowData.get(1);
		WebElement webeleTHEDATA = webeleInnerData.findElement(By.tagName("a"));
		return webeleTHEDATA.getText();
	}
	
	public String maxFaller() {

		WebElement webeleBody = webelefall.findElement(By.tagName("tbody"));
		List<WebElement> webeleList = webeleBody.findElements(By.tagName("tr"));
		WebElement webeleFirst = webeleList.get(0);
		List<WebElement> webeleRowData = webeleFirst.findElements(By.tagName("td"));
		WebElement webeleInnerData = webeleRowData.get(1);
		WebElement webeleTHEDATA = webeleInnerData.findElement(By.tagName("a"));
		return webeleTHEDATA.getText();
	}

}
