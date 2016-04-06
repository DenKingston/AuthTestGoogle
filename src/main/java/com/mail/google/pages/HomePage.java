package com.mail.google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * Sample page
 */
public class HomePage extends Page {

	private final String H1_TAG = "h1";
	
	@FindBy(how = How.TAG_NAME, using = H1_TAG)
	@CacheLookup
	private WebElement h1Element;
	@FindBy(xpath = ".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")
	private WebElement hideMenu;
	@FindBy(id = "gb_71")
	private WebElement exitButton;



	public HomePage(WebDriver webDriver) {

		super(webDriver);
	}
	
	public String getH1() {
		return h1Element.getText();
	}

	public void checkExitButton() {
		hideMenu.click();
		assertTrue(exitButton.isDisplayed(), "Фейл авторизации");
	}

}
