package com.mail.google.util;

import com.mail.google.pages.Page;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class PageAction extends Page {
    public void startBrowser () {
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }

    public PageAction getUrlTestPage(String url) {
        webDriver.get(url);
        return this;
    }
    public void closeBrowser(){
        if (webDriver != null) {
            webDriver.quit();
        }
    }

    public PageAction(WebDriver webDriver) {
        super(webDriver);
    }


}
