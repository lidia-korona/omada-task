package net.omada.pages.en

import org.openqa.selenium.WebDriver

abstract class PageWithNavigationBar extends PageWithTopBar {

    private static final String SOLUTIONS_LINK = 'Solutions'

    PageWithNavigationBar(WebDriver webDriver) {
        super(webDriver)
    }

    void goToSolutions() {
        click(byHeaderLinkXpath(SOLUTIONS_LINK))
    }
}
