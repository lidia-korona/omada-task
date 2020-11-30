package net.omada.pages.en

import org.openqa.selenium.WebDriver

abstract class PageWithNavigationBar extends PageWithTopBar {

    PageWithNavigationBar(WebDriver webDriver) {
        super(webDriver)
    }
}
