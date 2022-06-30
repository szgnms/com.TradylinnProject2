package tests.EmreKarasu;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.TradylinnPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

import static utilities.ReusableMethods.bekle;

public class US_009Test extends Driver {
    TradylinnPage trd =new TradylinnPage();


    @Test
    public void TC_001_ve_TC_002() throws InterruptedException {
                        //TC_001
        ReusableMethods.tradylinnStoreManager();
        bekle(5);

        JavascriptExecutor js1 = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js1.executeScript("window.scrollBy(0,250)");
        trd.urun.click();
        Thread.sleep(5000);

        trd.yeniEkle.click();
        Thread.sleep(5000);

        JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js2.executeScript("window.scrollBy(0,1100)");
        trd.shipping.click();
        Thread.sleep(2000);

        trd.weight.click();
        trd.weight.sendKeys("10");

        trd.length.click();
        trd.length.sendKeys("15");

        trd.width.click();
        trd.width.sendKeys("20");

        trd.height.click();
        trd.height.sendKeys("25");

                        //TC_002
        Select select = new Select(trd.ddPTime);
        List<WebElement> processingTime = select.getOptions();
        for (WebElement each : processingTime
        ) {
            each.click();
            System.out.println(each.getText());
        }
    }
}
