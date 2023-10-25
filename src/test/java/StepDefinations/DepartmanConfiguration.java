package StepDefinations;

import Pages.Elements;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DepartmanConfiguration {
    Elements el = new Elements();




    @When("Departman add")
    public void departmanAdd() {
     el.clickMethod(el.getPlusButton());
     el.sendKeysMethod(el.getNameInput(),"Candan");
     el.sendKeysMethod(el.getCodeInput(),"Can");
     el.clickMethod(el.getSaveButton());

    }

    @Then("Departman update")
    public void departmanUpdate() {

        el.sendKeysMethod(el.getSearchNameLabel(),"Candan");
        el.clickMethod(el.getSearchButton());
        el.clickMethod(el.getEditButton());
        el.sendKeysMethod(el.getNameInput(),"Candan2");
        el.sendKeysMethod(el.getCodeInput(),"Can2");
        el.clickMethod(el.getSaveButton());
    }




}
