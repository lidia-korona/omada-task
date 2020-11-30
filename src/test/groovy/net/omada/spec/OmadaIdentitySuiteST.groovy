package net.omada.spec

import net.omada.config.browser.remote.WebDriverContainerFactory
import net.omada.pages.en.MainPage
import net.omada.pages.en.solutions.overview.OmadaIdentityCloudPage
import net.omada.pages.en.solutions.overview.SolutionOverviewPage
import org.openqa.selenium.WebDriver
import spock.lang.Title

@Title('As a potential customer I want to browse around solutions')
class OmadaIdentitySuiteST extends E2ESpecification {

    private WebDriver webDriver
    private MainPage mainPage
    private SolutionOverviewPage solutionOverviewPage
    protected OmadaIdentityCloudPage omadaIdentityCloudPage

    def setup() {
        webDriver = WebDriverContainerFactory.createLatestWebDriverContainer().getWebDriver()
        mainPage = new MainPage(webDriver)
        solutionOverviewPage = new SolutionOverviewPage(webDriver)
        omadaIdentityCloudPage = new OmadaIdentityCloudPage(webDriver)
    }

    def cleanup() {
        webDriver.quit()
    }

    def 'I can learn more about IGA with Cloud solution'() {
        expect: 'I explore information about different solutions'
            mainPage.open(env.appUrl)
            mainPage.goToSolutions()

        and: 'I explore information about Omada Identity Cloud solution'
            solutionOverviewPage.learnAboutCloud()

        and: 'I download cloud solution brochure'
            omadaIdentityCloudPage.downloadIntro()
    }
}
