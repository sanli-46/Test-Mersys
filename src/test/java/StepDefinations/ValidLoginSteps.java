package StepDefinations;

import Pages.Elements;
import Utilities.BaseDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidLoginSteps {
    Elements el=new Elements();
    @Given("Navigate to Mersys")
    public void navigateToMersys() {
        BaseDriver.getDriver().get("https://test.mersys.io");
    }

    @When("User enter valid login information and click login button")
    public void userEnterValidLoginInformationAndClickLoginButton() {
        el.sendKeysMethod(el.getLoginUsername(),"turkeyts");
        el.sendKeysMethod(el.getLoginPassword(),"TechnoStudy123");
        el.clickMethod(el.getLoginButton());
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        el.myDisplayedAssert(el.getHomepageAvatar());
    }
}
