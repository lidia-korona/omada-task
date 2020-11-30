package net.omada.pages.en.more.company

import net.omada.pages.en.PageWithNavigationBar
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

class ContactPage extends PageWithNavigationBar {

    private static final String CONTACT_SECTION = "//section[@class='form__content']"

    ContactPage(WebDriver webDriver) {
        super(webDriver)
    }

    void checkContactDetails() {
        assert getElement(By.xpath(CONTACT_SECTION)).isDisplayed()
    }

    void fillTheForm() {

    }
}
