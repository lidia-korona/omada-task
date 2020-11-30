package net.omada.pages.en.solutions.core

import net.omada.pages.en.PageWithNavigationBar
import org.openqa.selenium.WebDriver

class CoreFunctionalityPage extends PageWithNavigationBar {

    private static final String DOWNLOAD_BOOK_BUTTON = "Core IGA Functionalities"

    CoreFunctionalityPage(WebDriver webDriver) {
        super(webDriver)
    }

    void open(String appUrl) {
        webDriver.get(appUrl + "/en-us/solutions/core-functionality")
    }

    void downloadIdentityProcessBook() {
        click(byLinkInSectionXpath(DOWNLOAD_BOOK_BUTTON))
    }

}
