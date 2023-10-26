package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftBarElements extends Parent {
    public LeftBarElements() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    //**//
    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement navHumanResources;
    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement chdHRSetup;
    @FindBy(xpath = "(//span[text()='Positions'])[1]")
    private WebElement chPositions;
    @FindBy(xpath = "(//span[text()='Attestations'])[1]")
    private WebElement chAttestations;
    @FindBy(xpath = "//span[text()='Position Categories']")
    private WebElement chPositionCategories;
    //**//
    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement navSetup;
    @FindBy(xpath = "(//span[text()='Parameters'])[1]")
    private WebElement chParameters;
    @FindBy(xpath = "(//span[text()='Document Types'])[1]")
    private WebElement chDocumentTypes;
    @FindBy(xpath = "(//span[text()='Fields'])[1]")
    private WebElement chFields;
    @FindBy(xpath = "(//span[text()='Grade Levels'])[1]")
    private WebElement chGradeLevels;
    @FindBy(xpath = "(//span[text()='Discounts'])[1]")
    private WebElement chDiscount;
    @FindBy(xpath = "(//span[text()='Nationalities'])[1]")
    private WebElement chNationalities;
    @FindBy(xpath = "(//span[text()='Bank Accounts'])[1]")
    private WebElement chBankAccount;
    @FindBy(xpath = "(//span[text()='School Setup'])[1]")
    private WebElement chSchoolSetup;
    @FindBy(xpath = "(//span[text()='Locations'])[1]")
    private WebElement chLocations;
    @FindBy(xpath = "(//span[text()='Departments'])[1]")
    private WebElement chDepartments;
    //**//
    @FindBy(xpath = "(//span[text()='Education'])[1]")
    private WebElement navEducations;
    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    private WebElement chEdSetup;
    @FindBy(xpath = "//span[text()='Subject Categories']")
    private WebElement chSubjectCategories;
    //**//


    public WebElement getNavHumanResources() {
        return navHumanResources;
    }

    public WebElement getChdHRSetup() {
        return chdHRSetup;
    }

    public WebElement getChPositions() {
        return chPositions;
    }

    public WebElement getChAttestations() {
        return chAttestations;
    }

    public WebElement getChPositionCategories() {
        return chPositionCategories;
    }

    public WebElement getNavSetup() {
        return navSetup;
    }

    public WebElement getChParameters() {
        return chParameters;
    }

    public WebElement getChDocumentTypes() {
        return chDocumentTypes;
    }

    public WebElement getChFields() {
        return chFields;
    }

    public WebElement getChGradeLevels() {
        return chGradeLevels;
    }

    public WebElement getChDiscount() {
        return chDiscount;
    }

    public WebElement getChNationalities() {
        return chNationalities;
    }

    public WebElement getChBankAccount() {
        return chBankAccount;
    }

    public WebElement getChSchoolSetup() {
        return chSchoolSetup;
    }

    public WebElement getChLocations() {
        return chLocations;
    }

    public WebElement getChDepartments() {
        return chDepartments;
    }

    public WebElement getNavEducations() {
        return navEducations;
    }

    public WebElement getChEdSetup() {
        return chEdSetup;
    }

    public WebElement getChSubjectCategories() {
        return chSubjectCategories;
    }

    public WebElement getWebElement(String strElement) {
        switch (strElement) {

            case "navSetup":
                return this.navSetup;
            case "chParameters":
                return this.chParameters;
            case "navHumanResources":
                return this.navHumanResources;
            case "chdHRSetup":
                return this.chdHRSetup;
            case "chPositions":
                return this.chPositions;
            case "chAttestations":
                return this.chAttestations;
            case "chPositionCategories":
                return this.chPositionCategories;
            case "chGradeLevels":
                return this.chGradeLevels;
            case "chFields":
                return this.chFields;
            case "chNationalities":
                return this.chNationalities;
            case "chDepartments":
                return this.chDepartments;
            case "education":
                return this.navEducations;
            case "edSetup":
                return this.chEdSetup;
            case "subjectCategories":
                return this.chSubjectCategories;
            case "bankAccount":
                return this.chBankAccount;
        }
        return null;
    }
}
