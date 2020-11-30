package net.omada.config.browser.local

import net.omada.config.browser.remote.ChromeCapabilities
import org.openqa.selenium.chrome.ChromeDriver

class ChromeLocalFactory {

    private static final String CHROME_PROPERTY = "webdriver.chrome.driver"
    private static final String CHROME_DRIVER_FILE_PATH = "src/test/resources/chromedriver_linux64"

    static ChromeDriver getWebDriver() {
        System.setProperty(CHROME_PROPERTY, CHROME_DRIVER_FILE_PATH)
        new ChromeDriver(ChromeCapabilities.capabilities)
    }
}
