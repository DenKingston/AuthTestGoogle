package com.mail.google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Sample page
 */
public class HomePage extends Page {

    @FindBy(xpath = "//a[contains(@title, 'Аккаунт Google')]")
    private WebElement profileIcon;
    @FindBy(xpath = "//a[contains(@href, 'Logout')]")
    private WebElement exitButton;


    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickProfileIcon() {
        profileIcon.click();
    }

    public WebElement getExitButton() {
        return exitButton;
    }

}
