package StepDefinations;

import Pages.Elements;
import Utilities.BaseDriver;
import Utilities.ExcelUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

public class LoginSteps {
    Elements el=new Elements();
    @Given("Navigate to Mersys")
    public void navigateToMersys() {
        BaseDriver.getDriver().get("https://test.mersys.io");
    }

    @When("User enter invalid login information and click login button")
    public void userEnterInvalidLoginInformationAndClickLoginButton() {
        ArrayList<ArrayList<String>> info= ExcelUtility.getData("src/test/java/ApachePOI/resources/LoginDataa3.xlsx","sheet1",2);

        for(ArrayList<String> table:info){

            el.sendKeysMethod(el.getLoginUsername(),table.get(0));
            el.sendKeysMethod(el.getLoginPassword(),table.get(1));
            el.clickMethod(el.getLoginButton());
        }
    }

    @Then("User should login unsuccessfully")
    public void userShouldLoginUnsuccessfully() {
        el.myDisplayedAssert(el.getsuccessMessage());
    }

    @When("User enter valid login information and click login button")
    public void userEnterValidLoginInformationAndClickLoginButton() {

        ArrayList<ArrayList<String>> info=ExcelUtility.getData("src/test/resources/ValidLoginData.xlsx","sheet2",2);

        el.sendKeysMethod(el.getLoginUsername(), String.valueOf(info.get(0).get(0)));
        el.sendKeysMethod(el.getLoginPassword(), String.valueOf(info.get(0).get(1)));
        el.clickMethod(el.getLoginButton());
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        el.myDisplayedAssert(el.getHomepageAvatar());
    }
}
