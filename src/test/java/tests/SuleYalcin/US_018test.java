package tests.SuleYalcin;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.SuleYalcin.US_018page;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import static org.openqa.selenium.Keys.PAGE_DOWN;
import static pages.SuleYalcin.US_018page.*;
import static utilities.ReusableMethods.bekle;
import static utilities.ReusableMethods.hover;

public class US_018test extends TestBaseRapor{

    public US_018test() {

    }

    @Test
    public void geriIade() throws InterruptedException {
        ReusableMethods.tradylinnStoreManager();
        bekle();
        Thread.sleep(10000);
        US_018page.emirlerLinki.click();
        bekle();
        refundRequestReason.click();
        bekle();
        hover(qty);

        US_018page.qty.sendKeys("1");
        refundRequestReason.sendKeys("Begenmedim");
        submit.click();

/*
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        bekle();
        jse.executeScript("arguments[0].scrollIntoView(true);", refundRequestReason);
        bekle();
        jse.executeScript("arguments[0].click();",refundRequestReason);
        bekle();
        refundRequestReason.sendKeys("Begenmedim");
        US_018page.submit.click();
        bekle();  */

        hover(geriOdemeButonu);

        geriOdemeButonu.click();
        bekle();
        hover(requestId);

        SoftAssert sf=new SoftAssert();

        sf.assertTrue(US_018page.orderId.isDisplayed());
        sf.assertTrue(US_018page.amount.isDisplayed());
        sf.assertTrue(US_018page.type.isDisplayed());
        sf.assertTrue(US_018page.reasonText.isDisplayed());
        sf.assertAll();



       /* jse.executeScript("arguments[0].scrollIntoView(true);", requestId);
        bekle();*/

    }
}