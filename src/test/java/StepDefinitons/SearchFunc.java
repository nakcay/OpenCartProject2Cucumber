package StepDefinitons;

import Pages.POMPage;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class SearchFunc {
    POMPage oc=new POMPage();
    @And("I click on the search icon")
    public void iClickOnTheSearchIcon() {
        oc.clickMethod(oc.getSearchIcon());
    }

    @Then("user should see placeholders of the page thar are search text box and criteria text box")
    public void userShouldSeePlaceholdersOfThePageTharAreSearchTextBoxAndCriteriaTextBox() {
        Assert.assertEquals(oc.getSearchTextBox().getDomProperty("placeholder"),"Search");
        Assert.assertEquals(oc.getSearchCriteriaKeywords().getDomProperty("placeholder"),"Keywords");
    }

    @And("I send a data to search")
    public void iSendADataToSearch() {
        oc.sendKeysMethod(oc.getSearchTextBox(),"iMac");

    }

    @Then("user should see the breadcrumb functionality working well")
    public void userShouldSeeTheBreadcrumbFunctionalityWorkingWell() {

    }

    @And("I click on the home button")
    public void iClickOnTheHomeButton() {
        oc.clickMethod(oc.getHomeButtonOnTheBreadCrumb());
        Assert.assertEquals(BasicDriver.getDriver().getCurrentUrl(),"http://opencart.abstracta.us/index.php?route=common/home");
    }

    @And("I navigate back")
    public void iNavigateBack() {
        BasicDriver.getDriver().navigate().back();
    }

    @And("I click on the search button")
    public void iClickOnTheSearchButton() {
        oc.clickMethod(oc.getSearchButtonOnTheBreadCrumb());
        Assert.assertEquals(BasicDriver.getDriver().getCurrentUrl(),"http://opencart.abstracta.us/index.php?route=product/search&search=iMac");
    }
}
