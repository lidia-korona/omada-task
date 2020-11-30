package net.omada.pages.en

import org.openqa.selenium.WebDriver

class MainPage extends PageWithNavigationBar {

    MainPage(WebDriver webDriver) {
        super(webDriver)
    }

    void open(String appUrl) {
        webDriver.get(appUrl)
    }
}
