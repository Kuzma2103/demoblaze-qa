package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By loginBy = By.id("login2");
    By loginUsernameBy = By.id("loginusername");
    By loginPasswordBy = By.id("loginpassword");
    By loginButtonBy = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");

    public LoginPage login(String reg_username, String reg_password) {
        click(loginBy);
        writeText(loginUsernameBy, reg_username);
        writeText(loginPasswordBy, reg_password);
        click(loginButtonBy);
        return this;
    }
}
