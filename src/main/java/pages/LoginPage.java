package pages;

import methods.LoginMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.PropertyManager;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginMethod method;

    By logoutBy = By.id("logout2");

    public LoginPage login() {
        method = new LoginMethod(driver);
        method.loginUser(PropertyManager.getInstance().getRegEmail(), PropertyManager.getInstance().getRegPassword());
        return this;
    }

    public LoginPage logout() {
        click(logoutBy);
        return this;
    }
}
