package com.mail.google;

import com.mail.google.pages.LoginPage;
import com.mail.google.util.PageAction;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginPageTest {
    private WebDriver webDriver = new FirefoxDriver();
    private PageAction pageAction = new PageAction(webDriver);
    private LoginPage loginPage = new LoginPage(webDriver);

    @BeforeTest
    public void beforeTest(){
        pageAction.startBrowser();
        pageAction.getUrlTestPage("https://accounts.google.com");
    }
    @Test
    public void verifyLogin() {
        loginPage.typeUsername("denykingston@gmail.com").clickNextButton();
        loginPage.typePassword("p0lumorphp0lumorph").clickSignInButton();
        Assert.assertTrue(webDriver.findElement(By.id("gb_71")).isDisplayed());

    }
    @AfterTest
    public void afterTest() {
        pageAction.closeBrowser();
    }
}
