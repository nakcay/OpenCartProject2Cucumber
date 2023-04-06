package StepDefinitons;

import Pages.POMPage;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

public class ShoppingCart {
    POMPage oc=new POMPage();
    @And("I click on the add to cart button product displayed in the result")
    public void iClickOnTheAddToCartButtonProductDisplayedInTheResult() {
        oc.clickMethod(oc.getAddtocartonthesearchpage());
    }

    @And("I click on the site map footer option")
    public void iClickOnTheSiteMapFooterOption() {
        oc.clickMethod(oc.getSiteMapOnTheFooter());
    }

    @And("I click on shopping cart link in the displayed site map")
    public void iClickOnShoppingCartLinkInTheDisplayedSiteMap() {
    }

    @And("I click on the add to cart button on iMac displayed page")
    public void iClickOnTheAddToCartButtonOnIMacDisplayedPage() {
        oc.clickMethod(oc.getAddtocartImacs());
    }

    @And("I click on the use your coupon menu")
    public void iClickOnTheUseYourCouponMenu() {
        oc.clickMethod(oc.getUseCouponCode());
    }

    @And("I send a coupon name")
    public void iSendACouponName() {
        oc.sendKeysMethod(oc.getEnterYourCoupon(),"Pending Data");
    }

    @And("I apply the coupon")
    public void iApplyTheCoupon() {
        oc.clickMethod(oc.getApplyCoupon());
    }

    @Then("user should see warning message of invalid coupon")
    public void userShouldSeeWarningMessageOfInvalidCoupon() {
        Assert.assertTrue(oc.getWarningMessageOfCoupon().isDisplayed());
    }

    @And("I click on the use your gift certification")
    public void iClickOnTheUseYourGiftCertification() {
        oc.clickMethod(oc.getUseGiftCartCertificateOptions());
    }

    @And("I click on apply gift certificate button")
    public void iClickOnApplyGiftCertificateButton() throws InterruptedException {
        Thread.sleep(3000);
        oc.clickMethod(oc.getApplyGiftCertificateButton());
    }

    @Then("user should see the warning message")
    public void userShouldSeeTheWarningMessage() {
        Assert.assertTrue(oc.getWarningMessageForGiftCertification().isDisplayed());
       // Assert.assertEquals(oc.getWarningMessageForGiftCertification().getText()," Warning: Please enter a gift certificate code!");
    }
}
