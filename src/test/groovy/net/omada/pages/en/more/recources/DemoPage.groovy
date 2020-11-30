package net.omada.pages.en.more.recources

import net.omada.pages.en.PageWithNavigationBar
import org.openqa.selenium.WebDriver

class DemoPage extends PageWithNavigationBar {

    DemoPage(WebDriver webDriver) {
        super(webDriver)
    }

    void fillTheForm() {
        typeFirstName()
        typeLastName()
        typeCompanyName()
        typeJobTitle()
        typeEmail()
        typePhone()
        selectCountry()
        selectNumberOfEmployees()
        acceptPolicy()
        submit()
    }

    private void typeFirstName(String name) {

    }

    private void typeLastName(String name) {

    }

    private void typeCompanyName(String name) {

    }

    private void typeJobTitle(String title) {

    }

    private void typeEmail(String email) {

    }

    private void typePhone(String phone) {

    }

    private void selectCountry(String country) {

    }

    private void selectNumberOfEmployees(String value) {

    }

    private acceptPolicy() {

    }

    private submit() {

    }
}
