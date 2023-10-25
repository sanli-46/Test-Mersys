package StepDefinations;

import Pages.Elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class NationalitiesSteps {
    Elements el = new Elements();



    @When("Nationalities add")
    public void nationalitiesAdd() {
        el.clickMethod(el.getPlusButton());
        el.sendKeysMethod(el.getNameInput(),"Candan");
        el.clickMethod(el.getSaveButton());
    }

    @Then("Nationalities create")
    public void nationalitiesCreate() {
        el.sendKeysMethod(el.getSearchNameLabel(),"Candan");
        el.clickMethod(el.getSearchButton());
        el.clickMethod(el.getEditButton());
        el.sendKeysMethod(el.getNameInput(),"Candan2");
        el.clickMethod(el.getSaveButton());
    }

    @And("Verifications")
    public void verifications() {
        el.myDisplayedAssert(el.getDeleteButton());
        el.myDisplayedAssert(el.getEditButton());
        el.myDisplayedAssert(el.getSearchButton());
        el.myDisplayedAssert(el.getPlusButton());
        el.myDisplayedAssert(el.getNameInput());

    }

    @Then("Delete")
    public void nationalitiesDelete() {
        el.sendKeysMethod(el.getSearchNameLabel(),"Candan");
        el.clickMethod(el.getSearchButton());
        el.clickMethod(el.getDeleteButton());
        el.clickMethod(el.getSecDeleteButton());
    }


}
