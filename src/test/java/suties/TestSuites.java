package suties;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.*;
import tests_with_login.*;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        RegistrationTest.class,
        FailLoginTest.class,
        LoginTest.class,
        LogoutTest.class
})

public class TestSuites {
}
