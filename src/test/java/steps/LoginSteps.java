package steps;

import pages.LoginPage;

public class LoginSteps {
    private LoginPage loginPage = new LoginPage();


    public LoginResultSteps doLogin(String user, String pwd) {
        loginPage.fillTheUserField(user);
        loginPage.fillThePasswordField(pwd);
        loginPage.clickSubmitButton();
        return new LoginResultSteps();
    }

}
