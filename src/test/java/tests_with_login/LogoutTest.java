package tests_with_login;

import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;
import pages.VerificationPage;

public class LogoutTest extends BaseTestWithLogin {

    public LoginPage loginPage;
    public VerificationPage verificationPage;

    @Test
    public void logout() {
        loginPage = new LoginPage(driver);
        verificationPage = new VerificationPage(driver);

        loginPage.logout();

        try {
            verificationPage.verifyLogout("Log in");
            System.out.print("The user is logged out.");
        } catch (Exception e) {
            Assert.fail("The user has failed to log out.");
        }
    }
}
