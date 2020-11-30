package net.omada.config.browser.remote

import org.testcontainers.containers.BrowserWebDriverContainer

class ChromeContainerFactory {

    static BrowserWebDriverContainer create() {
        def directory = new File("./build/spock-reports")
        directory.mkdirs()

        def chromeWebDriverContainer = new BrowserWebDriverContainer()
                .withCapabilities(ChromeCapabilities.capabilities)
                .withRecordingMode(BrowserWebDriverContainer.VncRecordingMode.RECORD_ALL, directory)
        chromeWebDriverContainer.start()
        chromeWebDriverContainer
    }
}
