package net.omada.pages.en.solutions.overview

import net.omada.pages.en.PageWithNavigationBar
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

class SolutionOverviewPage extends PageWithNavigationBar {

    private static final String CLOUD_SECTION_BUTTON = "Identity Management as-a-Service"
    private static final String CLOSE_COOKIE_BUTTON = "//div[@id='brick-43']//span"

    SolutionOverviewPage(WebDriver webDriver) {
        super(webDriver)
    }

    void learnAboutCloud() {
        closeCookieBar()
        click(byLinkInSectionXpath(CLOUD_SECTION_BUTTON))
    }

    private void closeCookieBar() {
        click(By.xpath(CLOSE_COOKIE_BUTTON))
    }
}
