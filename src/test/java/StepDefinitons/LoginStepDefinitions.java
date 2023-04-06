package StepDefinitons;

import Pages.Pages;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefinitions {
    Pages pg = new Pages();
    @Given("I navigate to OpenCart web page")
    public void iNavigateToOpenCartWebPage() {
        BasicDriver.getDriver().get("https://opencart.abstracta.us/");
    }

    @Then("I go to login page")
    public void iGoToLoginPage() {
        pg.clickMethod(pg.getMyAccount());
        pg.clickMethod(pg.getLoginUnderMyAccount());

    }

    @And("I enter email and password and click login button")
    public void iEnterEmailAndPasswordAndClickLoginButton() {
        pg.sendKeysMethod(pg.getEmailField(),"testersdet@test.com");
        pg.sendKeysMethod(pg.getPasswordField(),"12345");
        pg.clickMethod(pg.getLoginButton());
    }
}
