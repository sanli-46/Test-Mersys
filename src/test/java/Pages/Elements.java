package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements extends Parent{

    public Elements() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }
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
    @FindBy(css = "//input[@data-placeholder='Name']")
    private WebElement searchNameLabel;
    @FindBy(css = "//input[@data-placeholder='Description']")
    private WebElement searchDescriptionLabel;
    @FindBy(css = "//input[@data-placeholder='Integration Code']")
    private WebElement searchIntegrationCode;
    @FindBy(css = " (//mat-select[@role='combobox'])[1]")
    private WebElement searchStageSelect;

    public WebElement getLoginUsername() {
        return loginUsername;
    }

    public WebElement getLoginPassword() {
        return loginPassword;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getHomepageAvatar() {
        return homepageAvatar;
    }

    public WebElement getPlusButton() {
        return plusButton;
    }

    public WebElement getRippleButton() {
        return rippleButton;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getEditButton() {
        return editButton;
    }

    public WebElement getDeleteButton() {
        return deleteButton;
    }

    public WebElement getSecDeleteButton() {
        return secDeleteButton;
    }

    public WebElement getNameInput() {
        return nameInput;
    }

    public WebElement getShortNameInput() {
        return shortNameInput;
    }

    public WebElement getOrderInput() {
        return orderInput;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    public WebElement getSearchNameLabel() {
        return searchNameLabel;
    }

    public WebElement getSearchDescriptionLabel() {
        return searchDescriptionLabel;
    }

    public WebElement getSearchIntegrationCode() {
        return searchIntegrationCode;
    }

    public WebElement getSearchStageSelect() {
        return searchStageSelect;
    }
}
