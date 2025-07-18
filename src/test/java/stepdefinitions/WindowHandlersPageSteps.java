package stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static io.qameta.allure.Allure.step;
import pages.WindowHandlersPage;

public class WindowHandlersPageSteps {
    WindowHandlersPage windowHandlersPage = new WindowHandlersPage();

    @Then("the Click Here link is displayed")
    public void isClickHereLinkDisplayed() {
        step("the Click Here link is displayed");
        Assert.assertTrue(windowHandlersPage.isClickHereLinkDisplayed(), "The Click Here link is not displayed");
    }

    @When("I click the Click here link")
    public void clickClickHereLink() {
        step("I click the Click here link");
        windowHandlersPage.clickClickHereLink();
    }
}
