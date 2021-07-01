package pages;

import methods.RegistrationMethod;
import org.openqa.selenium.WebDriver;
import utilities.PropertyManager;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public RegistrationMethod method;


    public RegistrationPage registration() {
        method = new RegistrationMethod(driver);
        method.registerUser(
                PropertyManager.getInstance().getRegEmail(),
                PropertyManager.getInstance().getRegPassword()
        );
        return this;
    }
}
