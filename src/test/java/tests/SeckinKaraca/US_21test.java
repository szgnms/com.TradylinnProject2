package tests.SeckinKaraca;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.SeckinKaraca.US_21page;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import static pages.SuleYalcin.US_018page.refundRequestReason;

public class US_21test {
    public US_21test() {

    }
    @Test
    public void yillikRapor() {
        ReusableMethods.tradylinnStoreManager();
        ReusableMethods.bekle();
        JavascriptExecutor jse=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true)",US_21page.raporlar);
        ReusableMethods.bekle();
        jse.executeScript("arguments[0].click(true)",US_21page.raporlar);
        ReusableMethods.bekle();






    }
}
