package com.mail.google;

import com.mail.google.pages.HomePage;
import com.mail.google.pages.LoginPage;
import com.mail.google.util.DateStorage;
import com.mail.google.util.PageAction;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class LoginPageTest extends TestBase {
    protected PageAction pageAction;
    protected LoginPage loginPage;
    protected HomePage homePage;

    @BeforeTest
    @Override
    public void init() {
        super.init();
        pageAction = PageFactory.initElements(driver, PageAction.class);
        pageAction.startBrowser();
        pageAction.getUrlTestPage(baseUrl);
    }

    @Test
    public void verifyLogin() {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.typeUsername(DateStorage.LOGIN).clickNextButton();
        loginPage.typePassword(DateStorage.PASSWORD).clickSignInButton();
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickProfileIcon();
        assertTrue(homePage.getExitButton().isDisplayed(), "Фейл авторизации");
    }

    @AfterTest
    @Override
    public void tearDown() {
        pageAction.closeBrowser();
        super.tearDown();
    }

}
