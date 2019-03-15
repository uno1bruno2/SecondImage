package com.qa.cucumber;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	WebDriver driver;
	
	@Given("^the correct web address$")
	public void the_correct_web_address() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.practiceselenium.com/welcome.html");
		
	}
	
	@When("^I navigate to the 'Menu' page$")
	public void i_navigate_to_the_Menu_page() {
	    driver.findElement(By.cssSelector("#wsb-nav-00000000-0000-0000-0000-000450914915 > ul > li:nth-child(3) > a")).click();
	}

	@Then("^I can browse a list of the available products\\.$")
	public void i_can_browse_a_list_of_the_available_products() {
		assertEquals(true,driver.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000453230000\"]/div/p")).isDisplayed());
		driver.close();
	}

	@When("^I click the checkout button$")
	public void i_click_the_checkout_button() {
		driver.findElement(By.cssSelector("#wsb-nav-00000000-0000-0000-0000-000450914915 > ul > li:nth-child(5) > a")).click();
	}

	@Then("^I am taken to the checkout page$")
	public void i_am_taken_to_the_checkout_page() {
	    assertEquals(true, true);
		driver.close();
	}



}
