package StepDefinations;

import Pages.Elements;
import Pages.LeftBarElements;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SubjectCategoriesSteps {
    Elements ce=new Elements();
    LeftBarElements leftEl=new LeftBarElements();
    @Given("Click on the elements in LeftBarButton")
    public void clickOnTheElementsInLeftBarButton(DataTable buttons) {
        List<String> leftBarList=buttons.asList(String.class);

        for (int i = 0; i < leftBarList.size(); i++) {
                WebElement leftBarElements=leftEl.getWebElement(leftBarList.get(i));
                leftEl.clickMethod(leftBarElements);
        }
    }

    @When("Click on the elements in PageContainer")
    public void clickOnTheElementsInPageContainer(DataTable buttons) {
        List<String> contElements=buttons.asList(String.class);

        for (String element : contElements) {
            WebElement contElement = ce.getWebElement(element);
            ce.clickMethod(contElement);
        }
    }

    @Then("User sending keys in labels")
    public void userSendingKeysInLabels(DataTable keys) {
        List<List<String>> keysList=keys.asLists(String.class);

        for (int i = 0; i < keysList.size(); i++) {

            WebElement xKeys=ce.getWebElement(keysList.get(i).get(0));
            String text=keysList.get(i).get(1);

            ce.sendKeysMethod(xKeys,text);
        }
    }

    @When("User Delete element from PageContainer")
    public void userDeleteElementFromPageContainer(DataTable dlt) {

        List<String> deletedList=dlt.asList(String.class);

        for (int i = 0; i < deletedList.size(); i++) {
            ce.deleteItem(deletedList.get(i));
        }
    }
}
