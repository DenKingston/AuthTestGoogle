package com.mail.google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Page{
    @FindBy(id = "Email")
    private WebElement userNameLocator;
    @FindBy(id = "Passwd")
    private WebElement passwordLocator;
    @FindBy(id = "signIn")
    private WebElement signInButtonLocator;
    @FindBy(id = "next")
    private WebElement nextButtonLocator;
public LoginPage(WebDriver pages){
    super(pages);
}

    public LoginPage typeUsername(String usname) {
        userNameLocator.clear();
        userNameLocator.sendKeys(usname);
        return this;
    }

    public LoginPage typePassword(String pswd) {
        passwordLocator.clear();
        passwordLocator.sendKeys(pswd);
        return this;
    }
    public void clickSignInButton() {
        signInButtonLocator.click();
    }
    public void clickNextButton() {
        nextButtonLocator.click();
    }
    public void init(final WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

}
