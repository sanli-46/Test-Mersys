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
    public WebElement nameInput;
    @FindBy(css = "ms-text-field[formcontrolname='shortName'] > input")
    public WebElement shortNameInput;
    @FindBy(css = "ms-text-field[formcontrolname='order'] > input")
    public WebElement orderInput;
    @FindBy(css = "ms-save-button > button")
    public WebElement saveButton;
    @FindBy(css = "//input[@data-placeholder='Name']")
    public WebElement searchNameLabel;
    @FindBy(css = "//input[@data-placeholder='Description']")
    public WebElement searchDescriptionLabel;
    @FindBy(css = "//input[@data-placeholder='Integration Code']")
    public WebElement searchIntegrationCode;
    @FindBy(css = " (//mat-select[@role='combobox'])[1]")
    public WebElement searchStageSelect;



}
