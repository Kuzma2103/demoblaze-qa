package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerificationPage extends BasePage {
    public VerificationPage(WebDriver driver) {
        super(driver);
    }

    By nameOfUserBy = By.id("nameofuser");
    By loginBy = By.id("login2");

    public VerificationPage verifyRegistration(String expectedText) {
        String sign_up = readTextFromAlertBox();
        assertStringEquals(sign_up, expectedText);
        return this;
    }

    public VerificationPage verifyLogin(String expectedText) {
        String user_name = readText(nameOfUserBy);
        assertStringEquals(user_name, expectedText);
        return this;
    }

    public VerificationPage verifyLogout(String expectedText) {
        String log_in = readText(loginBy);
        assertStringEquals(log_in, expectedText);
        return this;
    }
}


