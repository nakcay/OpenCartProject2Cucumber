package StepDefinitons;

import Pages.POMPage;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class HomePage {
    POMPage oc = new POMPage();

    @When("I click on the items one by one and navigate back")
    public void iClickOnTheItemsOneByOneAndNavigateBack() {
        List<WebElement> features = new ArrayList<>(List.of(oc.getFeatureMacBook(), oc.getFeatureIphone(), oc.getFeatureAppleCinema(), oc.getFeatureCanon()));
        for (WebElement featureList : features) {
            featureList.click();
            BasicDriver.getDriver().navigate().back();
        }
    }

    @And("I click on the add to card button of the items one by one and get the success messages")
    public void iClickOnTheAddToCardButtonOfTheItemsOneByOneAndGetTheSuccessMessages() throws InterruptedException {
        Thread.sleep(3000);
        oc.clickMethod(oc.getAddToCartButtonOfMacbook());
        Assert.assertTrue(oc.getSuccessMessageAddToCartOfMacbook().isDisplayed());
        Thread.sleep(3000);
        oc.clickMethod(oc.getAddToCartButtonOfIphone());
        Assert.assertTrue(oc.getSuccessMessageAddToCartOfIphone().isDisplayed());
    }

    @And("I click on the wish list button of the all features items and get the alert messages")
    public void iClickOnTheWishListButtonOfTheAllFeaturesItemsAndGetTheAlertMessages() throws InterruptedException {
        oc.clickMethod(oc.getWishListButtonOfMacBook());
        Assert.assertTrue(oc.getAlertMessageWishListOfMacbook().isDisplayed());
        Thread.sleep(3000);
        oc.clickMethod(oc.getWishListButtonOfIphone());
        Assert.assertTrue(oc.getWishListButtonOfIphone().isDisplayed());
        Thread.sleep(3000);
        oc.clickMethod(oc.getWishListButtonOfAppleCinema());
        Assert.assertTrue(oc.getAlertMessageWishListOfAppleCinema().isDisplayed());
        Thread.sleep(3000);
        oc.clickMethod(oc.getAlertMessageWishListOfCanon());
        Assert.assertTrue(oc.getAlertMessageWishListOfCanon().isDisplayed());
    }

    @And("I click on the compare this item buttons one by one and get success message")
    public void iClickOnTheCompareThisItemButtonsOneByOneAndGetSuccessMessage() throws InterruptedException {
        Thread.sleep(3000);
        oc.clickMethod(oc.getCompareThisProductButtonOfMacBook());
        Assert.assertTrue(oc.getSuccessMessageCompareThisProductOfMacbook().isDisplayed());
        Thread.sleep(3000);
        oc.clickMethod(oc.getCompareThisProductButtonOfIphone());
        Assert.assertTrue(oc.getSuccessMessageCompareThisProductOfIphone().isDisplayed());
        Thread.sleep(3000);
        oc.clickMethod(oc.getCompareThisProductButtonOfIphone());
        Assert.assertTrue(oc.getSuccessMessageCompareThisProductOfAppleCinema().isDisplayed());
        Thread.sleep(3000);
        oc.clickMethod(oc.getCompareThisProductButtonOfCanon());
        Assert.assertTrue(oc.getSuccessMessageCompareThisProductOfCanon().isDisplayed());
    }
}

