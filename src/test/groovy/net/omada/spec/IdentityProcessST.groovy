package net.omada.spec

import net.omada.config.browser.remote.WebDriverContainerFactory
import net.omada.pages.en.more.recources.IdentityProcessBookPage
import net.omada.pages.en.solutions.core.CoreFunctionalityPage
import org.openqa.selenium.WebDriver
import spock.lang.Title

@Title('As a potential customer I want to learn about best practice for IGA process')
class IdentityProcessST extends E2ESpecification {

    private WebDriver webDriver
    private CoreFunctionalityPage coreFunctionalityPage
    private IdentityProcessBookPage identityProcessBookPage

    def setup() {
        webDriver = WebDriverContainerFactory.getWebDriverContainer().getWebDriver()
        coreFunctionalityPage = new CoreFunctionalityPage(webDriver)
        identityProcessBookPage = new IdentityProcessBookPage(webDriver)
    }

    def cleanup() {
        webDriver.quit()
    }

    def 'I can download book with IGA process framework guide'() {
        expect: 'I explore information about core functionality'
            coreFunctionalityPage.open(env.appUrl)

        and: 'I choose to download e-book'
            coreFunctionalityPage.downloadIdentityProcessBook()

        and: 'I fill in my contact details'
            identityProcessBookPage.fillTheForm()
    }

}
