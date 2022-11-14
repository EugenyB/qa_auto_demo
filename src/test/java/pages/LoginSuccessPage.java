package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginSuccessPage extends BasePage {
    @FindBy(xpath = "//h1")
    WebElement head1;

    public void checkIfSuccess() {
        assertThat(head1.getText())
                .isEqualTo("Login successful");
    }

}
