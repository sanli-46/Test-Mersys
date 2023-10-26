package StepDefinations;

import Utilities.BaseDriver;
import Utilities.ExcelUtility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void before() {
    }

    @After
    public void after(Scenario senaryo) {
        ExcelUtility.writeToExcel("src/test/java/ApachePOI/resource/SenaryoSonuclari.xlsx",
                senaryo);


        if (senaryo.isFailed()) {
            TakesScreenshot ts = ((TakesScreenshot) BaseDriver.getDriver());
            byte[] hafizadakiHali = ts.getScreenshotAs(OutputType.BYTES);
            senaryo.attach(hafizadakiHali, "image/png", "screenshot name");
        }

        BaseDriver.quitDriver();
    }
}
