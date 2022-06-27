package tests.SeckinKaraca;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.SeckinKaraca.US_21page;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import static pages.SuleYalcin.US_018page.refundRequestReason;

public class US_21test {
    US_21page us_21page=new US_21page();
    @Test
    public void yillikRapor() {
        ReusableMethods.tradylinnStoreManager();
        ReusableMethods.bekle();
        //JavascriptExecutor jse=(JavascriptExecutor) Driver.getDriver();
        //jse.executeScript("arguments[0].scrollIntoView(true)",US_21page.raporlar);
        // ReusableMethods.bekle();
        //jse.executeScript("arguments[0].click(true)",US_21page.raporlar);
        //ReusableMethods.bekle();
        ReusableMethods.sayfaAltı();
        ReusableMethods.bekle();
        us_21page.raporlar.click();
        ReusableMethods.bekle();
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(us_21page.yillikRapor).sendKeys(Keys.ENTER);
        ReusableMethods.bekle();











    }
}
