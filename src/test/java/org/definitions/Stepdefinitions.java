package org.definitions;

import cucumber.api.java.en.Given;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class Stepdefinitions {
public WebDriver d;
	@Given("The user in FB")
	public void the_user_in_FB() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Practice\\driver\\driver\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://www.facebook.com/");
	}

	@When("The Valid {string} and {string} has been given")
	public void the_Valid_and_has_been_given(String string, String string2) {
		WebElement user = d.findElement(By.id("email"));
		user.sendKeys("hjdsgjsdgf");
		WebElement pass = d.findElement(By.id("pass"));
		pass.sendKeys("fihgkjdfgh");
	}

	@Then("Click the log in button")
	public void click_the_log_in_button() {
	    d.close();
	}
}
