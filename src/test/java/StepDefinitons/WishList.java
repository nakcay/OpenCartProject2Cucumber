package StepDefinitons;

import Pages.POMPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class WishList {
    POMPage oc=new POMPage();
    @And("I click on the wish list button")
    public void iClickOnTheWishListButton() {
        oc.clickMethod(oc.getWishListButton());
    }

    @Then("user see the my wish list on the bread crumb")
    public void userSeeTheMyWishListOnTheBreadCrumb() {
        Assert.assertTrue(oc.getMyWishListButtonOnTheBreadCrumb().isDisplayed());
    }
}
