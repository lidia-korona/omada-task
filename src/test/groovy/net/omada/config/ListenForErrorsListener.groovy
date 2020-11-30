package net.omada.config

import net.omada.config.browser.remote.WebDriverContainerFactory
import org.spockframework.runtime.AbstractRunListener
import org.spockframework.runtime.model.ErrorInfo
import org.testcontainers.containers.BrowserWebDriverContainer
import org.testcontainers.lifecycle.TestDescription

class ListenForErrorsListener extends AbstractRunListener {

    private BrowserWebDriverContainer container

    @Override
    void error(ErrorInfo error) {
        container = WebDriverContainerFactory.getWebDriverContainer()
        container.afterTest(getDescription(error), Optional.empty())
    }

    private TestDescription getDescription(ErrorInfo error) {
        new TestDescription() {
            String getTestId() {
                error.method.name
            }
            String getFilesystemFriendlyName() {
                "${error.method.parent.filename}-${error.method.name}"
            }
        }
    }
}
