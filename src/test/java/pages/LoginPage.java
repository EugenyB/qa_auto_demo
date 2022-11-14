package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeClass;

import java.io.File;

public class LoginPage extends BasePage {
    @FindBy(name = "user")
    WebElement userField;

    @FindBy(name = "pwd")
    WebElement passwordField;

    @FindBy(xpath = "//input[@value='Sign in']")
    WebElement submitBtn;

    public void fillTheUserField(String username) {
        userField.sendKeys(username);
    }

    public void fillThePasswordField(String password) {
        passwordField.sendKeys(password);
    }

    public void clickSubmitButton() {
        submitBtn.click();
    }

}
