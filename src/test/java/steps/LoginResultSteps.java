package steps;

import pages.LoginFailPage;
import pages.LoginSuccessPage;

public class LoginResultSteps {

    LoginSuccessPage loginSuccessPage = new LoginSuccessPage();

    LoginFailPage loginFailPage = new LoginFailPage();
    public LoginResultSteps verifySuccessHeader() {
        loginSuccessPage.checkIfSuccess();
        return this;
    }

    public LoginResultSteps verifyFailHeader() {
        loginFailPage.checkIfFailed();
        return this;
    }
}
