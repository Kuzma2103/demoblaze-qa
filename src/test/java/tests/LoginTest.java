package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;
import pages.VerificationPage;
import utilities.PropertyManager;

public class LoginTest extends BaseTest {
    public LoginPage loginPage;
    public VerificationPage verificationPage;

    @Test
    public void login() {
        loginPage = new LoginPage(driver);
        verificationPage = new VerificationPage(driver);

        loginPage.login(PropertyManager.getInstance().getRegEmail(), PropertyManager.getInstance().getRegPassword());

        try {
            verificationPage.verifyLogin("Welcome " + PropertyManager.getInstance().getRegEmail());
            System.out.print("User is logged in.");
        } catch (Exception e) {
            Assert.fail("User is not logged in.");
        }
    }

}
