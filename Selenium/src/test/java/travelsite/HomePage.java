package travelsite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class HomePage {
	

	@FindBy(xpath = "//*[@id=\\\"s2id_autogen8\\\"]/a/span[1]")
	private WebElement searchHotels;
	
	@FindBy(xpath = "//*[@id=\\\"dpd1\\\"]/div/input")
	private WebElement checkin;
	
	public void searchForHotel(String destination, String checkInDate, String checkOutDate, int numOfAdults) {
		searchHotels.sendKeys(destination);
		checkin.sendKeys(checkInDate);
	}	
		
//		searchHotel.sendKeys("London");
	

	}
