package com.mail.google;

import com.mail.google.pages.LoginPage;
import com.mail.google.util.PageAction;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
    }
    @Test
    public void verifyLogin() {
        pageAction.getUrlTestPage("https://accounts.google.com");
        loginPage.typeUsername("denykingston@gmail.com");
        loginPage.clickNextButton();
        loginPage.typePassword("p0lumorphp0lumorph");
        loginPage.clickSignInButton();
 //       Assert.assertEquals(webDriver.);

    }
    @AfterTest
    public void afterTest() {
    }
}
