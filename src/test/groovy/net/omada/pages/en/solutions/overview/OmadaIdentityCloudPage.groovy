package net.omada.pages.en.solutions.overview

import net.omada.pages.en.PageWithNavigationBar
import org.openqa.selenium.WebDriver

class OmadaIdentityCloudPage extends PageWithNavigationBar {

    private static final String INTRO_BUTTON = "Omada Identity Cloud"

    OmadaIdentityCloudPage(WebDriver webDriver) {
        super(webDriver)
    }

    void downloadIntro() {
        click(byLinkInSectionXpath(INTRO_BUTTON))
    }
}
