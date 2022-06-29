package tests.SuleYalcin;

import org.openqa.selenium.*;
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

import java.util.ArrayList;

import static org.openqa.selenium.Keys.PAGE_DOWN;
import static pages.SuleYalcin.US_018page.*;
import static utilities.ReusableMethods.bekle;
import static utilities.ReusableMethods.hover;

public class US_018test extends TestBaseRapor{
Actions act = new Actions(Driver.getDriver());
    public US_018test() {

    }

    @Test
    public void geriIade() throws InterruptedException {
        ReusableMethods.tradylinnStoreManager();
        bekle();
        Thread.sleep(10000);
        act.sendKeys(Keys.TAB).
        sendKeys(Keys.TAB).
        sendKeys(Keys.TAB).
        sendKeys(Keys.TAB).
        sendKeys(Keys.TAB).
        sendKeys(Keys.TAB).
        sendKeys(Keys.TAB).
        sendKeys(Keys.TAB).
        sendKeys(Keys.TAB).
        sendKeys(Keys.TAB).
        sendKeys(Keys.TAB).
        sendKeys(Keys.TAB).
        sendKeys(Keys.TAB).
        sendKeys(Keys.TAB).
        sendKeys(Keys.TAB).
        sendKeys(Keys.TAB).
        sendKeys(Keys.TAB).
        sendKeys(Keys.TAB).
        sendKeys(Keys.TAB).
        sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        bekle();
        bekle();
        bekle();
        bekle();
        bekle();
        bekle();
        bekle();
        bekle();
        bekle();
        bekle();
        ArrayList <WebElement> refreq =new ArrayList<>(Driver.getDriver().findElements(By.xpath("(//*[@id='wcfm-orders']//td)//a")));
       if (refreq.get(3).isDisplayed()){
           refreq.get(3).click();
            Driver.getDriver().switchTo().alert().accept();
            bekle();
            bekle();
            bekle();
            bekle();
            bekle();
            bekle();
            bekle();
            bekle();
            bekle();
            bekle();
        }

        refreq.get(3).click();
        bekle();
        bekle();
        ArrayList <WebElement> qty =new ArrayList<>(Driver.getDriver().findElements(By.xpath("//tbody//tr[1]//td[3]//select[1]//option")));
        qty.get(1).click();
        act.sendKeys(Keys.TAB).
        sendKeys(Keys.TAB)
       .sendKeys("Begenmedim");
        bekle();
        bekle();
        act.sendKeys(Keys.TAB).sendKeys(Keys.SPACE).perform();

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
        bekle();
        bekle();
        bekle();
        bekle();
        bekle();
        act.sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        bekle();
        bekle();
        bekle();
        ArrayList<WebElement>refRegTable = new ArrayList<>(Driver.getDriver().findElements(By.xpath("(//*[@id='wcfm-refund-requests']//tr)[1]//th")));
        SoftAssert sf=new SoftAssert();
        for (WebElement w:refRegTable
             ) {
            sf.assertTrue(w.isDisplayed());
        }

        sf.assertAll();



       /* jse.executeScript("arguments[0].scrollIntoView(true);", requestId);
        bekle();*/

    }
}