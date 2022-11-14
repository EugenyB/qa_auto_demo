package tests;

import org.testng.annotations.Test;
import steps.LoginResultSteps;

public class LoginSuccessTest extends BaseTest {

    @Test
    public void testSuccessLogin() {
        LoginResultSteps loginResultSteps = steps.doLogin("eugeny", "secret");
        loginResultSteps.verifySuccessHeader();
    }

    @Test
    public void testFailedLogin() {
        LoginResultSteps loginResultSteps = steps.doLogin("eugeny", "123");
        loginResultSteps.verifyFailHeader();
    }
}
