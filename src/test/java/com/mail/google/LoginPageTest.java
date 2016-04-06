package com.mail.google;

import com.mail.google.pages.HomePage;
import com.mail.google.pages.LoginPage;
import com.mail.google.util.PageAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginPageTest {
    private WebDriver webDriver = new FirefoxDriver();
    private PageAction pageAction = new PageAction(webDriver);
    private LoginPage loginPage = new LoginPage(webDriver);
    private HomePage homePage = new HomePage(webDriver);
    @BeforeTest
    public void beforeTest(){
        pageAction.startBrowser();
        pageAction.getUrlTestPage("https://accounts.google.com");
    }
    @Test
    public void verifyLogin() {
        loginPage.typeUsername("denykingston@gmail.com").clickNextButton();
        loginPage.typePassword("p0lumorphp0lumorph").clickSignInButton();
        homePage.checkExitButton();
    }
    @AfterTest
    public void afterTest() {
        pageAction.closeBrowser();
    }

}
