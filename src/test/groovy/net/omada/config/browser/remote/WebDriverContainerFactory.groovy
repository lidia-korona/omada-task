package net.omada.config.browser.remote

import org.openqa.selenium.firefox.FirefoxOptions
import org.testcontainers.containers.BrowserWebDriverContainer

class WebDriverContainerFactory {

    static BrowserWebDriverContainer createLatestWebDriverContainer() {
        def capabilities
        switch (System.properties['omada.browser']) {
            case 'chrome' :
                capabilities = ChromeCapabilities.capabilities
                break
            case 'firefox' :
                capabilities = new FirefoxOptions()
                break
            default:
                capabilities = ChromeCapabilities.capabilities
                break
        }

        def directory = new File("./build/spock-reports")
        directory.mkdirs()

        def chromeWebDriverContainer = new BrowserWebDriverContainer()
                .withCapabilities(capabilities)
                .withRecordingMode(BrowserWebDriverContainer.VncRecordingMode.RECORD_ALL, directory)
        chromeWebDriverContainer.start()
        chromeWebDriverContainer
    }

}
