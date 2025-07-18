package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.qameta.allure.Allure.step;

import org.testng.Assert;

import pages.MainPage;

public class MainPageSteps {
    MainPage mainPage = new MainPage();

    @When("I select the {string} link and click it")
    public void goTO(String page) {
        step("I select the " + page + " link and click it");
        mainPage.clickNavigationLink(page);
    }

    @Then("the main page is displayed")
    public void mainPageIsDisplayed() {
        step("the main page is displayed");
        Assert.assertTrue(mainPage.state().isDisplayed(), "The main page is not displayed");
    }
}
