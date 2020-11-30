package net.omada.config.browser

import net.omada.config.browser.local.ChromeLocalFactory
import net.omada.config.browser.remote.ChromeContainerFactory
import org.openqa.selenium.WebDriver

class WebDriverFactory {

    static WebDriver getWebDriver() {
        switch (System.properties['omada.browser']) {
            case 'chromeR' : return ChromeContainerFactory.create().getWebDriver()
            case 'chrome' : return ChromeLocalFactory.getWebDriver()
            //case 'firefox' : return ;
            default: ChromeLocalFactory.getWebDriver()
        }
    }

}
