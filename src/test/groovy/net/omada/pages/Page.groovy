package net.omada.pages

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

abstract class Page {

    private static final int DEFAULT_TIMEOUT = 20
    protected WebDriver webDriver

    Page(WebDriver webDriver) {
        this.webDriver = webDriver
    }

    protected final void click(By locator) {
        waitForElementClickable(locator)
        webDriver.findElement(locator).click()
    }

    protected final WebElement getElement(By locator) {
        waitForElementPresent(locator)
        webDriver.findElement(locator)
    }

    protected final void waitForElementClickable(By locator) {
        new WebDriverWait(webDriver, DEFAULT_TIMEOUT).until(ExpectedConditions.elementToBeClickable(locator))
    }

    protected final void waitForElementPresent(By locator) {
        new WebDriverWait(webDriver, DEFAULT_TIMEOUT).until(ExpectedConditions.presenceOfElementLocated(locator))
    }

    protected final By byLinkInSectionXpath(String sectionTitle) {
        By.xpath("//section[h1='${sectionTitle}']/a")
    }
}
