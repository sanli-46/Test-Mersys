package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {
    public WebDriverWait wait=new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(15));
    public void scrollToElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        JavascriptExecutor js = (JavascriptExecutor) BaseDriver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
    public void clickMethod(WebElement elm){
        wait.until(ExpectedConditions.visibilityOf(elm));
        elm.click();
    }
    public void sendKeysMethod(WebElement elm,String keys){
        wait.until(ExpectedConditions.visibilityOf(elm));
        scrollToElement(elm);
        elm.click();
        elm.clear();
        elm.sendKeys(keys);
    }
    public void myDisplayedAssert(WebElement elm){
        wait.until(ExpectedConditions.visibilityOf(elm));
        Assert.assertTrue(elm.isDisplayed());
    }
}
