package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pages extends MyMethods {
    public Pages() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='My Account']")
    private WebElement myAccount;

    @FindBy(xpath = "//span[text()='My Account']/../..//a[text()='Login']")
    private WebElement loginUnderMyAccount;

    @FindBy(id = "input-email")
    private WebElement emailField;

    @FindBy(id = "input-password")
    private WebElement passwordField;

    @FindBy(css = "input[type='submit']")
    private WebElement loginButton;

    public WebElement getMyAccount() {
        return myAccount;
    }

    public WebElement getLoginUnderMyAccount() {
        return loginUnderMyAccount;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }
}
