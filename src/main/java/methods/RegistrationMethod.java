package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class RegistrationMethod extends BasePage {
    public RegistrationMethod(WebDriver driver) {
        super(driver);
    }

    By signInBy = By.id("signin2");
    By signInUsernameBy = By.id("sign-username");
    By signInPasswordBy = By.id("sign-password");
    By signUpBy = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");

    public RegistrationMethod registerUser(String reg_email, String reg_password) {
        click(signInBy);
        writeText(signInUsernameBy, reg_email);
        writeText(signInPasswordBy, reg_password);
        click(signUpBy);
        return this;
    }
}
