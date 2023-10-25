package StepDefinations;

import Pages.Elements;
import Pages.LeftBarElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Human {
    Elements dc = new Elements();
    LeftBarElements lb = new LeftBarElements();

    @When("Must add user documentation")
    public void mustAddUserDocumentation() {
        lb.clickMethod(lb.getNavHumanResources());
        lb.clickMethod(lb.getChdHRSetup());
        lb.clickMethod(lb.getChAttestations());
        dc.clickMethod(dc.getPlusButton());
        dc.sendKeysMethod(dc.getNameInput(), "cxbbg3");
        dc.clickMethod(dc.getXButton());
        dc.clickMethod(dc.getSaveButton());
    }

    @Then("Must be able to edit user documentation")
    public void mustBeAbleToEditUserDocumentation() {
        dc.clickMethod(dc.getEditButton());
        dc.clickMethod(dc.getEditButton());
        dc.sendKeysMethod(dc.getNameInput(), "fdgdg");
        dc.clickMethod(dc.getSaveButton());
    }

    @And("User should be able to delete documentation")
    public void userShouldBeAbleToDeleteDocumentation() {
        dc.clickMethod(dc.getDeleteButton());
        dc.clickMethod(dc.getSecDeleteButton());
    }
}
