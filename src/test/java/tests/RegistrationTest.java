package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.RegistrationPage;
import pages.VerificationPage;
import utilities.PropertyManager;

public class RegistrationTest extends BaseTest {

    public RegistrationPage registrationPage;
    public VerificationPage verificationPage;

    @Test
    public void register() throws InterruptedException {
        registrationPage = new RegistrationPage(driver);
        verificationPage = new VerificationPage(driver);

        registrationPage.registration(PropertyManager.getInstance().getRegEmail(), PropertyManager.getInstance().getRegPassword());
        Thread.sleep(3000);

        try {
            verificationPage.verifyRegistration("Sign up successful.");
            System.out.print("User is registered.");
        } catch (Exception e) {
            Assert.fail("Something went wrong.");
        }
    }
}

