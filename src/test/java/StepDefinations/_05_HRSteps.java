package StepDefinations;


import Pages.Elements;
import Pages.LeftBarElements;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _05_HRSteps {
    LeftBarElements ln = new LeftBarElements();
    Elements dc = new Elements();

    @And("Click on the element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable linkler) {
        List<String> strlinkList = linkler.asList(String.class);

        for (int i = 0; i < strlinkList.size(); i++) {
            WebElement linkWebElement = ln.getWebElement(strlinkList.get(i));
            ln.clickMethod(linkWebElement);
        }
    }


    @And("Click on the element in Dialog")
    public void clickOnTheElementInDialog(DataTable buttons) {
        List<String> strButtonsList = buttons.asList(String.class);

        for (int i = 0; i < strButtonsList.size(); i++) {
            WebElement linkWebElement = dc.getWebElement(strButtonsList.get(i));
            dc.clickMethod(linkWebElement);
        }
    }


    @And("User sending the keys in Dialog")
    public void userSendingTheKeysInDialog(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement e = dc.getWebElement(items.get(i).get(0)); // 0. webelement
            String yazi = items.get(i).get(1);//1. yazısı

            dc.sendKeysMethod(e, yazi);
        }
    }
    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.getsuccessMessage(),"success");
    }

    @And("User delete the element from Dialog")
    public void userDeleteTheElementFromDialog(DataTable dt) {
        List<String> delete = dt.asList(String.class);

        for (int i = 0; i < delete.size(); i++) {
            dc.deleteItem(delete.get(i));
        }
    }

    @And("User Delete the element from Dialog")
    public void UserDeleteTheElementFromDialog(DataTable dt) {
        List<String> delete = dt.asList(String.class);

        for (int i = 0; i < delete.size(); i++) {
            dc.deleteItem1(delete.get(i));
        }
    }

    @And("Click on the element in the Dialog")
    public void clickOnTheElementInTheDialog(DataTable dt) {
            List<String> values = dt.asList();
    }
}