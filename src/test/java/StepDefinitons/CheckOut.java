package StepDefinitons;

import Pages.POMPage;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

public class CheckOut {
    POMPage oc=new POMPage();
    @And("I click on the checkout button in the shopping cart page")
    public void iClickOnTheCheckoutButtonInTheShoppingCartPage() {
        oc.clickMethod(oc.getCheckoutButtonOnTheBottom());

    }

    @And("I select i want to use a new address option")
    public void iSelectIWantToUseANewAddressOption() {
        oc.clickMethod(oc.getWannaUseANewAddressRadioButton());
    }

    @Then("user should see all the text field Placeholder fields")
    public void userShouldSeeAllTheTextFieldPlaceholderFields() {
        Assert.assertTrue(oc.getFirstNamePLaceHolder().isDisplayed());
        Assert.assertTrue(oc.getLastNamePLaceHolder().isDisplayed());
        Assert.assertTrue(oc.getCompanyPLaceHolder().isDisplayed());
        Assert.assertTrue(oc.getAddress1PLaceHolder().isDisplayed());
        Assert.assertTrue(oc.getAddress2PLaceHolder().isDisplayed());
        Assert.assertTrue(oc.getCityPLaceHolder().isDisplayed());
        Assert.assertTrue(oc.getPostalCodePLaceHolder().isDisplayed());
    }

    @Given("I navigate to OpenCart web page with chrome browser")
    public void iNavigateToOpenCartWebPageWithChromeBrowser() {
        BasicDriver.getDriver().get("https://opencart.abstracta.us/");
    }

    @And("I navigate to OpenCart web page with safari browser")
    public void iNavigateToOpenCartWebPageWithSafariBrowser() {
        WebDriver driver=new SafariDriver();
        driver.get("https://opencart.abstracta.us/");
    }

    @And("I navigate to OpenCart web page with firefox browser")
    public void iNavigateToOpenCartWebPageWithFirefoxBrowser() {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://opencart.abstracta.us/");

    }

    @When("I click on the checkout button and verify it on the chrome")
    public void iClickOnTheCheckoutButtonAndVerifyItOnTheChrome() {
        oc.clickMethod(oc.getCheckoutButtonOnTheTop());
        Assert.assertTrue(oc.getShoppingCartVerificationText().isDisplayed());
        BasicDriver.quitDriver();

    }

    @And("I click on the checkout button and verify it on the safari")
    public void iClickOnTheCheckoutButtonAndVerifyItOnTheSafari() {
        oc.clickMethod(oc.getCheckoutButtonOnTheTop());
        Assert.assertTrue(oc.getShoppingCartVerificationText().isDisplayed());


    }

    @And("I click on the checkout button and verify it on the firefox")
    public void iClickOnTheCheckoutButtonAndVerifyItOnTheFirefox() {
        oc.clickMethod(oc.getCheckoutofFireFox());
        Assert.assertTrue(oc.getShoppingCartVerificationText().isDisplayed());

    }
}
