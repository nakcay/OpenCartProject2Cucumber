package StepDefinitons;

import Pages.POMPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoggedOut {
    POMPage oc=new POMPage();
    @When("Click on my Account button")
    public void clickOnMyAccountButton() {
        oc.clickMethod(oc.getMyAccount());
    }
    @And("Click on Register Button")
    public void clickOnRegisterButton() {
        oc.clickMethod(oc.getRegisterButton());
    }

    @Then("user should not see logged out button on the right column")
    public void userShouldNotSeeLoggedOutButtonOnTheRightColumn() {
        Assert.assertNotEquals(oc.getLoginOnRegisterPage().getText(),"Logout");
    }
}
