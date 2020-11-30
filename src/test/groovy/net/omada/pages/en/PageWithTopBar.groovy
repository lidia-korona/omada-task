package net.omada.pages.en

import net.omada.pages.Page
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

abstract class PageWithTopBar extends Page {

    private static final String BOOK_DEMO_BUTTON = 'Book a Demo'
    private static final String CONTACT_BUTTON = 'Contact'

    PageWithTopBar(WebDriver webDriver) {
        super(webDriver)
    }

    void goToBookADemo() {
        click(byHeaderLinkXpath(BOOK_DEMO_BUTTON))
    }

    void goToContactDetails() {
        click(byHeaderLinkXpath(CONTACT_BUTTON))
    }

    protected final By byHeaderLinkXpath(String text) {
        By.xpath("//header//li/a[text()='${text}']")
    }
}
