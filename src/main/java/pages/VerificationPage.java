package pages;

import org.openqa.selenium.WebDriver;

public class VerificationPage extends BasePage {
    public VerificationPage(WebDriver driver) {
        super(driver);
    }

    public VerificationPage verifyRegistration(String expectedText) {
        String sign_up = readTextFromAlertBox();
        assertStringEquals(sign_up, expectedText);
        return this;
    }
}


