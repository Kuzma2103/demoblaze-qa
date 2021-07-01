package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;
import pages.VerificationPage;

public class FailLoginTest extends BaseTest {
    public LoginPage loginPage;
    public VerificationPage verificationPage;

    @Test
    public void login() throws InterruptedException {
        loginPage = new LoginPage(driver);
        verificationPage = new VerificationPage(driver);

        loginPage.login();
        Thread.sleep(3000);

        try {
            verificationPage.verifyRegistration("Wrong password.");
            System.out.print("Password is wrong.");
        } catch (Exception e) {
            Assert.fail("The test has failed.");
        }
    }
}
