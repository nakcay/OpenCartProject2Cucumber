package StepDefinitons;

import Pages.POMPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ProductDisplay {
    POMPage oc=new POMPage();
    @And("I click on the item which is displayed")
    public void iClickOnTheItemWhichIsDisplayed() {
        oc.clickMethod(oc.getiMacProduct());
    }

    @And("I click on the description tab")
    public void iClickOnTheDescriptionTab() {
        oc.clickMethod(oc.getDescriptionOfImac());//ASK
    }
    @Then("user should see the description is correct")
    public void userShouldSeeTheDescriptionIsCorrect() {
        Assert.assertTrue(oc.getDescriptionText().getText().contains("Just when you thought iMac had everything, now there´s even more. More powerful Intel Core 2 Duo processors. And more memory standard. Combine this with Mac OS X Leopard and iLife ´08, and it´s more all-in-one than ever. iMac packs amazing performance into a stunningly slim space."));
    }
    @And("I click on product comparison link in the success message")
    public void iClickOnProductComparisonLinkInTheSuccessMessage()  {
        oc.clickMethod(oc.getProductComparisonLinkInTheSuccessMessage());
    }
    @And("user should see the product added success message")
    public void userShouldSeeTheProductAddedSuccessMessage() {
        Assert.assertTrue(oc.getAddedSuccessMessage().isDisplayed());
    }


    @Then("user should see the product details on the product comparison page")
    public void userShouldSeeTheProductDetailsOnTheProductComparisonPage() {
        Assert.assertTrue(oc.getProductDetails().isDisplayed());
    }


    @And("I send a apple item data  to search")
    public void iSendAAppleItemDataToSearch() {
        oc.sendKeysMethod(oc.getSearchTextBox(),"Apple Cinema 30\"");
    }

    @And("I click on the product Apple cinema")
    public void iClickOnTheProductAppleCinema() {
        oc.clickMethod(oc.getAppleCinemaItem());
    }

    @And("user should see the Product original price")
    public void userShouldSeeTheProductOriginalPrice() {
        Assert.assertTrue(oc.getAppleNetPrice().isDisplayed());
    }
}
