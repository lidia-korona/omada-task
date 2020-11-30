package net.omada.spec

import net.omada.config.browser.WebDriverFactory
import net.omada.pages.en.MainPage
import net.omada.pages.en.more.company.ContactPage
import net.omada.pages.en.more.recources.DemoPage
import org.openqa.selenium.WebDriver
import spock.lang.Title

@Title('As a potential customer I want to discuss my case with Omada')
class RequestContactST extends E2ESpecification {

    private WebDriver webDriver
    private MainPage mainPage
    private DemoPage demoPage
    private ContactPage contactPage

    def setup() {
        webDriver = WebDriverFactory.getWebDriver()
        mainPage = new MainPage(webDriver)
        demoPage = new DemoPage(webDriver)
        contactPage = new ContactPage(webDriver)
    }

    def cleanup() {
        webDriver.quit()
    }

    def 'I can request a demo'() {
        expect: 'I decide to book an Omada demo'
            mainPage.open(env.getAppUrl())
            mainPage.goToBookADemo()

        and: 'I fill in my contact details'
            demoPage.fillTheForm()
    }

    def 'I can request contact'() {
        expect: 'I choose to contact'
            mainPage.open(env.getAppUrl())
            mainPage.goToContactDetails()

        and: 'I check Omada contact details'
            contactPage.checkContactDetails()

        and: 'I fill in my contact details'
            contactPage.fillTheForm()
    }
}
