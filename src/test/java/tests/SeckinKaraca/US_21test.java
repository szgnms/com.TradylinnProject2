package tests.SeckinKaraca;

import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SeckinKaraca.US_21page;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import static pages.SuleYalcin.US_018page.refundRequestReason;

public class US_21test {
    US_21page us_21page=new US_21page();
    @Test
    public void testCase01() {
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
        //Actions actions=new Actions(Driver.getDriver());
        //actions.moveToElement(us_21page.yillikRapor).perform(); (bunlar calismadi)
        ReusableMethods.birAsagi();
        ReusableMethods.bekle();
        ReusableMethods.birAsagi();
        ReusableMethods.bekle();
        ReusableMethods.birAsagi();
        ReusableMethods.bekle();
        us_21page.yillikRapor.click();
        ReusableMethods.bekle();
        ReusableMethods.birAsagi();
        ReusableMethods.bekle();
        ReusableMethods.birAsagi();
        ReusableMethods.bekle();
        Assert.assertTrue(us_21page.yillikRapor.isEnabled());
        ReusableMethods.bekle();


        Driver.closeDriver();

    }

    @Test
    public void testCase02() {
        ReusableMethods.tradylinnStoreManager();
        ReusableMethods.bekle();
        ReusableMethods.sayfaAltı();
        ReusableMethods.bekle();
        us_21page.raporlar.click();
        ReusableMethods.bekle();
        ReusableMethods.birAsagi();
        ReusableMethods.bekle();
        ReusableMethods.birAsagi();
        ReusableMethods.bekle();
        ReusableMethods.birAsagi();
        ReusableMethods.bekle();
        us_21page.enSonAy.click();
        ReusableMethods.bekle();
        ReusableMethods.birAsagi();
        ReusableMethods.bekle();
        ReusableMethods.birAsagi();
        ReusableMethods.bekle();
        Assert.assertTrue(us_21page.enSonAy.isEnabled());
        ReusableMethods.bekle();

        Driver.closeDriver();

    }
    @Test
    public void testCace03(){
        ReusableMethods.tradylinnStoreManager();
        ReusableMethods.bekle();
        ReusableMethods.sayfaAltı();
        ReusableMethods.bekle();
        us_21page.raporlar.click();
        ReusableMethods.bekle();
        ReusableMethods.birAsagi();
        ReusableMethods.bekle();
        ReusableMethods.birAsagi();
        ReusableMethods.bekle();
        ReusableMethods.birAsagi();
        ReusableMethods.bekle();
        us_21page.buAy.click();
        ReusableMethods.bekle();
        ReusableMethods.birAsagi();
        ReusableMethods.bekle();
        ReusableMethods.birAsagi();
        ReusableMethods.bekle();
        Assert.assertTrue(us_21page.buAy.isEnabled());
        ReusableMethods.bekle();

        Driver.closeDriver();

    }
    @Test
    public void testCase04() {
        ReusableMethods.tradylinnStoreManager();
        ReusableMethods.bekle();
        ReusableMethods.sayfaAltı();
        ReusableMethods.bekle();
        us_21page.raporlar.click();
        ReusableMethods.bekle();
        ReusableMethods.birAsagi();
        ReusableMethods.bekle();
        ReusableMethods.birAsagi();
        ReusableMethods.bekle();
        ReusableMethods.birAsagi();
        ReusableMethods.bekle();
        us_21page.sonYediGün.click();
        ReusableMethods.bekle();
        ReusableMethods.birAsagi();
        ReusableMethods.bekle();
        ReusableMethods.birAsagi();
        ReusableMethods.bekle();
        Assert.assertTrue(us_21page.sonYediGün.isEnabled());
        ReusableMethods.bekle();

        Driver.closeDriver();

    }

    @Test
    public void testCase05() {
        ReusableMethods.tradylinnStoreManager();
        ReusableMethods.bekle();
        ReusableMethods.sayfaAltı();
        ReusableMethods.bekle();
        us_21page.raporlar.click();
        ReusableMethods.bekle();
        ReusableMethods.birAsagi();
        ReusableMethods.bekle();
        ReusableMethods.birAsagi();
        ReusableMethods.bekle();
        ReusableMethods.birAsagi();
        ReusableMethods.bekle();
        Assert.assertTrue(us_21page.birGünsec.isEnabled());
        ReusableMethods.bekle();
        us_21page.birGünsec.click();
        ReusableMethods.bekle();
        ReusableMethods.sayfaAltı();
        ReusableMethods.bekle();
        us_21page.ikiHaziran.click();
        us_21page.onAltiHaziran.click();
        ReusableMethods.bekle();
        String expectedYaziElementi="Sales by Date - From 2022-06-02 to 2022-06-16";
        String actuelYaziElementi=us_21page.yazıElementi.getText();
        Assert.assertTrue(actuelYaziElementi.equals(expectedYaziElementi));
        ReusableMethods.bekle();

        Driver.closeDriver();
    }
}
