package net.omada.config.browser.remote

import org.openqa.selenium.Capabilities
import org.openqa.selenium.chrome.ChromeOptions

class ChromeCapabilities {

    static Capabilities getCapabilities() {
        ChromeOptions options = new ChromeOptions()
        options.addArguments("--start-maximized")
    }
}
