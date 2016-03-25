package com.mail.google;

import com.mail.google.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginPageTest {
    @Test
    public void verifyLogin() {
        WebDriver webDriver = new FirefoxDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/&hl=ru#identifier");
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.typeUsername("denykingston@gmail.com");
        loginPage.clickNextButton();
        loginPage.typePassword("p0lumorphp0lumorph");
        loginPage.clickSignInButton();
}
}
