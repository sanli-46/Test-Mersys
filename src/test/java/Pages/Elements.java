package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Elements extends Parent {

    public Elements() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    //mat-form-field//input[@data-placeholder='Name']

    @FindBy(xpath = "//input[@formcontrolname='username']")
    private WebElement loginUsername;
    @FindBy(xpath = "//input[@formcontrolname='password']")
    private WebElement loginPassword;
    @FindBy(xpath = "//button[@aria-label='LOGIN']")
    private WebElement loginButton;
    @FindBy(xpath = "//img[@class='avatar-mini ng-star-inserted']")
    private WebElement homepageAvatar;
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    private WebElement plusButton;
    @FindBy(xpath = "//ms-table-menu/button")
    private WebElement rippleButton;
    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;
    @FindBy(xpath = "(//ms-edit-button/button)[1]")
    private WebElement editButton;
    @FindBy(xpath = "(//ms-delete-button/button)[1]")
    private WebElement deleteButton;
    @FindBy(xpath = "//button[@type='submit']") // delete'in deletesi.
    private WebElement secDeleteButton;
    @FindBy(css = "ms-text-field[formcontrolname='name'] > input")
    private WebElement nameInput;
    @FindBy(css = "ms-text-field[formcontrolname='shortName'] > input")
    private WebElement shortNameInput;
    @FindBy(css = "ms-text-field[formcontrolname='order'] > input")
    private WebElement orderInput;
    @FindBy(css = "ms-save-button > button")
    private WebElement saveButton;
    @FindBy(css = "button[aria-label='Close")
    private WebElement XButton;
    @FindBy(xpath = "//input[@data-placeholder='Name']")
    private WebElement searchNameLabel;
    @FindBy(css = "//input[@data-placeholder='Description']")
    private WebElement searchDescriptionLabel;
    @FindBy(css = "//input[@data-placeholder='Integration Code']")
    private WebElement searchIntegrationCode;
    @FindBy(css = " (//mat-select[@role='combobox'])[1]")
    private WebElement searchStageSelect;
    @FindBy(xpath = "//div[@class='mat-mdc-checkbox-touch-target']")
    private WebElement subjectCategoriesBox;
    @FindBy(xpath = "(//button[@role='switch'])[1]")
    private WebElement positionActiveButton;
    @FindBy(xpath = "(//button[@role='switch'])[8]")
    private WebElement positionActiveButtonNGL;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='code' ]//input")
    private WebElement codeInput;
    @FindBy(xpath = "(//mat-select[@role='combobox'])[3]")
    private WebElement bankSelect;
    @FindBy(xpath = "//input[@id='ms-text-field-2']")
    private WebElement iban;

    public WebElement getBankSelect() {
        return bankSelect;
    }

    public WebElement getIban() {
        return iban;
    }

    public WebElement getEUR() {
        return EUR;
    }

    @FindBy(xpath = "(//mat-option[@role='option'])[1]")
    private WebElement EUR;


    public WebElement getXButton() {
        return XButton;
    }


    public WebElement getLoginUsername() {return loginUsername;
    }

    public WebElement getLoginPassword() {return loginPassword;
    }

    public WebElement getLoginButton() {return loginButton;
    }

    public WebElement getHomepageAvatar() {return homepageAvatar;
    }

    public WebElement getPlusButton() {return plusButton;
    }

    public WebElement getRippleButton() {return rippleButton;
    }

    public WebElement getSearchButton() {return searchButton;
    }

    public WebElement getEditButton() {return editButton;
    }

    public WebElement getDeleteButton() {return deleteButton;
    }

    public WebElement getSecDeleteButton() {return secDeleteButton;
    }

    public WebElement getNameInput() {return nameInput;
    }

    public WebElement getShortNameInput() {return shortNameInput;
    }

    public WebElement getOrderInput() {return orderInput;
    }

    public WebElement getSaveButton() {return saveButton;
    }

    public WebElement getSearchNameLabel() {return searchNameLabel;
    }

    public WebElement getSearchDescriptionLabel() {return searchDescriptionLabel;
    }

    public WebElement getSearchIntegrationCode() {return searchIntegrationCode;
    }

    public WebElement getSearchStageSelect() {return searchStageSelect;
    }

    public WebElement getSubjectCategoriesBox() {return subjectCategoriesBox;
    }

    public WebElement getPositionActiveButton() {return positionActiveButton;
    }

    public WebElement getPositionActiveButtonNGL() {return positionActiveButtonNGL;
    }

    public WebElement getsuccessMessage() {return successMessage;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public WebElement getCodeInput() {
        return codeInput;
    }

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "plusButton": return this.plusButton;
            case "saveButton": return this.saveButton;
            case "nameInput": return this.nameInput;
            case "shortNameInput": return this.shortNameInput;
            case "orderInput": return this.orderInput;
            case "editButton": return this.editButton;
            case "searchButton": return this.searchButton;
            case "searchNameLabel": return this.searchNameLabel;
            case "successMessage": return this.successMessage;
            case "deleteButton": return this.deleteButton;
            case "secDeleteButton": return this.secDeleteButton;
            case "codeInput": return this.codeInput;
            case "Xbutton":return this.XButton;
            case "iban ":return this.iban;
            case "bankSelect":return this.bankSelect;
            case "EUR":return this.EUR;
            case "intCode":return this.searchIntegrationCode;
        }
        return null;
    }


    public void deleteItem(String searchText) {
        sendKeysMethod(searchNameLabel, searchText);
        clickMethod(searchButton);

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));

        clickMethod(deleteButton);
        clickMethod(secDeleteButton);

    }

    public void deleteItem1(String s) {

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));

        clickMethod(deleteButton);
        clickMethod(secDeleteButton);
    }
}